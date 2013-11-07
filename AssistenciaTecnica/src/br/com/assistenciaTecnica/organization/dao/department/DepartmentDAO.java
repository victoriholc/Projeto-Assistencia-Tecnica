package br.com.assistenciaTecnica.organization.dao.department;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.organization.dao.*;
import br.com.assistenciaTecnica.organization.model.department.*;

public class DepartmentDAO extends DAO<Department> implements IDepartmentDAO{
	
	@Override
	public Department findByName(Department department) {
		TypedQuery<Department> query = entityManager.createQuery("SELECT d FROM Department d WHERE d.name = :name",Department.class);
		query.setParameter("name", department.getName());
		
		 Department d = query.getSingleResult();
		
		return d;		
	}

}
