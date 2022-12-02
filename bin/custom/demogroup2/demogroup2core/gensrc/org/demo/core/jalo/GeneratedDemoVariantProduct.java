/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 2, 2022, 7:47:55 AM                     ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct DemoVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>DemoVariantProduct.sizeDimension</code> attribute **/
	public static final String SIZEDIMENSION = "sizeDimension";
	/** Qualifier of the <code>DemoVariantProduct.sizeType</code> attribute **/
	public static final String SIZETYPE = "sizeType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SIZEDIMENSION, AttributeMode.INITIAL);
		tmp.put(SIZETYPE, AttributeMode.INITIAL);
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
	public String getSizeDimension(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SIZEDIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.sizeDimension</code> attribute.
	 * @return the sizeDimension - Size Dimension Product
	 */
	public String getSizeDimension()
	{
		return getSizeDimension( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeDimension</code> attribute. 
	 * @param value the sizeDimension - Size Dimension Product
	 */
	public void setSizeDimension(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SIZEDIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeDimension</code> attribute. 
	 * @param value the sizeDimension - Size Dimension Product
	 */
	public void setSizeDimension(final String value)
	{
		setSizeDimension( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.sizeType</code> attribute.
	 * @return the sizeType - Size Type Product
	 */
	public EnumerationValue getSizeType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SIZETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.sizeType</code> attribute.
	 * @return the sizeType - Size Type Product
	 */
	public EnumerationValue getSizeType()
	{
		return getSizeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeType</code> attribute. 
	 * @param value the sizeType - Size Type Product
	 */
	public void setSizeType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SIZETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.sizeType</code> attribute. 
	 * @param value the sizeType - Size Type Product
	 */
	public void setSizeType(final EnumerationValue value)
	{
		setSizeType( getSession().getSessionContext(), value );
	}
	
}
