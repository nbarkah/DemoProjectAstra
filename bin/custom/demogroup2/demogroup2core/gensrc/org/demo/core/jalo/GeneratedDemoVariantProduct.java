/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 Des 2022 14.10.13                         ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;
import org.demo.core.jalo.DemoSizeProduct;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct DemoVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>DemoVariantProduct.sizeDimension</code> attribute **/
	public static final String SIZEDIMENSION = "sizeDimension";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SIZEDIMENSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.sizeDimension</code> attribute.
	 * @return the sizeDimension - Size Dimension Product
	 */
	public DemoSizeProduct getSizeDimension(final SessionContext ctx)
	{
		return (DemoSizeProduct)getProperty( ctx, SIZEDIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.sizeDimension</code> attribute.
	 * @return the sizeDimension - Size Dimension Product
	 */
	public DemoSizeProduct getSizeDimension()
	{
		return getSizeDimension( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeDimension</code> attribute. 
	 * @param value the sizeDimension - Size Dimension Product
	 */
	public void setSizeDimension(final SessionContext ctx, final DemoSizeProduct value)
	{
		setProperty(ctx, SIZEDIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeDimension</code> attribute. 
	 * @param value the sizeDimension - Size Dimension Product
	 */
	public void setSizeDimension(final DemoSizeProduct value)
	{
		setSizeDimension( getSession().getSessionContext(), value );
	}
	
}
