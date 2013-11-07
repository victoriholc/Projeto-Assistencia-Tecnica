package br.com.assistenciaTecnica.organization.bo.department;

import java.util.ArrayList;
import java.util.List;

import br.com.assistenciaTecnica.organization.dao.department.DepartmentDAO;
import br.com.assistenciaTecnica.organization.dao.department.IDepartmentDAO;
import br.com.assistenciaTecnica.organization.exception.NoSearchResultsException;
import br.com.assistenciaTecnica.organization.exception.department.DepartmentAlreadyExistsException;
import br.com.assistenciaTecnica.organization.model.department.Department;

public class DepartmentBO {
	
	public void insertDepartment(Department department) throws Exception{
		IDepartmentDAO dao = new DepartmentDAO(); 
		
		try{
			Department d = dao.findByName(department);
			throw new DepartmentAlreadyExistsException();
			
		}catch(javax.persistence.NoResultException e){
			
			validation(department);
			
			dao.insert(department);
			
		}
	}
	
	public void removeDepartment(Department department){
		IDepartmentDAO dao = new DepartmentDAO(); 
		
		dao.remove(department);
//		dao.refresh(department);
	}
	public List<Department> seeAll() throws NoSearchResultsException{
		IDepartmentDAO dao = new DepartmentDAO(); 
		List<Department> departments;
		
		departments = dao.seeAll();
		if(departments == null || departments.isEmpty()){
			throw new NoSearchResultsException();
		}
		
		return departments;
	}
	
	private final void validation(Department department) throws Exception{
		if(department.getName() == null || department.getName().isEmpty()){
			throw new Exception("Informe o nome do departamento!");
		}
	}
	
}
