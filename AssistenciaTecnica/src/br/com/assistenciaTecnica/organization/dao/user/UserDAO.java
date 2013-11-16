package br.com.assistenciaTecnica.organization.dao.user;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.organization.dao.GenericDAO;
import br.com.assistenciaTecnica.organization.exception.user.LoginInvalidException;
import br.com.assistenciaTecnica.organization.model.user.User;

public class UserDAO extends GenericDAO<User> implements IUserDAO{

	@Override
	public User effectLogin(String userName, String passWord)  throws LoginInvalidException{
		try{
			TypedQuery<User> query = entityManager.createNamedQuery("effectLogin", User.class);
			query.setParameter("userName", userName);
			query.setParameter("passWord", passWord);
			
			return query.getSingleResult();
	
		}catch(Exception e){
			e.printStackTrace();
			throw new LoginInvalidException();
		}
	}
}
