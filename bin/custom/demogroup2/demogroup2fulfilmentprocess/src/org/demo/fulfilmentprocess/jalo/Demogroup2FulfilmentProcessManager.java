/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demo.fulfilmentprocess.constants.Demogroup2FulfilmentProcessConstants;

public class Demogroup2FulfilmentProcessManager extends GeneratedDemogroup2FulfilmentProcessManager
{
	public static final Demogroup2FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Demogroup2FulfilmentProcessManager) em.getExtension(Demogroup2FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
