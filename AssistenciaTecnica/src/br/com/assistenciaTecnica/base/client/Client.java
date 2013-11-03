package br.com.assistenciaTecnica.base.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import br.com.assistenciaTecnica.base.person.Person;

@Entity @Table(name = "tb_client")
@PrimaryKeyJoinColumn(name="id")
public class Client extends Person 
{
	@Enumerated(EnumType.ORDINAL)
	private ClientType personType;
	
	@Column(nullable = true)
	private String document;
	
	public ClientType getPersonType() {
		return personType;
	}
	public void setPersonType(ClientType personType) {
		this.personType = personType;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
}
