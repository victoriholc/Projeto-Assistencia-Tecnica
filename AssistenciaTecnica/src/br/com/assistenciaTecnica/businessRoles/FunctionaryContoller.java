package br.com.assistenciaTecnica.businessRoles;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.business.exceptions.person.InvalidPersonFieldException;
import br.com.assistenciaTecnica.business.exceptions.person.address.InvalidPersonAdressException;
import br.com.assistenciaTecnica.business.exceptions.user.InvalidUserFieldException;
import br.com.assistenciaTecnica.dao.specific.FunctionaryDAO;
import br.com.assistenciaTecnica.dao.specific.IFunctionaryDAO;

public class FunctionaryContoller {
	private IFunctionaryDAO daoFunctionary;

	public FunctionaryContoller() {
		this.daoFunctionary = new FunctionaryDAO();
	}
	
	public void insert(Functionary functionary) throws NullPointerException,
															InvalidPersonFieldException,
															InvalidPersonAdressException,
															InvalidUserFieldException
	{
		if (functionary == null)
			throw new NullPointerException("Funcionário nulo");
		if (functionary.getName() == null || functionary.getName().isEmpty() || functionary.getName().length() > 50)
			throw new InvalidPersonFieldException("Nome inválido!");
		if (functionary.getEmail() == null || functionary.getEmail().isEmpty() || functionary.getEmail().length() > 25)
			throw new InvalidPersonFieldException("Email inválido!");
		for (int i = 0; i < functionary.getTelephones().size(); ++i)
		{
			if (functionary.getTelephones().get(i).getCountryCode() == null || 
				functionary.getTelephones().get(i).getCountryCode() == 0)
				throw new InvalidPersonAdressException("Códido de país inválido!");
			if (functionary.getTelephones().get(i).getCityCode() == null || 
				functionary.getTelephones().get(i).getCityCode() == 0)
				throw new InvalidPersonAdressException("Códido de cidade inválido!");
			if (functionary.getTelephones().get(i).getTelephoneNumber() == null || 
				functionary.getTelephones().get(i).getTelephoneNumber().isEmpty() ||
				functionary.getTelephones().get(i).getTelephoneNumber().length() > 16)
				throw new InvalidPersonAdressException("Códido de cidade inválido!");
		}
			
		
		try{
			this.daoFunctionary.insert(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void update(Functionary functionary){
		try{
			this.daoFunctionary.update(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void remove(Functionary functionary){
		try{
			this.daoFunctionary.remove(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Functionary queryById(Integer id){
		try{
			this.daoFunctionary.queryById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Functionary> seeAll(){
		try{
			this.daoFunctionary.seeAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Functionary> searchByRole(Role role){
		try{
			this.daoFunctionary.searchByRole(role);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public  List<Functionary> searchByDepartment(Department department){
		try{
			this.daoFunctionary.searchByDepartment(department);
			}catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
	public Functionary searchByRegistrationCode(String registrationCode){
		try{
			this.daoFunctionary.searchByRegistrationCode(registrationCode);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public List<Functionary> searchByDateAdimission(Date dateAdimission){
		try{
			this.daoFunctionary.searchByDateAdimission(dateAdimission);	
			}catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
	
	public List<Functionary> searchByDateResignation(Date dateResignation){
		try{
			this.daoFunctionary.searchByDateResignation(dateResignation);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public Functionary searchByUser(User user){
		try{
			this.daoFunctionary.searchByUser(user);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Functionary> searchByScholarity(Scholarity scholarity){
		try{
			this.daoFunctionary.searchByScholarity(scholarity);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
