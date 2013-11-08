package br.com.assistenciaTecnica.organization.bo.register;

import java.util.List;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.base.stock.Register;
import br.com.assistenciaTecnica.organization.dao.register.IRegisterDAO;
import br.com.assistenciaTecnica.organization.dao.register.RegisterDAO;
import br.com.assistenciaTecnica.organization.dao.service.IServiceDAO;
import br.com.assistenciaTecnica.organization.dao.service.ServiceDAO;

public class RegisterController{
	
	private IRegisterDAO daoRegister;

	public RegisterController() {
		this.daoRegister = new RegisterDAO();
	}

	public void insertRegister(Register register){
		try{
			this.daoRegister.insert(register);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void refreshRegister(Register register){
		try{
			this.daoRegister.refresh(register);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	
	public void removeRegister(Register register){
		try{
			this.daoRegister.remove(register);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List<Register> consultQuantityOfPiece(EletronicPiece piece){
		try{
			this.daoRegister.consultQuantityOfPiece(piece);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
