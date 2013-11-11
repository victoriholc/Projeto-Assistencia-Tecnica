package br.com.assistenciaTecnica.organization.dao;

import java.util.Calendar;
import java.util.List;

import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.person.Telephone;

public interface IPersonDAO extends IGenericDAO<Person> 
{
	public List<Person> searchByName(String name);
	public List<Person> searchByEmail(String email);
	public List<Person> searchByBirthday(Calendar birthday);
	public List<Person> searchByTelephones(List<Telephone> telephones);
	public List<Person> searchByStreet(String street);
	public List<Person> searchByStreetNumber(String streetNumber);
	public List<Person> searchByDistric(String distric);//bairro
	public List<Person> searchByStreetType(Integer streetTypeID);
	public List<Person> searchByRegion(Integer regionID);
	public List<Person> searchByCountry(Integer countryID);
}
