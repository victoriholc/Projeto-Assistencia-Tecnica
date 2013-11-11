package br.com.assistenciaTecnica.organization.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.TypedQuery;


import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.person.Telephone;

public class PersonDAO extends GenericDAO<Person> implements IPersonDAO
{

	@Override
	public List<Person> searchByName(String name) 
	{
		try
		{
			TypedQuery<Person> query = entityManager.createNamedQuery(
					"Person.searchByName", Person.class);
			query.setParameter("name", name);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByEmail(String email) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.email LIKE :email";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("email", email);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByBirthday(Calendar birthdayDate) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.birthdayDate = :birthdayDate";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("birthdayDate", birthdayDate);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByTelephones(List<Telephone> telephones) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.telephones = :telephones";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("telephones", telephones);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByStreet(String street)
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.street LIKE :street";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("street", street);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByStreetNumber(String streetNumber) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.streetNumber = :streetNumber";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("streetNumber", streetNumber);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByDistric(String distric) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.distric LIKE :distric";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("distric", distric);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByStreetType(Integer streetTypeID) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.streetType = :streetTypeID";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("streetTypeID", streetTypeID);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByRegion(Integer regionID) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.region = :regionID";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("regionID", regionID);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Person> searchByCountry(Integer countryID) 
	{
		try
		{
			String jpql = "SELECT p FROM Person p WHERE p.country = :countryID";
			TypedQuery<Person> query = entityManager.createQuery(jpql, Person.class);
			query.setParameter("countryID", countryID);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
