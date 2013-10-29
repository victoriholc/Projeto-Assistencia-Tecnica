package br.com.assistenciaTecnica.base.client.request;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.assistenciaTecnica.base.client.Client;
import br.com.assistenciaTecnica.base.object.GeneralObject;
import br.com.assistenciaTecnica.base.stock.EletronicPiece;

@Entity @Table(name = "tb_request")
public class Request extends GeneralObject
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_typeservice", insertable = true,
				updatable = true)
	@Fetch(FetchMode.JOIN)
	private TypeService typeservice;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_eltronicPart", insertable = true,
				updatable = true)
	@Fetch(FetchMode.JOIN)
	private EletronicPiece eletronicPiece;
	
	@Temporal(TemporalType.DATE)
	private Date dateRequest;
	
	@Temporal(TemporalType.DATE)
	private Date deadLine; //prazo de entrega
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_client", insertable = true,
				updatable = true)
	@Fetch(FetchMode.JOIN)
	private Client client;
	
	@Column(columnDefinition = "FLOAT")
	private Float valorTotal;
	
	@Column(columnDefinition = "FLOAT")
	private Float valorDesconto;
	
	public TypeService getRequestType() {
		return typeservice;
	}
	public void setTypeService(TypeService typeservice) {
		this.typeservice = typeservice;
	}
	public EletronicPiece getEletronicPiece() {
		return eletronicPiece;
	}
	public void setEletronicPart(EletronicPiece eletronicPiece) {
		this.eletronicPiece = eletronicPiece;
	}
	public Date getDateRequest() {
		return dateRequest;
	}
	public void setDateRequest(Date dateRequest) {
		this.dateRequest = dateRequest;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(Float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	
}
