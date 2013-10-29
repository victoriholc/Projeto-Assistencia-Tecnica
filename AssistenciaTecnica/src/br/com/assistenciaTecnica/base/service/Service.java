package br.com.assistenciaTecnica.base.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity
@Table(name = "tb_service")
public class Service extends BasicEntity
{
	@Column(name = "Name",length = 40)
	private String name;
	@JoinColumn(name = "Fk_Service_TypeService")
	@ManyToOne(fetch = FetchType.EAGER)
	private TypeService typeService;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypeService getTypeService() {
		return typeService;
	}
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	
	
}