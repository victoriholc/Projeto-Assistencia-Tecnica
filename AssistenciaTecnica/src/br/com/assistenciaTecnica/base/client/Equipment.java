package br.com.assistenciaTecnica.base.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "Equipament")
public class Equipment extends BasicEntity{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pk_client")
	private Client client;
	@Column(name = "Mark")
	private String mark;
	@Column(name = "Model")
	private String model;
	@Column(name = "NumberSerial")
	private Integer numberSerial;
	@Column(name = "Name")
	private String name;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getNumberSerial() {
		return numberSerial;
	}
	public void setNumberSerial(Integer numberSerial) {
		this.numberSerial = numberSerial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}