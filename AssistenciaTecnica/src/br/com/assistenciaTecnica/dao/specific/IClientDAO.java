package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;
import br.com.assistenciaTecnica.dao.generic.IPersonDAO;

public interface IClientDAO extends IPersonDAO
{
	public List<Client> getClientsByType(ClientType t);
}

