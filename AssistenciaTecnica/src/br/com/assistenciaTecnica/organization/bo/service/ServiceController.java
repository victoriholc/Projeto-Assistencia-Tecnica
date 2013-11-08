package br.com.assistenciaTecnica.organization.bo.service;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.organization.dao.service.IServiceDAO;
import br.com.assistenciaTecnica.organization.dao.service.ServiceDAO;

public class ServiceController {
	private IServiceDAO daoService;

	public ServiceController() {
		this.daoService = new ServiceDAO();
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
