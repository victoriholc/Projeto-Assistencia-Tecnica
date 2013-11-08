package br.com.assistenciaTecnica.organization.bo.exceptions.user;

public class InvalidUserFieldException extends Exception 
{
	public InvalidUserFieldException(String invalidField) {
		super(invalidField);
	}
}
