package br.com.assistenciaTecnica.organization.dao.service;

import java.util.Calendar;
import java.util.List;
import javax.persistence.TypedQuery;

import dao.GenericDAO;
import br.com.assistenciaTecnica.base.service.Service;

public class ServiceDAO extends GenericDAO<Service> implements IServiceDAO
{
	@Override
	public List<Service> consultServicesByCode(Integer id)
	{
		try
		{
			TypedQuery<Service> query = entityManager.createQuery("SELECT FROM Service s where s.id = :P",Service.class);
			query.setParameter("P", id);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Service> browseByChangeDate(Calendar date)
	{
		try
		{
			TypedQuery<Service> query = entityManager.createQuery("SELECT FROM Service s WHERE s.lastUpdade =: lastUpdade", Service.class);
			query.setParameter("lastUpdate", date);
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	} 
}
