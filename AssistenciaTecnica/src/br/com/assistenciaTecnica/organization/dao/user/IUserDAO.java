package br.com.assistenciaTecnica.organization.dao.user;

import br.com.assistenciaTecnica.organization.dao.IGenericDAO;
import br.com.assistenciaTecnica.organization.exception.user.LoginInvalidException;
import br.com.assistenciaTecnica.organization.model.user.User;

public interface IUserDAO extends IGenericDAO<User>{ 	
	public User effectLogin(String login, String  password)  throws LoginInvalidException; 
}
