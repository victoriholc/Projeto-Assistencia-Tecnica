package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.client.request.Request;
import br.com.assistenciaTecnica.dao.generic.IDAOGeneric;

public interface IDAORequest extends IDAOGeneric<Request>
{
	public List<Request> consultRequestByPeriod(Date dataInicial, Date dataFinal);
	public List<Request> consultRequestByCode(Integer id);
}
 