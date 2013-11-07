package br.com.assistenciaTecnica.organization.dao.functionary;

import java.util.Date;
import java.util.List;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.organization.dao.IPersonDAO;
import br.com.assistenciaTecnica.organization.model.functionary.Department;
import br.com.assistenciaTecnica.organization.model.functionary.Function;
import br.com.assistenciaTecnica.organization.model.functionary.Functionary;
import br.com.assistenciaTecnica.organization.model.functionary.Scholarity;

public interface IFunctionaryDAO extends IPersonDAO
{
	public List<Functionary> searchByFunction(Function function);
	public List<Functionary> searchByDepartment(Department department);
	public Functionary searchByRegistrationCode(String registrationCode);
	public List<Functionary> searchByDateAdimission(Date dateAdimission);
	public List<Functionary> searchByDateResignation(Date dateResignation);
	public Functionary searchByUser(User user);
	public List<Functionary> searchByScholarity(Scholarity scholarity);
	
}