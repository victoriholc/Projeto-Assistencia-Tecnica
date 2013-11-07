package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import javax.persistence.TypedQuery;

import dao.GenericDAO;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;

public class EletronicPieceDAO extends GenericDAO<EletronicPiece> implements IEletronicPieceDAO
{
	@Override
	public List<EletronicPiece> queryPieceByCode(Integer code)
	{
		TypedQuery<EletronicPiece> query = entityManager.createQuery("FROM EletricPiece e WHERE e.id =:name ", EletronicPiece.class);
		query.setParameter("name", code);
		return query.getResultList();
	}
}
