/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 Des 2022 08.41.52                         ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DemoSizeProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoSizeProduct extends GenericItem
{
	/** Qualifier of the <code>DemoSizeProduct.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>DemoSizeProduct.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>DemoSizeProduct.dimension</code> attribute **/
	public static final String DIMENSION = "dimension";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DIMENSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.code</code> attribute.
	 * @return the code - Size Code Product
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.code</code> attribute.
	 * @return the code - Size Code Product
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.code</code> attribute. 
	 * @param value the code - Size Code Product
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.code</code> attribute. 
	 * @param value the code - Size Code Product
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.dimension</code> attribute.
	 * @return the dimension - Size Dimension Product
	 */
	public String getDimension(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.dimension</code> attribute.
	 * @return the dimension - Size Dimension Product
	 */
	public String getDimension()
	{
		return getDimension( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.dimension</code> attribute. 
	 * @param value the dimension - Size Dimension Product
	 */
	public void setDimension(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.dimension</code> attribute. 
	 * @param value the dimension - Size Dimension Product
	 */
	public void setDimension(final String value)
	{
		setDimension( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.name</code> attribute.
	 * @return the name - Size Name Product
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoSizeProduct.name</code> attribute.
	 * @return the name - Size Name Product
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.name</code> attribute. 
	 * @param value the name - Size Name Product
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoSizeProduct.name</code> attribute. 
	 * @param value the name - Size Name Product
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
