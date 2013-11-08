package br.com.assistenciaTecnica.organization.dao.function;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.organization.dao.GenericDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Function;


public class FunctionDAO extends GenericDAO<Function> implements IFunctionDAO {

	@Override
	public Function searchFunctionByName(Function function) {
		TypedQuery<Function> query = entityManager.createNamedQuery("SELECT f FROM Function f WHERE f.name := name", Function.class);
		query.setParameter("name", function.getName());
		return query.getSingleResult();
	}

	@Override//Eu não sei se estar muito certo esse método, por favor, alguem verifique pra mim
	public List<Function> functionListBySalary(Function function) {
		TypedQuery<Function> query = entityManager.createNamedQuery("SELECT f FROM Function f WHERE f.salary := salary ", Function.class);
		List<Function> salario = query.setFirstResult(10).setMaxResults(10).getResultList();
		return salario;
	}
}
