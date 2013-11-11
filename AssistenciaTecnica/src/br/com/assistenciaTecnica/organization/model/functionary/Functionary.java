package br.com.assistenciaTecnica.organization.model.functionary;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.user.User;

@ManagedBean
@Entity @Table(name = "tb_functionary")
@PrimaryKeyJoinColumn(name="id")
public class Functionary extends Person 
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_function", insertable = true,
			updatable = true)
	@Fetch(FetchMode.JOIN)
	protected Function function; //Funcao
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_department", insertable = true,
			updatable = true)
	@Fetch(FetchMode.JOIN)
	protected Department department;

	@Column(length = 30)
	protected String registrationCode;
	
	@Temporal(TemporalType.DATE)
	protected Date dateAdmission;
	
	@Temporal(TemporalType.DATE)
	protected Date dateResignation; //demissao
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_user", insertable = true,
			updatable = true)
	@Fetch(FetchMode.JOIN)
	protected User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_scholarity", insertable = true,
			updatable = true)
	@Fetch(FetchMode.JOIN)
	protected Scholarity scholarity; //escolaridade

	public Function getRole() {
		return role;
	}

	public void setRole(Function role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRegistrationCode() {
		return registrationCode;
	}

	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}

	public Date getDateAdmission() {
		return dateAdmission;
	}

	public void setDataAdmission(Date dateAdmission) {
		this.dateAdmission = dateAdmission;
	}

	public Date getDateResignation() {
		return dateResignation;
	}

	public void setDateResignation(Date dateResignation) {
		this.dateResignation = dateResignation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Scholarity getScholarity() {
		return scholarity;
	}

	public void setScholarity(Scholarity scholarity) {
		this.scholarity = scholarity;
	}

	
	
}
