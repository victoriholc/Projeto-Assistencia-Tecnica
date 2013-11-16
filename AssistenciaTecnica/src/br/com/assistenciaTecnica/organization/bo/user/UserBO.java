package br.com.assistenciaTecnica.organization.bo.user;

import br.com.assistenciaTecnica.organization.dao.user.IUserDAO;
import br.com.assistenciaTecnica.organization.exception.user.LoginInvalidException;
import br.com.assistenciaTecnica.organization.model.user.User;

public class UserBO {
	private IUserDAO userDAO;
	
	public User effectLogin(String login, String passWord ) throws LoginInvalidException{
		return this.userDAO.effectLogin(login, passWord);
	}
}
