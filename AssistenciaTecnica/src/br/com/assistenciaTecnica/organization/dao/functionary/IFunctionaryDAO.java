package br.com.assistenciaTecnica.organization.dao.functionary;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.organization.dao.IPersonDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Functionary;

public interface IFunctionaryDAO extends IPersonDAO
{
	public List<Functionary> searchByFunction(String functionName);
	public List<Functionary> searchByDepartment(String departmentName);
	public Functionary searchByRegistrationCode(String registrationCode);
	public List<Functionary> searchByDateAdimission(Date dateAdimission);
	public List<Functionary> searchByDateResignation(Date dateResignation);
	public Functionary searchByUser(String userNames);
	public List<Functionary> searchByScholarity(String description);
	
}
