package br.com.assistenciaTecnica.organization.bo.functionary.exceptions;

public class InvalidFunctionaryFieldException extends Exception 
{
	private static final String Message = "Campo de functionario invalido!";

	public InvalidFunctionaryFieldException() {
		super(Message);
	}

	public String getMessage() {
		return Message;
	}
}
