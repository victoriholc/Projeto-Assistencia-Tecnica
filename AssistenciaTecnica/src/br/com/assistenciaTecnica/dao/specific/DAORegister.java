package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.assistenciaTecnica.base.stock.Register;
import br.com.assistenciaTecnica.dao.generic.DAOGeneric;

public class DAORegister extends DAOGeneric<Register> implements IDAORegister
{
	@Override
	public List<Register> browseByChangeDate(Calendar lastUpdate)
	{
		try
		{
			TypedQuery<Register> query = entityManager.createQuery("SELECT FROM Register r WHERE r.lastUpdade =: lastUpdade", Register.class);
			query.setParameter("lastUpdate", lastUpdate);
			
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Register> batchQuery(String lot)
	{
		try
		{
			TypedQuery<Register> query = entityManager.createQuery("SELECT FROM Register r WHERW r.lot =: lot", Register.class);
			query.setParameter("lot", lot);

			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public List<Register> consultQualityOfPiece(Integer piece)
	{
		try{
			TypedQuery<Register> query = entityManager.createQuery("SELECT r.part.name, COUNT(*) FROM Register r GROUP BY r.part.name", Register.class);
			return query.getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
