package br.com.assistenciaTecnica.base.person.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "tb_country")
public class Country extends BasicEntity
{
	@Column (length = 3)
	private String abbreviation;
}
