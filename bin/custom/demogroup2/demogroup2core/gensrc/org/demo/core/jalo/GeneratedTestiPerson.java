/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 7, 2022, 2:29:53 PM                     ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;
import org.demo.core.jalo.Testimoni;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TestiPerson}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestiPerson extends GenericItem
{
	/** Qualifier of the <code>TestiPerson.idPerson</code> attribute **/
	public static final String IDPERSON = "idPerson";
	/** Qualifier of the <code>TestiPerson.personName</code> attribute **/
	public static final String PERSONNAME = "personName";
	/** Qualifier of the <code>TestiPerson.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>TestiPerson.testimoni</code> attribute **/
	public static final String TESTIMONI = "testimoni";
	/**
	* {@link OneToManyHandler} for handling 1:n TESTIMONI's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Testimoni> TESTIMONIHANDLER = new OneToManyHandler<Testimoni>(
	Demogroup2CoreConstants.TC.TESTIMONI,
	false,
	"person",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(IDPERSON, AttributeMode.INITIAL);
		tmp.put(PERSONNAME, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.idPerson</code> attribute.
	 * @return the idPerson
	 */
	public Integer getIdPerson(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IDPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.idPerson</code> attribute.
	 * @return the idPerson
	 */
	public Integer getIdPerson()
	{
		return getIdPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @return the idPerson
	 */
	public int getIdPersonAsPrimitive(final SessionContext ctx)
	{
		Integer value = getIdPerson( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @return the idPerson
	 */
	public int getIdPersonAsPrimitive()
	{
		return getIdPersonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @param value the idPerson
	 */
	public void setIdPerson(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IDPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @param value the idPerson
	 */
	public void setIdPerson(final Integer value)
	{
		setIdPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @param value the idPerson
	 */
	public void setIdPerson(final SessionContext ctx, final int value)
	{
		setIdPerson( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.idPerson</code> attribute. 
	 * @param value the idPerson
	 */
	public void setIdPerson(final int value)
	{
		setIdPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.personName</code> attribute.
	 * @return the personName
	 */
	public String getPersonName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERSONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.personName</code> attribute.
	 * @return the personName
	 */
	public String getPersonName()
	{
		return getPersonName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.personName</code> attribute. 
	 * @param value the personName
	 */
	public void setPersonName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERSONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.personName</code> attribute. 
	 * @param value the personName
	 */
	public void setPersonName(final String value)
	{
		setPersonName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.rating</code> attribute.
	 * @return the rating
	 */
	public EnumerationValue getRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.rating</code> attribute.
	 * @return the rating
	 */
	public EnumerationValue getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final EnumerationValue value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.testimoni</code> attribute.
	 * @return the testimoni
	 */
	public Collection<Testimoni> getTestimoni(final SessionContext ctx)
	{
		return TESTIMONIHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestiPerson.testimoni</code> attribute.
	 * @return the testimoni
	 */
	public Collection<Testimoni> getTestimoni()
	{
		return getTestimoni( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.testimoni</code> attribute. 
	 * @param value the testimoni
	 */
	public void setTestimoni(final SessionContext ctx, final Collection<Testimoni> value)
	{
		TESTIMONIHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestiPerson.testimoni</code> attribute. 
	 * @param value the testimoni
	 */
	public void setTestimoni(final Collection<Testimoni> value)
	{
		setTestimoni( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to testimoni. 
	 * @param value the item to add to testimoni
	 */
	public void addToTestimoni(final SessionContext ctx, final Testimoni value)
	{
		TESTIMONIHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to testimoni. 
	 * @param value the item to add to testimoni
	 */
	public void addToTestimoni(final Testimoni value)
	{
		addToTestimoni( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from testimoni. 
	 * @param value the item to remove from testimoni
	 */
	public void removeFromTestimoni(final SessionContext ctx, final Testimoni value)
	{
		TESTIMONIHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from testimoni. 
	 * @param value the item to remove from testimoni
	 */
	public void removeFromTestimoni(final Testimoni value)
	{
		removeFromTestimoni( getSession().getSessionContext(), value );
	}
	
}
