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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Testimoni}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestimoni extends GenericItem
{
	/** Qualifier of the <code>Testimoni.idTestimoni</code> attribute **/
	public static final String IDTESTIMONI = "idTestimoni";
	/** Qualifier of the <code>Testimoni.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Testimoni.heading</code> attribute **/
	public static final String HEADING = "heading";
	/** Qualifier of the <code>Testimoni.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>Testimoni.message</code> attribute **/
	public static final String MESSAGE = "message";
	/** Qualifier of the <code>Testimoni.date</code> attribute **/
	public static final String DATE = "date";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(IDTESTIMONI, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(HEADING, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.date</code> attribute.
	 * @return the date
	 */
	public String getDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.date</code> attribute.
	 * @return the date
	 */
	public String getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final String value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.heading</code> attribute.
	 * @return the heading
	 */
	public String getHeading(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.heading</code> attribute.
	 * @return the heading
	 */
	public String getHeading()
	{
		return getHeading( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.heading</code> attribute. 
	 * @param value the heading
	 */
	public void setHeading(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.heading</code> attribute. 
	 * @param value the heading
	 */
	public void setHeading(final String value)
	{
		setHeading( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTestimoni</code> attribute.
	 * @return the idTestimoni
	 */
	public Integer getIdTestimoni(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IDTESTIMONI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTestimoni</code> attribute.
	 * @return the idTestimoni
	 */
	public Integer getIdTestimoni()
	{
		return getIdTestimoni( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @return the idTestimoni
	 */
	public int getIdTestimoniAsPrimitive(final SessionContext ctx)
	{
		Integer value = getIdTestimoni( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @return the idTestimoni
	 */
	public int getIdTestimoniAsPrimitive()
	{
		return getIdTestimoniAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @param value the idTestimoni
	 */
	public void setIdTestimoni(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IDTESTIMONI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @param value the idTestimoni
	 */
	public void setIdTestimoni(final Integer value)
	{
		setIdTestimoni( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @param value the idTestimoni
	 */
	public void setIdTestimoni(final SessionContext ctx, final int value)
	{
		setIdTestimoni( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTestimoni</code> attribute. 
	 * @param value the idTestimoni
	 */
	public void setIdTestimoni(final int value)
	{
		setIdTestimoni( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.message</code> attribute.
	 * @return the message
	 */
	public String getMessage()
	{
		return getMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final String value)
	{
		setMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.rating</code> attribute.
	 * @return the rating
	 */
	public EnumerationValue getRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.rating</code> attribute.
	 * @return the rating
	 */
	public EnumerationValue getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final EnumerationValue value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
}
