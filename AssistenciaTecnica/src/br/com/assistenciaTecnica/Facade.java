package br.com.assistenciaTecnica;

import java.util.List;

import br.com.assistenciaTecnica.organization.bo.department.DepartmentBO;
import br.com.assistenciaTecnica.organization.bo.function.FunctionBO;
import br.com.assistenciaTecnica.organization.exception.NoSearchResultsException;
import br.com.assistenciaTecnica.organization.exception.function.FunctionAlreadyExistentsException;
import br.com.assistenciaTecnica.organization.model.department.Department;
import br.com.assistenciaTecnica.organization.model.functionary.Function;

public class Facade {
	private static Facade facade = null;
	private DepartmentBO departmentBO = null;
	private FunctionBO functionBO = null;
	
	private Facade(){
		this.departmentBO = new DepartmentBO();
		this.functionBO = new FunctionBO(null);
		
	}
	
	public static Facade getInstace(){
		if(facade == null){
			facade = new Facade();
		}
		return facade;
	}
	
	public void insertDepartment(Department department) throws Exception{
			departmentBO.insertDepartment(department);
	}
	
	public void removeDepartment(Department department){
		departmentBO.removeDepartment(department);
	}
	
	public List<Department>seeAllDepartment() throws NoSearchResultsException{
		return departmentBO.seeAll();
	}
	
	public void insertFunction(Function function) throws Exception{
		this.functionBO.insertFunction(function);
	}
	
	public void removeFunction(Function function){ 
		this.functionBO.removeFunction(function);
	}
	
	public void refrechFunction(Function function) throws Exception{
		this.functionBO.refrechFunction(function);
	}
	
	public Function searchFunctionById(Function function) throws Exception{
		return functionBO.searchFunctionById(function);
	} 
	
	public Function searchFunctionByName(Function function) throws Exception{
		return functionBO.searchFunctionByName(function);
	}
	
	public List<Function> functionListBySalary(Function function) throws FunctionAlreadyExistentsException{
		return functionBO.FunctionListBysalaty(function);
	}
	
	public List<Function> seeAllFunction(){
		return functionBO.seeAllFunction();
	}
}
