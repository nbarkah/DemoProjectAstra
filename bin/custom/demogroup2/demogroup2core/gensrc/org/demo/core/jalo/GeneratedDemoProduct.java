/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 2, 2022, 4:41:18 PM                     ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product DemoProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoProduct extends Product
{
	/** Qualifier of the <code>DemoProduct.brand</code> attribute **/
	public static final String BRAND = "brand";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BRAND, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.brand</code> attribute.
	 * @return the brand - Is Brand Product
	 */
	public String getBrand(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.brand</code> attribute.
	 * @return the brand - Is Brand Product
	 */
	public String getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.brand</code> attribute. 
	 * @param value the brand - Is Brand Product
	 */
	public void setBrand(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.brand</code> attribute. 
	 * @param value the brand - Is Brand Product
	 */
	public void setBrand(final String value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
}
