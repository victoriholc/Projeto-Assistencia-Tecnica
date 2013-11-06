package br.com.assistenciaTecnica.business;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.client.*;
import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.business.exceptions.person.InvalidPersonFieldException;
import br.com.assistenciaTecnica.business.exceptions.person.address.InvalidPersonAdressException;
import br.com.assistenciaTecnica.business.exceptions.user.InvalidUserFieldException;
import br.com.assistenciaTecnica.dao.specific.*;
import br.com.assistenciaTecnica.dao.generic.*;

public class ClientController{
	private IClientDAO daoClient;
	
	public ClientController() {
		this.daoClient = new ClientDAO();
	}
	
	public void insert(Client client) throws NullPointerException,
												InvalidPersonFieldException,
												InvalidPersonAdressException,
												InvalidUserFieldException
	{
		if (client == null)
			throw new NullPointerException("Cliente nulo");
		if (client.getName() == null || client.getName().isEmpty() || client.getName().length() > 50)
			throw new InvalidPersonFieldException("Nome inv�lido!");
		if (client.getEmail() == null || client.getEmail().isEmpty() || client.getEmail().length() > 25)
			throw new InvalidPersonFieldException("Email inv�lido!");
		for (int i = 0; i < client.getTelephones().size(); ++i)
		{
			if (client.getTelephones().get(i).getCountryCode() == null || 
					client.getTelephones().get(i).getCountryCode() == 0)
				throw new InvalidPersonAdressException("Códido de país inválido!");
			if (client.getTelephones().get(i).getCityCode() == null || 
					client.getTelephones().get(i).getCityCode() == 0)
				throw new InvalidPersonAdressException("Códido de cidade inválido!");
			if (client.getTelephones().get(i).getTelephoneNumber() == null || 
					client.getTelephones().get(i).getTelephoneNumber().isEmpty() ||
					client.getTelephones().get(i).getTelephoneNumber().length() > 16)
				throw new InvalidPersonAdressException("Códido de cidade inválido!");
		}
		try{
			this.daoClient.insert(client);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void update(Client client){
		try{
			this.daoClient.update(client);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void remove(Client client){
		try{
			this.daoClient.remove(client);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Client queryById(Integer id){
		try{
			this.daoClient.queryById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Client> seeAll(){
		try{
			this.daoClient.seeAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Client> searchByBirthDay(Calendar bday){
		try{
			this.daoClient.searchByBirthday(bday);	
			}catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
}
