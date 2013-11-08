package br.com.assistenciaTecnica.organization.exception.function;

public class FunctionAlreadyExistentsException extends Exception{
	private static final String message = "Funcao ja Existe!";

	
	
	
	public FunctionAlreadyExistentsException() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getMessage() {
		return message;
	}
}
