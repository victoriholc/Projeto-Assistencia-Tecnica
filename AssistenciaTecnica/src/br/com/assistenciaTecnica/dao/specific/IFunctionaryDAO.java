package br.com.assistenciaTecnica.dao.specific;

import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.dao.generic.IPersonDAO;

public interface IFunctionaryDAO extends IPersonDAO
{
	public List<Functionary> searchByRole(Role role);
	public List<Functionary> searchByDepartment(Department department);
	public Functionary searchByRegistrationCode(String registrationCode);
	public List<Functionary> searchByDateAdimission(Date dateAdimission);
	public List<Functionary> searchByDateResignation(Date dateResignation);
	public Functionary searchByUser(User user);
	public List<Functionary> searchByScholarity(Scholarity scholarity);
	
}
