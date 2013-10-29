package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.dao.generic.DAOGeneric;

public class DAOService extends DAOGeneric<Service> implements IDAOService
{
	@Override
	public List<Service> consultServicesByCode(Integer codigo)
	{
		try
		{
			TypedQuery<Service> query = entityManager.createQuery("SELECT FROM Service s where s.codigo =: P",Service.class);
			query.setParameter("P", codigo);
			
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
