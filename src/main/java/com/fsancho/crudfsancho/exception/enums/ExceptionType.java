package com.fsancho.crudfsancho.exception.enums;

import org.springframework.http.HttpStatus;
/**
 * @author Fernando Sancho
 *
 */
public enum ExceptionType {

	HTTP_INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Un error interno a ocurrido"), HTTP_NOT_FOUND(HttpStatus.NOT_FOUND, "Registros no encontrados"),
	URL_PROBLEM(HttpStatus.NOT_FOUND, "La url ha cambiado o no existe");

	private HttpStatus status;
	private String message;

	ExceptionType(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
}