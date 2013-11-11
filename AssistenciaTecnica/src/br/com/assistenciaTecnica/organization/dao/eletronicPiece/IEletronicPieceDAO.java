package br.com.assistenciaTecnica.organization.dao.eletronicPiece;

import java.util.List;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.organization.dao.IGenericDAO;


public interface IEletronicPieceDAO extends IGenericDAO<EletronicPiece>
{
	public List<EletronicPiece> queryPieceByCode(Integer code);
}


