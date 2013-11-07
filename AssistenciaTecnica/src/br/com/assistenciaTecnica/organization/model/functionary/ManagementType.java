package br.com.assistenciaTecnica.organization.model.functionary;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.assistenciaTecnica.base.object.BasicEntity;

@Entity @Table(name = "tb_managementType")
public class ManagementType extends BasicEntity
{
	private Float bonusValue;

	public Float getBonusValue() {
		return bonusValue;
	}

	public void setBonusValue(Float bonusValue) {
		this.bonusValue = bonusValue;
	}
}
