package br.com.assistenciaTecnica.business.exceptions.person.address;

public class InvalidPersonAdressException extends Exception 
{
	public InvalidPersonAdressException(String invalidPersonAdress) {
		super(invalidPersonAdress);
	}
}