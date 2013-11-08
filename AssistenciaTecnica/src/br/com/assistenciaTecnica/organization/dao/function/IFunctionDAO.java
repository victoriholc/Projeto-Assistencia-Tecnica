package br.com.assistenciaTecnica.organization.dao.function;

import java.util.List;

import br.com.assistenciaTecnica.organization.dao.IGenericDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Function;

public interface IFunctionDAO extends IGenericDAO<Function>{
	
	public Function searchFunctionByName(Function function);
	public List<Function> functionListBySalary(Function function);
	
}
