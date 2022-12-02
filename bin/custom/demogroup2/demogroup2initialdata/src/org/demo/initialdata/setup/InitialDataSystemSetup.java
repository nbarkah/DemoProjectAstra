/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.initialdata.setup;

import de.hybris.platform.commerceservices.dataimport.impl.CoreDataImportService;
import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.commerceservices.setup.data.ImportData;
import de.hybris.platform.commerceservices.setup.events.CoreDataImportedEvent;
import de.hybris.platform.commerceservices.setup.events.SampleDataImportedEvent;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;
import de.hybris.platform.util.Config;
import org.apache.commons.lang.StringUtils;
import org.demo.initialdata.constants.Demogroup2InitialDataConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * This class provides hooks into the system's initialization and update processes.
 */
@SystemSetup(extension = Demogroup2InitialDataConstants.EXTENSIONNAME)
public class InitialDataSystemSetup extends AbstractSystemSetup
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(InitialDataSystemSetup.class);

	private static final String DEMOGROUP2 = "demoGroup2";

	private static final String DEMO_GROUP_2_CORE_DATA_IMPEXES = "demogroup2initialdata.coredata.impexes";

	private static final String DEMO_GROUP_2_SAMPLE_DATA_IMPEXES = "demogroup2initialdata.sampledata.impexes";


	private static final String IMPORT_CORE_DATA = "importCoreData";
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";
	private static final String ACTIVATE_SOLR_CRON_JOBS = "activateSolrCronJobs";

	private CoreDataImportService coreDataImportService;
	private SampleDataImportService sampleDataImportService;

	/**
	 * Generates the Dropdown and Multi-select boxes for the project data import
	 */
	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();

		params.add(createBooleanSystemSetupParameter(IMPORT_CORE_DATA, "Import Core Data", true));
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
		params.add(createBooleanSystemSetupParameter(ACTIVATE_SOLR_CRON_JOBS, "Activate Solr Cron Jobs", true));
		// Add more Parameters here as you require

		return params;
	}

	/**
	 * Implement this method to create initial objects. This method will be called by system creator during
	 * initialization and system update. Be sure that this method can be called repeatedly.
	 * 
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		// Add Essential Data here as you require
	}

	/**
	 * Implement this method to create data that is used in your project. This method will be called during the system
	 * initialization. <br>
	 * Add import data for each site you have configured
	 *
	 * <pre>
	 * final List<ImportData> importData = new ArrayList<ImportData>();
	 *
	 * final ImportData sampleImportData = new ImportData();
	 * sampleImportData.setProductCatalogName(SAMPLE_PRODUCT_CATALOG_NAME);
	 * sampleImportData.setContentCatalogNames(Arrays.asList(SAMPLE_CONTENT_CATALOG_NAME));
	 * sampleImportData.setStoreNames(Arrays.asList(SAMPLE_STORE_NAME));
	 * importData.add(sampleImportData);
	 *
	 * getCoreDataImportService().execute(this, context, importData);
	 * getEventService().publishEvent(new CoreDataImportedEvent(context, importData));
	 *
	 * getSampleDataImportService().execute(this, context, importData);
	 * getEventService().publishEvent(new SampleDataImportedEvent(context, importData));
	 * </pre>
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{
		/*
		 * Add import data for each site you have configured
		 */

		LOG.info("::: Demo Group 2 Project Data Update. :::");
		final List<ImportData> importData = new ArrayList<>();

		final ImportData sampleImportData = new ImportData();
		sampleImportData.setProductCatalogName(DEMOGROUP2);
		sampleImportData.setContentCatalogNames(Arrays.asList(DEMOGROUP2));
		sampleImportData.setStoreNames(Arrays.asList(DEMOGROUP2));
		importData.add(sampleImportData);

		// Core data
		final boolean importCoreData = getBooleanSystemSetupParameter(context, IMPORT_CORE_DATA);
		if (importCoreData) {
			getCoreDataImportService().execute(this, context, importData);

			importTrainingCoreData(context);

			getEventService().publishEvent(new CoreDataImportedEvent(context, importData));
			getCoreDataImportService().synchronizeContentCatalog(this, context, DEMOGROUP2, true);
			getCoreDataImportService().synchronizeProductCatalog(this, context, DEMOGROUP2, true);
		}

		// Sample data
		final boolean importSampleData = getBooleanSystemSetupParameter(context, IMPORT_SAMPLE_DATA);
		if (importSampleData) {
			getSampleDataImportService().execute(this, context, importData);

			importTrainingSampleData(context);

			getEventService().publishEvent(new SampleDataImportedEvent(context, importData));
			getSampleDataImportService().synchronizeContentCatalog(this, context, DEMOGROUP2, true);
			getSampleDataImportService().synchronizeProductCatalog(this, context, DEMOGROUP2, true);
		}
	}

