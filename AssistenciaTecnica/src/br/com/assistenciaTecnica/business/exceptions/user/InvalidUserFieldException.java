package br.com.assistenciaTecnica.business.exceptions.user;

public class InvalidUserFieldException extends Exception 
{
	public InvalidUserFieldException(String invalidField) {
		super(invalidField);
	}
}
