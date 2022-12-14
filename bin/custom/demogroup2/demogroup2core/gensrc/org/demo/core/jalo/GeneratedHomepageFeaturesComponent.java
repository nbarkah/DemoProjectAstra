/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 9, 2022, 8:20:03 AM                     ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;
import org.demo.core.jalo.FeatureTileComponent;

/**
 * Generated class for type {@link org.demo.core.jalo.HomepageFeaturesComponent HomepageFeaturesComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHomepageFeaturesComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>HomepageFeaturesComponent.image</code> attribute **/
	public static final String IMAGE = "image";
	/** Qualifier of the <code>HomepageFeaturesComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>HomepageFeaturesComponent.subtitle</code> attribute **/
	public static final String SUBTITLE = "subtitle";
	/** Qualifier of the <code>HomepageFeaturesComponent.featureTiles</code> attribute **/
	public static final String FEATURETILES = "featureTiles";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(IMAGE, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(SUBTITLE, AttributeMode.INITIAL);
		tmp.put(FEATURETILES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.featureTiles</code> attribute.
	 * @return the featureTiles - list of feature tiles
	 */
	public List<FeatureTileComponent> getFeatureTiles(final SessionContext ctx)
	{
		List<FeatureTileComponent> coll = (List<FeatureTileComponent>)getProperty( ctx, FEATURETILES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.featureTiles</code> attribute.
	 * @return the featureTiles - list of feature tiles
	 */
	public List<FeatureTileComponent> getFeatureTiles()
	{
		return getFeatureTiles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.featureTiles</code> attribute. 
	 * @param value the featureTiles - list of feature tiles
	 */
	public void setFeatureTiles(final SessionContext ctx, final List<FeatureTileComponent> value)
	{
		setProperty(ctx, FEATURETILES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.featureTiles</code> attribute. 
	 * @param value the featureTiles - list of feature tiles
	 */
	public void setFeatureTiles(final List<FeatureTileComponent> value)
	{
		setFeatureTiles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.image</code> attribute.
	 * @return the image
	 */
	public Media getImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, IMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.image</code> attribute.
	 * @return the image
	 */
	public Media getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final Media value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.subtitle</code> attribute.
	 * @return the subtitle - sub title shown below the title
	 */
	public String getSubtitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.subtitle</code> attribute.
	 * @return the subtitle - sub title shown below the title
	 */
	public String getSubtitle()
	{
		return getSubtitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.subtitle</code> attribute. 
	 * @param value the subtitle - sub title shown below the title
	 */
	public void setSubtitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.subtitle</code> attribute. 
	 * @param value the subtitle - sub title shown below the title
	 */
	public void setSubtitle(final String value)
	{
		setSubtitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.title</code> attribute.
	 * @return the title - text on the header section
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HomepageFeaturesComponent.title</code> attribute.
	 * @return the title - text on the header section
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.title</code> attribute. 
	 * @param value the title - text on the header section
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HomepageFeaturesComponent.title</code> attribute. 
	 * @param value the title - text on the header section
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