//	@SystemSetup(type = Type.PROJECT, process = Process.ALL)
//	public void createProjectData(final SystemSetupContext context)
//	{
//		final List<ImportData> importData = new ArrayList<>();
//		final ImportData astramotorImportData = new ImportData();
//		astramotorImportData.setProductCatalogName(DEMOGROUP2);
//		astramotorImportData.setContentCatalogNames(Arrays.asList(DEMOGROUP2));
//		astramotorImportData.setStoreNames(Arrays.asList(DEMOGROUP2));
//		importData.add(astramotorImportData);
//		getCoreDataImportService().execute(this, context, importData);
//		importAdditionalData(context, DEMO_GROUP_2_CORE_DATA_IMPEXES, "coredata");
//		getEventService().publishEvent(new CoreDataImportedEvent(context, importData));
//		getSampleDataImportService().execute(this, context, importData);
//		importAdditionalData(context, DEMO_GROUP_2_SAMPLE_DATA_IMPEXES, "sampledata");
//		getEventService().publishEvent(new SampleDataImportedEvent(context, importData));

//		LOG.info("Synchronize product catalog");
//		AstraSyncAndIndexHelper.synchronizeCatalog(Config.getParameter("astra.motor.product.catalog.name"), null);
//		LOG.info("Synchronize content catalog");
//		AstraSyncAndIndexHelper.synchronizeCatalog(Config.getParameter("astra.motor.content.catalog.name"), null);
//
//		LOG.info("Indexing product");
//		SolrIndexerCronJobModel solrIndexerCronJobProduct = AstraSyncAndIndexHelper
//				.buildSolrIndexerCronjob(IndexerOperationValues.FULL,
//						Config.getParameter("mango.product.index.name"));
//		AstraSyncAndIndexHelper.doSolrIndex(solrIndexerCronJobProduct);
//		LOG.info("Indexing article");
//		SolrIndexerCronJobModel solrIndexerCronJobArticle = AstraSyncAndIndexHelper
//				.buildSolrIndexerCronjob(IndexerOperationValues.FULL,
//						Config.getParameter("mango.article.index.name"));
//		AstraSyncAndIndexHelper.doSolrIndex(solrIndexerCronJobArticle);
//		LOG.info("Indexing credit simulator");
//		SolrIndexerCronJobModel solrIndexerCronJobCreditSimulator = AstraSyncAndIndexHelper
//				.buildSolrIndexerCronjob(IndexerOperationValues.FULL,
//						Config.getParameter("mango.creditsimulator.index.name"));
//		AstraSyncAndIndexHelper.doSolrIndex(solrIndexerCronJobCreditSimulator);
//	}

//	protected void importAdditionalData(final SystemSetupContext context, final String impexConfig, final String dataType) {
//		final String extensionName = context.getExtensionName();
//		final String impexFiles = Config.getParameter(impexConfig);
//		if (StringUtils.isNotBlank(impexFiles)) {
//			final String[] impexFileArray = impexFiles.split(",");
//			for (final String impexFile : impexFileArray) {
//				if (impexFile != null) {
//					getSetupImpexService().importImpexFile(
//							String.format("/%s/import/%s/common/%s",
//									extensionName, dataType, impexFile), false);
//					getSetupImpexService().importImpexFile(String.format("/%s/import/%s/contentCatalogs/catalogName/%s",
//							extensionName, dataType, impexFile), false);
//					getSetupImpexService().importImpexFile(String.format("/%s/import/%s/productCatalogs/catalogName/%s",
//							extensionName, dataType,  impexFile), false);
//					getSetupImpexService().importImpexFile(
//							String.format("/%s/import/%s/stores/storeName/%s",
//									extensionName, dataType, impexFile), false);
//				}
//			}
//		}
//	}

	/**
	 * Custom method to import the demo group 2 core data.
	 *
	 * @param context context
	 */
	private void importTrainingCoreData(final SystemSetupContext context) {
		final String extensionName = context.getExtensionName();
		final String impexFiles = Config.getParameter(DEMO_GROUP_2_CORE_DATA_IMPEXES);
		if (impexFiles != null) {
			final String[] impexFileArray = impexFiles.split(",");
			for (final String impexFile : impexFileArray) {
				if (impexFile != null) {
					getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/%s",
							extensionName, impexFile), false);
					getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/contentCatalogs/catalogName/%s",
							extensionName, impexFile), false);
					getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/productCatalogs/catalogName/%s",
							extensionName, impexFile), false);
					getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/stores/storeName/%s",
							extensionName, impexFile), false);
				}
			}
		}
	}

	/**
	 * Custom method to import the demo group 2 sample data.
	 *
	 * @param context the context
	 */
	private void importTrainingSampleData(final SystemSetupContext context) {
		final String extensionName = context.getExtensionName();
		final String impexFiles = Config.getParameter(DEMO_GROUP_2_SAMPLE_DATA_IMPEXES);
		if (impexFiles != null) {
			final String[] impexFileArray = impexFiles.split(",");
			for (final String impexFile : impexFileArray) {
				if (impexFile != null) {
					getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/catalogName/%s",
							extensionName, impexFile), false);
					getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/productCatalogs/catalogName/%s",
							extensionName, impexFile), false);
					getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/stores/storeName/%s",
							extensionName, impexFile), false);

				}
			}
		}
	}

	public CoreDataImportService getCoreDataImportService()
	{
		return coreDataImportService;
	}

	@Required
	public void setCoreDataImportService(final CoreDataImportService coreDataImportService)
	{
		this.coreDataImportService = coreDataImportService;
	}

	public SampleDataImportService getSampleDataImportService()
	{
		return sampleDataImportService;
	}

	@Required
	public void setSampleDataImportService(final SampleDataImportService sampleDataImportService)
	{
		this.sampleDataImportService = sampleDataImportService;
	}
}
