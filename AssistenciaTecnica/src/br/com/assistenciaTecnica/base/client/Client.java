package br.com.assistenciaTecnica.base.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import br.com.assistenciaTecnica.base.person.Person;
import br.com.assistenciaTecnica.base.user.User;

@Entity @Table(name = "tb_client")
@PrimaryKeyJoinColumn(name="id")
public class Client extends Person 
{
	@Enumerated(EnumType.ORDINAL)
	private ClientType personType;
	
	@Column(nullable = true)
	private String document;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_user", insertable = true,
		updatable = true)
	@Fetch(FetchMode.JOIN)
	private User user;
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
