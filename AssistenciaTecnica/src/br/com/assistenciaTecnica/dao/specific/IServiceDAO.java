package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.List;

import dao.IGenericDAO;

import br.com.assistenciaTecnica.base.service.Service;

public interface IServiceDAO extends IGenericDAO<Service>
{
	public List<Service> consultServicesByCode(Integer id);
	public List<Service> browseByChangeDate(Calendar date);
}
