package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import dao.IPersonDAO;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;

public interface IClientDAO extends IPersonDAO
{
	public List<Client> getClientsByType(ClientType t);
}

