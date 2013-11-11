package br.com.assistenciaTecnica.organization.bo.client;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.organization.dao.client.ClientDAO;
import br.com.assistenciaTecnica.organization.dao.client.IClientDAO;

public class ClientController{
	private IClientDAO daoClient;
	
	public ClientController() {
		this.daoClient = new ClientDAO();
	}
	
	public void insert(Client client)
	{
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
