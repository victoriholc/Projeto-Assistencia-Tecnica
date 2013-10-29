package br.com.assistenciaTecnica.base.stock;

import javax.persistence.Column;

import br.com.assistenciaTecnica.base.object.BasicEntity;

public class EletronicPiece extends BasicEntity
{
	@Column(length = 30)
	private String name;
	@Column(name="quantityParts")
	private Integer quantity;	
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
