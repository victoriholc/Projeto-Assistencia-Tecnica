package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.service.Service;
import br.com.assistenciaTecnica.dao.generic.IDAOGeneric;

public interface IDAOService extends IDAOGeneric<Service>
{
	public List<Service> consultServicesByCode(Integer codigo);
	public List<Service> browseByChangeDate(Calendar date);
}
