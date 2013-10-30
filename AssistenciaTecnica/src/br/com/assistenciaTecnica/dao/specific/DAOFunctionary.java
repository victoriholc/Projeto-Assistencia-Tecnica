package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.dao.generic.DAOPerson;
import br.com.assistenciaTecnica.dao.generic.TypedQuery;

public class DAOFunctionary extends DAOPerson implements IDAOFunctionary 
{
	@Override
	public List<Functionary> searchByRole(String roleName) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE p.role.name LIKE :roleName";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("roleName", roleName);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Functionary> searchByDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Functionary searchByRegistrationCode(String registrationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByDateAdimission(Date dateAdimission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByDateResignation(Date dateResignation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Functionary searchByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByScholarity(Scholarity scholarity) {
		// TODO Auto-generated method stub
		return null;
	}

}
