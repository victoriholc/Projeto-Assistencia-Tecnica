package br.com.assistenciaTecnica.organization.dao.client;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;
import br.com.assistenciaTecnica.organization.dao.PersonDAO;

public class ClientDAO extends PersonDAO implements IClientDAO
{
	@Override
	public List<Client> getClientsByType(ClientType t)
	{
		try 
		{
			String jpql = "Select * from Client as c where c.ClientType = :t";
			TypedQuery<Client> query = entityManager.createQuery(jpql, Client.class);
			query.setParameter("ClientType", t);
			
			return query.getResultList();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
