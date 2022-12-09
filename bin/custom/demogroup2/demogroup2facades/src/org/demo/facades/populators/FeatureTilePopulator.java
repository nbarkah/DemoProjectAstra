package org.demo.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.demo.core.model.FeatureTileComponentModel;
import org.demo.core.model.HomepageFeaturesComponentModel;
import org.demo.facades.homepage.data.FeatureTileData;
import org.demo.facades.homepage.data.HomepageFeaturesData;

public class FeatureTilePopulator implements Populator<FeatureTileComponentModel, FeatureTileData> {

    @Override
    public void populate(FeatureTileComponentModel source, FeatureTileData target) throws ConversionException {
        target.setTitle(source.getTitle());
        target.setSubtitle(source.getSubtitle());
        target.setDescription(source.getDescription());
    }
}
