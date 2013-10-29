package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;
import br.com.assistenciaTecnica.dao.generic.IDAOPerson;

public interface IDAOClient extends IDAOPerson
{
	public List<Client> getClientsByType(ClientType t);
}

