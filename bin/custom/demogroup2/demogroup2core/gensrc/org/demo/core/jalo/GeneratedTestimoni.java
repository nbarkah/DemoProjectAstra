/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 7 Des 2022 08.04.02                         ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.Demogroup2CoreConstants;
import org.demo.core.jalo.TestiPerson;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Testimoni}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestimoni extends GenericItem
{
	/** Qualifier of the <code>Testimoni.idTesti</code> attribute **/
	public static final String IDTESTI = "idTesti";
	/** Qualifier of the <code>Testimoni.headMsg</code> attribute **/
	public static final String HEADMSG = "headMsg";
	/** Qualifier of the <code>Testimoni.message</code> attribute **/
	public static final String MESSAGE = "message";
	/** Qualifier of the <code>Testimoni.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Testimoni.person</code> attribute **/
	public static final String PERSON = "person";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PERSON's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTestimoni> PERSONHANDLER = new BidirectionalOneToManyHandler<GeneratedTestimoni>(
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
		tmp.put(IDTESTI, AttributeMode.INITIAL);
		tmp.put(HEADMSG, AttributeMode.INITIAL);
		tmp.put(MESSAGE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(PERSON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PERSONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
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
	 * <i>Generated method</i> - Getter of the <code>Testimoni.headMsg</code> attribute.
	 * @return the headMsg
	 */
	public String getHeadMsg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADMSG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.headMsg</code> attribute.
	 * @return the headMsg
	 */
	public String getHeadMsg()
	{
		return getHeadMsg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.headMsg</code> attribute. 
	 * @param value the headMsg
	 */
	public void setHeadMsg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADMSG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.headMsg</code> attribute. 
	 * @param value the headMsg
	 */
	public void setHeadMsg(final String value)
	{
		setHeadMsg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTesti</code> attribute.
	 * @return the idTesti
	 */
	public Integer getIdTesti(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IDTESTI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTesti</code> attribute.
	 * @return the idTesti
	 */
	public Integer getIdTesti()
	{
		return getIdTesti( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTesti</code> attribute. 
	 * @return the idTesti
	 */
	public int getIdTestiAsPrimitive(final SessionContext ctx)
	{
		Integer value = getIdTesti( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.idTesti</code> attribute. 
	 * @return the idTesti
	 */
	public int getIdTestiAsPrimitive()
	{
		return getIdTestiAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTesti</code> attribute. 
	 * @param value the idTesti
	 */
	public void setIdTesti(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IDTESTI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTesti</code> attribute. 
	 * @param value the idTesti
	 */
	public void setIdTesti(final Integer value)
	{
		setIdTesti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTesti</code> attribute. 
	 * @param value the idTesti
	 */
	public void setIdTesti(final SessionContext ctx, final int value)
	{
		setIdTesti( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.idTesti</code> attribute. 
	 * @param value the idTesti
	 */
	public void setIdTesti(final int value)
	{
		setIdTesti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.message</code> attribute.
	 * @return the message
	 */
	public String getMessage(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimoni.getMessage requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGE);
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
	 * <i>Generated method</i> - Getter of the <code>Testimoni.message</code> attribute. 
	 * @return the localized message
	 */
	public Map<Language,String> getAllMessage(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.message</code> attribute. 
	 * @return the localized message
	 */
	public Map<Language,String> getAllMessage()
	{
		return getAllMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.message</code> attribute. 
	 * @param value the message
	 */
	public void setMessage(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimoni.setMessage requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGE,value);
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
	 * <i>Generated method</i> - Setter of the <code>Testimoni.message</code> attribute. 
	 * @param value the message
	 */
	public void setAllMessage(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.message</code> attribute. 
	 * @param value the message
	 */
	public void setAllMessage(final Map<Language,String> value)
	{
		setAllMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.person</code> attribute.
	 * @return the person
	 */
	public TestiPerson getPerson(final SessionContext ctx)
	{
		return (TestiPerson)getProperty( ctx, PERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimoni.person</code> attribute.
	 * @return the person
	 */
	public TestiPerson getPerson()
	{
		return getPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.person</code> attribute. 
	 * @param value the person
	 */
	public void setPerson(final SessionContext ctx, final TestiPerson value)
	{
		PERSONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimoni.person</code> attribute. 
	 * @param value the person
	 */
	public void setPerson(final TestiPerson value)
	{
		setPerson( getSession().getSessionContext(), value );
	}
	
}
