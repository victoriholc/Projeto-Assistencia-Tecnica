package br.com.assistenciaTecnica.base.stock;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.assistenciaTecnica.base.object.GeneralObject;

@Entity
@Table(name = "tb_register")
public class Register extends GeneralObject 
{	
	@OneToOne(fetch = FetchType.EAGER)//Quantidade indica que não precisa de many (e se fosse one to many precisaria ser collection)
	@JoinColumn(name = "fk_id_eletronicPiece")
	private EletronicPiece eletronicPieces;
	
	private Integer quantity;
	

	@Temporal(TemporalType.DATE)
	private Calendar entryDate;
	
	private String lot;

	public EletronicPiece getEletronicPieces() {
		return eletronicPieces;
	}
	public void setEletronicPieces(EletronicPiece eletronicPieces) {
		this.eletronicPieces = eletronicPieces;
	}

	
	public Integer getQuantity()
	{
		return quantity;
	}
	public void setQuantity(Integer quantity) 
	{
		this.quantity = quantity;
	}

	public Calendar getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Calendar entryDate)
	{
		this.entryDate = entryDate;
	}

	public String getLot() 
	{
		return lot;
	}
	public void setLot(String lot) 
	{
		this.lot = lot;
	}
}
