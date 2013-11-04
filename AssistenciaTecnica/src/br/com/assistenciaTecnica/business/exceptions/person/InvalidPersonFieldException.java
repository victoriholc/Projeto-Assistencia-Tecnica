package br.com.assistenciaTecnica.business.exceptions.person;

public class InvalidPersonFieldException extends Exception 
{
	public InvalidPersonFieldException(String invalidField) {
		super(invalidField);
	}
}
