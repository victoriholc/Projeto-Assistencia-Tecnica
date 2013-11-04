package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.dao.generic.IGenericDAO;

public interface IServiceDAO extends IGenericDAO<Service>
{
	public List<Service> consultServicesByCode(Integer id);
	public List<Service> browseByChangeDate(Calendar date);
}
