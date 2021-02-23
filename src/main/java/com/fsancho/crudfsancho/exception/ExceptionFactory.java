package com.fsancho.crudfsancho.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fsancho.crudfsancho.exception.enums.ExceptionType;

/**
 * @author Fernando Sancho
 *
 */
public class ExceptionFactory {
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionFactory.class);
	
	

	private ExceptionFactory() {
		super();
	}

	public static ApplicationSpecificException create(final Throwable cause, final ExceptionType exceptionType, final Object... messageArguments) {
		logger.error(exceptionType.getMessage());
		return new ApplicationSpecificException(exceptionType, cause, messageArguments);
	}

	public static ApplicationSpecificException create(final ExceptionType exceptionType, final Object... messageArguments) {
		logger.error(exceptionType.getMessage());
		return new ApplicationSpecificException(exceptionType, messageArguments);
	}
}
