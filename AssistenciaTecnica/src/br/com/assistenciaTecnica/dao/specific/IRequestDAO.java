package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;
import br.com.assistenciaTecnica.base.client.request.Request;
import br.com.assistenciaTecnica.dao.generic.IGenericDAO;

public interface IRequestDAO extends IGenericDAO<Request>
{
	public List<Request> consultRequestByPeriod(Date dataInicial, Date dataFinal);
	public List<Request> consultRequestByCode(Integer id);
}
 