package org.demo.core.job;

import de.hybris.platform.commerceservices.setup.SetupSyncJobService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;
import org.demo.core.dao.DemoProductDao;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static de.hybris.platform.catalog.enums.ArticleApprovalStatus.*;

public class ApprovalJobPerformable extends AbstractJobPerformable<CronJobModel> {

    @Resource
    ModelService modelService;
    @Resource
    DemoProductDao demoProductDao;
    @Resource
    private SetupSyncJobService setupSyncJobService;
    private static final Logger LOG = Logger.getLogger(ApprovalJobPerformable.class);
    private static final String PRODUCT_CATALOG = "demoGroup2ProductCatalog";
    private static final String CONTENT_CATALOG = "demoGroup2ContentCatalog";

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        List<ProductModel> productModelList = demoProductDao.getAllProduct();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        try {
            if (null != productModelList) {
                for (ProductModel productModel : productModelList) {
                    LOG.info(productModel.getApprovalStatus());
                    approvalProduct(productModel);
                }
                LOG.info("sync start at" + dtf.format(now));
                setupSyncJobService.createProductCatalogSyncJob(PRODUCT_CATALOG);
                setupSyncJobService.executeCatalogSyncJob(PRODUCT_CATALOG);
                setupSyncJobService.createProductCatalogSyncJob(CONTENT_CATALOG);
                setupSyncJobService.executeCatalogSyncJob(CONTENT_CATALOG);
            }
        } catch (Error err) {
            LOG.error(err);
        }
        LOG.info("----- Demo Group 2 -----");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private void approvalProduct(ProductModel product) {
        if (null != product) {
            product.setApprovalStatus(APPROVED);
            modelService.save(product);
        }
    }
}
