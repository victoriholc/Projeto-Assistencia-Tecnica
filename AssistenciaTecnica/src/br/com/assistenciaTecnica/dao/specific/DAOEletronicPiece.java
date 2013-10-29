package br.com.assistenciaTecnica.dao.specific;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.base.stock.EletronicPiece;
import br.com.assistenciaTecnica.dao.generic.DAOGeneric;

public class DAOEletronicPiece extends DAOGeneric<EletronicPiece> implements IDAOEletronicPiece
{
	@Override
	public List<EletronicPiece> queryPieceByCode(Integer code)
	{
		TypedQuery<EletronicPiece> query = entityManager.createQuery("FROM EletricPiece e WHERE e.code =:name ", EletronicPiece.class);
		query.setParameter("name", code);
		return query.getResultList();
	}
}
