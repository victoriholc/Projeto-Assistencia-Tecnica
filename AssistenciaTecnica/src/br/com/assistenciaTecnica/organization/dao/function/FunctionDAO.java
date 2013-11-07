package br.com.assistenciaTecnica.organization.dao.function;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.organization.dao.GenericDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Function;


public class FunctionDAO extends GenericDAO<Function> implements IFunctionDAO {

	@Override
	public Function searchFunctionByName(Function function) {
		TypedQuery<Function function> query = entityManager.createNamedQuery("Function f ", arg1)
		return null;
	}

	@Override
	public List<Function> functionListBySalary(Function function) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterFurctionByName(Function function) {
		// TODO Auto-generated method stub
		
	}

}
