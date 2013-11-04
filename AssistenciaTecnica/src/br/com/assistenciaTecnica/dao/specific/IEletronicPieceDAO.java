package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.dao.generic.IGenericDAO;


public interface IEletronicPieceDAO extends IGenericDAO<EletronicPiece>
{
	public List<EletronicPiece> queryPieceByCode(Integer code);
}


