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
	public List<Functionary> searchByRole(Role role) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.role = :role";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("role", role);
			
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
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.department = :department";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("department", department);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Functionary searchByRegistrationCode(String registrationCode) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.registrationCode = :registrationCode";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("registrationCode", registrationCode);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Functionary> searchByDateAdimission(Date dateAdimission) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.dateAdimission = :dateAdimission";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("dateAdimission", dateAdimission);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Functionary> searchByDateResignation(Date dateResignation) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.dateResignation = :dateResignation";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("dateResignation", dateResignation);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Functionary searchByUser(User user) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.user = :user";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("user", user);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Functionary> searchByScholarity(Scholarity scholarity) {
		try
		{
			String jpql = "SELECT f FROM Funcionario f WHERE f.scholarity = :scholarity";
			TypedQuery<Funcionario> query = entityManager.createQuery(jpql, Funcionario.class);
			query.setParameter("scholarity", scholarity);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
