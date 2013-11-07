//Funcao

package br.com.assistenciaTecnica.organization.model.functionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "tb_function")
public class Function extends BasicEntity
{
	@Column(columnDefinition = "VARCHAR(30)")
	private String name;
	@Column(columnDefinition = "FLOAT")
	private Float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}	
}
