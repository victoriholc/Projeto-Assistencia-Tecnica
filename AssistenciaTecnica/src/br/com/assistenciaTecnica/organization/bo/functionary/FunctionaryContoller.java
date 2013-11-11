package br.com.assistenciaTecnica.organization.bo.functionary;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.organization.bo.exceptions.person.InvalidPersonFieldException;
import br.com.assistenciaTecnica.organization.bo.exceptions.person.address.InvalidPersonAdressException;
import br.com.assistenciaTecnica.organization.dao.functionary.FunctionaryDAO;
import br.com.assistenciaTecnica.organization.dao.functionary.IFunctionaryDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Functionary;

public class FunctionaryContoller {
	private IFunctionaryDAO daoFunctionary;

	public FunctionaryContoller() {
		this.daoFunctionary = new FunctionaryDAO();
	}
	
	public void insert(Functionary functionary) 
	{
		try{
			this.validatePersonFields(functionary);
			this.validateAdressFields(functionary);
			this.daoFunctionary.insert(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void update(Functionary functionary){
		try{
			this.validatePersonFields(functionary);
			this.validateAdressFields(functionary);
			this.daoFunctionary.update(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void remove(Functionary functionary){
		try{
			this.validatePersonFields(functionary);
			this.validateAdressFields(functionary);
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
	
	public List<Functionary> searchByFunction(String roleName){
		try{
			this.daoFunctionary.searchByFunction(roleName);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public  List<Functionary> searchByDepartment(String departmentName){
		try{
			this.daoFunctionary.searchByDepartment(departmentName);
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
	public Functionary searchByUser(String userName){
		try{
			this.daoFunctionary.searchByUser(userName);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Functionary> searchByScholarity(String description){
		try{
			this.daoFunctionary.searchByScholarity(description);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	private final void validatePersonFields(Functionary functionary) throws InvalidPersonFieldException
	{
		if (functionary == null)
			throw new NullPointerException("Funcionário nulo");
		if (functionary.getName() == null || functionary.getName().isEmpty() || functionary.getName().length() > 50)
			throw new InvalidPersonFieldException();
		if (functionary.getEmail() == null || functionary.getEmail().isEmpty() || functionary.getEmail().length() > 25)
			throw new InvalidPersonFieldException();
		
	}
	private final void validateAdressFields(Functionary functionary) throws InvalidPersonAdressException
	{
		for (int i = 0; i < functionary.getTelephones().size(); ++i)
		{
			if (functionary.getTelephones().get(i).getCountryCode() == null || 
				functionary.getTelephones().get(i).getCountryCode() == 0)
				throw new InvalidPersonAdressException();
			if (functionary.getTelephones().get(i).getCityCode() == null || 
				functionary.getTelephones().get(i).getCityCode() == 0)
				throw new InvalidPersonAdressException();
			if (functionary.getTelephones().get(i).getTelephoneNumber() == null || 
				functionary.getTelephones().get(i).getTelephoneNumber().isEmpty() ||
				functionary.getTelephones().get(i).getTelephoneNumber().length() > 16)
				throw new InvalidPersonAdressException();
		}
	}
}
