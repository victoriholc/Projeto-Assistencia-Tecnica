package br.com.assistenciaTecnica.organization.dao.client;

import java.util.List;

import dao.IPersonDAO;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.client.ClientType;

public interface IClientDAO extends IPersonDAO
{
	public List<Client> getClientsByType(ClientType t);
}

