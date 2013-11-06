package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.stock.Register;
import br.com.assistenciaTecnica.dao.generic.IGenericDAO;

public interface IRegisterDAO extends IGenericDAO<Register>
{
	public List<Register> browseByChangeDate(Calendar lasUpdate);
	public List<Register> batchQuery(String lot);
	public List<Register> consultQuantityOfPiece(Integer piece);
}
