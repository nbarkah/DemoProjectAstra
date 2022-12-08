package org.demo.facades.populators;

import de.hybris.platform.catalog.model.CatalogUnawareMediaModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.demo.core.model.HomepageFeaturesComponentModel;
import org.demo.facades.homepage.data.HomepageFeaturesData;

public class HomepageFeaturesPopulator implements Populator<HomepageFeaturesComponentModel, HomepageFeaturesData> {
    @Override
    public void populate(HomepageFeaturesComponentModel source, HomepageFeaturesData target) throws ConversionException {
        target.setTitle(source.getTitle());
        target.setSubtitle(source.getSubtitle());
    }
}
