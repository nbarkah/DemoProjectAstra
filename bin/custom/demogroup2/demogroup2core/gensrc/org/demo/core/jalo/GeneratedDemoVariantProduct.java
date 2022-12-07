/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 7 Des 2022 08.04.02                         ---
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
	/** Qualifier of the <code>DemoVariantProduct.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>DemoVariantProduct.sizeDimension</code> attribute **/
	public static final String SIZEDIMENSION = "sizeDimension";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(SIZEDIMENSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.height</code> attribute.
	 * @return the height - Is Height Product
	 */
	public String getHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.height</code> attribute.
	 * @return the height - Is Height Product
	 */
	public String getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.height</code> attribute. 
	 * @param value the height - Is Height Product
	 */
	public void setHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.height</code> attribute. 
	 * @param value the height - Is Height Product
	 */
	public void setHeight(final String value)
	{
		setHeight( getSession().getSessionContext(), value );
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
