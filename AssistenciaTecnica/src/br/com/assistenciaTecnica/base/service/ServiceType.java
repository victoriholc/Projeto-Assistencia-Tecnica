package br.com.assistenciaTecnica.base.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "Type_Services")
public class ServiceType extends BasicEntity{
	@Column(name = "Nome",length = 40)
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
