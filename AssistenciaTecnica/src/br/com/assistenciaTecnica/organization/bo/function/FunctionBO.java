package br.com.assistenciaTecnica.organization.bo.function;

import java.util.List;

import br.com.assistenciaTecnica.organization.dao.function.IFunctionDAO;
import br.com.assistenciaTecnica.organization.exception.NoSearchResultsException;
import br.com.assistenciaTecnica.organization.exception.function.FunctionAlreadyExistentsException;
import br.com.assistenciaTecnica.organization.model.functionary.Function;

public class FunctionBO{
	private IFunctionDAO functionDAO;

	public FunctionBO(IFunctionDAO functionDAO) {
		this.functionDAO = functionDAO;
	}
	
	public void insertFunction(Function function) throws Exception{
		try{
		this.functionDAO.insert(function);
		throw new FunctionAlreadyExistentsException();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void refrechFunction(Function function) throws Exception{
	
			this.functionDAO.refresh(function);
			throw new FunctionAlreadyExistentsException();
	}
	
	public void removeFunction(Function function) throws NoSearchResultsException{
		this.functionDAO.remove(function);
		
	}
	
	public Function searchFunctionById(Function function) throws NoSearchResultsException{
		try{
		this.functionDAO.searchFunctionByName(function);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public Function searchFunctionByName(Function function) throws Exception{
		try{
			this.functionDAO.searchFunctionByName(function);
			throw new FunctionAlreadyExistentsException();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	} 
	
	public List<Function> FunctionListBysalaty(Function function) throws FunctionAlreadyExistentsException{
		try{
			this.functionDAO.functionListBySalary(function);

		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
