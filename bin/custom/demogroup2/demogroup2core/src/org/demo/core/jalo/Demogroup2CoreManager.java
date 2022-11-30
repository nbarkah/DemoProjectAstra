/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demo.core.constants.Demogroup2CoreConstants;
import org.demo.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class Demogroup2CoreManager extends GeneratedDemogroup2CoreManager
{
	public static final Demogroup2CoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Demogroup2CoreManager) em.getExtension(Demogroup2CoreConstants.EXTENSIONNAME);
	}
}
