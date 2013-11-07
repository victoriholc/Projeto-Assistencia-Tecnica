package br.com.assistenciaTecnica;

import java.util.List;

import br.com.assistenciaTecnica.organization.bo.department.DepartmentBO;
import br.com.assistenciaTecnica.organization.exception.NoSearchResultsException;
import br.com.assistenciaTecnica.organization.exception.department.DepartmentAlreadyExistsException;
import br.com.assistenciaTecnica.organization.model.department.Department;

public class Facade {
	private static Facade facade = null;
	private DepartmentBO departmentBO = null;
	
	private Facade(){
		this.departmentBO = new DepartmentBO();
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
	
}
