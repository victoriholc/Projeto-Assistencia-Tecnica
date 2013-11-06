package br.com.assistenciaTecnica.businessRoles;

import br.com.assistenciaTecnica.base.*;
import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.dao.specific.EletronicPieceDAO;
import br.com.assistenciaTecnica.dao.specific.IEletronicPieceDAO;
import br.com.assistenciaTecnica.dao.specific.ServiceDAO;


public class EletronicPieceController{
	
	private IEletronicPieceDAO daoEletronicPiece;

	public EletronicPieceController() {
		this.daoEletronicPiece = new EletronicPieceDAO();
	}
	
	public void insertEletronicPiece(EletronicPiece piece){
		try{
			this.daoEletronicPiece.insert(piece);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void removeEletronicPiece(EletronicPiece piece){
		try{
			this.daoEletronicPiece.remove(piece);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Service queryById(Integer id){
		try{
			this.daoEletronicPiece.queryPieceByCode(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
