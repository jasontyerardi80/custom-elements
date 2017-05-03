package com.mulesoft.training;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MuleLifecyleComponent implements Startable, Callable {
	private static final Logger logger = LogManager.getLogger("com.mulesoft.training.Mule");
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		logger.info("********** Component Executed **********");
		return eventContext.getMessage();
	}

	@Override
	public void start() throws MuleException {
		logger.info("********** Component Started **********");
	}

}
