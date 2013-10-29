//Funcao

package br.com.assistenciaTecnica.base.functionary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "tb_role")
public class Role extends BasicEntity
{
	@Column(columnDefinition = "FLOAT")
	private Float salary;

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	
}
