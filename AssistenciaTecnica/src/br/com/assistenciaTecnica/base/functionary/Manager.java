package br.com.assistenciaTecnica.base.functionary;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity @Table(name = "tb_manager")
@PrimaryKeyJoinColumn(name = "id")
public class Manager extends Functionary
{
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_managementType", insertable = true,
			updatable = true)
	private ManagementType managementType;
}
