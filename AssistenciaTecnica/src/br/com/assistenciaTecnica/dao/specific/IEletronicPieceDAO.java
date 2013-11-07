package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import dao.IGenericDAO;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;


public interface IEletronicPieceDAO extends IGenericDAO<EletronicPiece>
{
	public List<EletronicPiece> queryPieceByCode(Integer code);
}


