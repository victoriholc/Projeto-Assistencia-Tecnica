package br.com.assistenciaTecnica.base.object;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasicEntity extends GeneralObject
{
	@Column(length = 256)
	protected String description;

	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
}
