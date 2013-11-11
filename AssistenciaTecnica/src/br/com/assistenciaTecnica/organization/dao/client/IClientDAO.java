package br.com.assistenciaTecnica.organization.dao.client;

import java.util.List;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;
import br.com.assistenciaTecnica.organization.dao.IPersonDAO;

public interface IClientDAO extends IPersonDAO
{
	public List<Client> getClientsByType(ClientType t);
}

