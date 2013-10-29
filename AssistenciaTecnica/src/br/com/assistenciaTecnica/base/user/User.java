package br.com.assistenciaTecnica.base.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.GeneralObject;

@Entity @Table(name = "tb_user")
public class User extends GeneralObject
{
	@Column(length = 20)
	private String username;
	
	@Column(length = 20)
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	private PasswordSituation passwordSituation;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PasswordSituation getPasswordSituation() {
		return passwordSituation;
	}

	public void setPasswordSituation(PasswordSituation passwordSituation) {
		this.passwordSituation = passwordSituation;
	}
}
