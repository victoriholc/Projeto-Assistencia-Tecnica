package br.com.assistenciaTecnica.dao.specific;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.assistenciaTecnica.base.functionary.Department;
import br.com.assistenciaTecnica.base.functionary.Functionary;
import br.com.assistenciaTecnica.base.functionary.Role;
import br.com.assistenciaTecnica.base.functionary.Scholarity;
import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.person.Telephone;
import br.com.assistenciaTecnica.base.user.User;
import br.com.assistenciaTecnica.dao.generic.DAOPerson;

public class DAOFunctionary extends DAOPerson implements IDAOFunctionary 
{

	@Override
	public List<Person> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByBirthday(Calendar birthday) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByTelephones(List<Telephone> telephones) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByStreet(String street) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByStreetNumber(String streetNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByDistric(String distric) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByStreetType(Integer streetTypeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByRegion(Integer regionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchByCountry(Integer countryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> seeAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Person object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh(Person object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Person object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person queryById(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Functionary searchByRegistrationCode(String registrationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByDateAdimission(Date dateAdimission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByDateResignation(Date dateResignation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Functionary searchByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Functionary> searchByScholarity(Scholarity scholarity) {
		// TODO Auto-generated method stub
		return null;
	}

}
