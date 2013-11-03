package br.com.assistenciaTecnica.BusinessRules;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.dao.specific.IDAOService;

public class ControllerService {
	private IDAOService daoService;

	public ControllerService(IDAOService daoService) {
		this.daoService = daoService;
	}
	
	public void insertService(Service service){
		try{
			this.daoService.insert(service);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void refreshService(Service service){
		try{
			this.daoService.refresh(service);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	
	public void removeService(Service service){
		try{
			this.daoService.remove(service);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Service queryById(Integer id){
		try{
			this.daoService.consultServicesByCode(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
