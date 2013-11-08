package br.com.assistenciaTecnica.organization.dao.request;

import java.util.Date;
import java.util.List;

import dao.IGenericDAO;
import br.com.assistenciaTecnica.base.client.request.Request;

public interface IRequestDAO extends IGenericDAO<Request>
{
	public List<Request> consultRequestByPeriod(Date dataInicial, Date dataFinal);
	public List<Request> consultRequestByCode(Integer id);
}
 