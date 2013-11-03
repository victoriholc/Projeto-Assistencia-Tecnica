package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.dao.generic.DAOPerson;


public class DAOFunctionary extends DAOPerson implements IDAOFunctionary 
{
	@Override
	public List<Functionary> searchByRole(Role role) {
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.role = :role";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
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
			String jpql = "SELECT f FROM Functionary f WHERE f.department = :department";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
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
			String jpql = "SELECT f FROM Functionary f WHERE f.registrationCode = :registrationCode";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("registrationCode", registrationCode);
			
			return (Functionary) query.getResultList();//não conseguir achar o erro então coloquei um cast
		}catch(Exception e){
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Functionary> searchByDateAdimission(Date dateAdimission) {
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.dateAdimission = :dateAdimission";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
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
			String jpql = "SELECT f FROM Functionary f WHERE f.dateResignation = :dateResignation";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
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
			String jpql = "SELECT f FROM Functionary f WHERE f.user = :user";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("user", user);
			
			return (Functionary) query.getResultList();//não conseguir achar o erro então coloquei um cast
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
			String jpql = "SELECT f FROM Functionary f WHERE f.scholarity = :scholarity";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
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
