package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import br.com.assistenciaTecnica.base.client.request.Request;
import br.com.assistenciaTecnica.dao.generic.GenericDAO;

public class RequestDAO extends GenericDAO<Request> implements IRequestDAO
{
	@Override
	public List<Request> consultRequestByCode(Integer id)
	{
		try
		{
			TypedQuery<Request> query = entityManager.createQuery("SELECT FROM Request r where r.id =: P", Request.class);
			query.setParameter("P", id);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Request> consultRequestByPeriod(Date dataInicial, Date dataFinal)
	{
		try
		{
			TypedQuery<Request> query = entityManager.createQuery("SELECT FROM Request r where r.deadLine between :D1 and :D2", Request.class);
			query.setParameter("D1", dataInicial);
			query.setParameter("D2", dataFinal);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
