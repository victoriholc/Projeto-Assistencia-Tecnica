package br.com.assistenciaTecnica.organization.bo.exceptions.person.address;

public class InvalidPersonAdressException extends Exception 
{
	private static final String Message = "Endereco invalido";
	
	public InvalidPersonAdressException() {
		super(Message);
	}
	
	public String getMessage() {
		return Message;
	}
}