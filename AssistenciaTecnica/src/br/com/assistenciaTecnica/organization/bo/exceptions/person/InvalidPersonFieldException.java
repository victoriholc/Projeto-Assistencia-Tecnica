package br.com.assistenciaTecnica.organization.bo.exceptions.person;

public class InvalidPersonFieldException extends Exception 
{
	private static final String Message = "Campo invalido";
	
	public InvalidPersonFieldException() {
		super(Message);
	}
	
	public String getMessage() {
		return Message;
	}
}
