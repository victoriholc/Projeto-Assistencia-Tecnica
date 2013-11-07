package br.com.assistenciaTecnica.organization.model.functionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.assistenciaTecnica.base.object.GeneralObject;

@Entity @Table(name = "tb_department")
public class Department extends GeneralObject 
{
	@Column(length = 30)
	private String name;
	
	/* Necessario para montar o organograma da empresa 
	   Diretoria Financeira > Controladoria > Gerencia de Faturamento
	*/
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_superiorDepartment", nullable = true, 
				insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	private Department superiorDepartment;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Manager", nullable = true, insertable = true,
				updatable = true)
	@Fetch(FetchMode.JOIN)
	private Manager manager;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getSuperiorDepartment() {
		return superiorDepartment;
	}

	public void setSuperiorDepartment(Department superiorDepartment) {
		this.superiorDepartment = superiorDepartment;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
}
