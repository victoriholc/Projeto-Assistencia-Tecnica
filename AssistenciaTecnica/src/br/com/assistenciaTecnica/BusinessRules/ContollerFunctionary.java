package br.com.assistenciaTecnica.BusinessRules;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.dao.specific.IDAOFunctionary;

public class ContollerFunctionary {
	private IDAOFunctionary daoFunctionary;

	public ContollerFunctionary(IDAOFunctionary daoFunctionary) {
		try{
			this.daoFunctionary = daoFunctionary;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void insertFunctionary(Functionary functionary){
		try{
			this.daoFunctionary.insert(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void refreshFunctionary(Functionary functionary){
		try{
			this.daoFunctionary.refresh(functionary);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void removeFunctionary(Functionary functionary){
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
