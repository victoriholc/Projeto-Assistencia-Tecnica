package br.com.assistenciaTecnica.base.person.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.GeneralObject;

@Entity @Table(name = "tb_region")
public class Region extends GeneralObject
{
	@Column(length = 16)
	private String name;
}
