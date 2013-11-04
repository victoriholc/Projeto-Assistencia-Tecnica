package br.com.assistenciaTecnica.base.person;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.assistenciaTecnica.base.object.GeneralObject;
import br.com.assistenciaTecnica.base.person.address.Address;

//@PrimaryKeyJoinColumn(name="id") nas subclasses 
@Entity @Table(name = "tb_person")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries
({
		@NamedQuery(name = "Person.seeAll", query = "SELECT * FROM Person"),
		@NamedQuery(name = "Person.searchByName", query = "SELECT p FROM" + 
		"Person p WHERE p.name LIKE :name")
})
public abstract class Person extends GeneralObject
{
	@Column(length = 50)
	protected String name;
	@Column(length = 25)
	protected String email;
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	protected Calendar birthdayDate;
	@ElementCollection
	@CollectionTable(name = "tb_telephone",
					joinColumns = @JoinColumn(name = "fk_id_person"))
	protected List<Telephone> telephones;

	protected Address addressPerson;//Classe embeddable

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Calendar birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	public Address getAddressPerson() {
		return addressPerson;
	}

	public void setAddressPerson(Address addressPerson) {
		this.addressPerson = addressPerson;
	}

	
}
