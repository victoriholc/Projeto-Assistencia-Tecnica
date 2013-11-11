package br.com.assistenciaTecnica.organization.dao.functionary;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.organization.dao.PersonDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Department;
import br.com.assistenciaTecnica.organization.model.functionary.Function;
import br.com.assistenciaTecnica.organization.model.functionary.Functionary;
import br.com.assistenciaTecnica.organization.model.functionary.Scholarity;


public class FunctionaryDAO extends PersonDAO implements IFunctionaryDAO 
{
	@Override
	public List<Functionary> searchByFunction(String functionName){
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.function.name LIKE :functionName";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("function", functionName);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Functionary> searchByDepartment(String departmentName) {
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.department.name LIKE :departmentName";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("department", departmentName);
			
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
			
			return (Functionary) query.getResultList();//n�o conseguir achar o erro ent�o coloquei um cast
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
	public Functionary searchByUser(String userName) {
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.user.name = :userName";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("user", userName);
			
			return (Functionary) query.getResultList();//n�o conseguir achar o erro ent�o coloquei um cast
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Functionary> searchByScholarity(String description) {
		try
		{
			String jpql = "SELECT f FROM Functionary f WHERE f.scholarity.description LIKE description";
			TypedQuery<Functionary> query = entityManager.createQuery(jpql, Functionary.class);
			query.setParameter("description", description);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

}
