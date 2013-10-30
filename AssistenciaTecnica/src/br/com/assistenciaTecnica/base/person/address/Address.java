package br.com.assistenciaTecnica.base.person.address;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Embeddable
public class Address
{
	@Column(length = 25, nullable = false)
	private String street;
	
	@Column(length = 30, nullable = false)
	private String streetNumber;
	
	@Column(length = 30, nullable = false)
	private String distric;//bairro
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_streetType")
	@Fetch(FetchMode.JOIN)
	private StreetType streetType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_region")
	@Fetch(FetchMode.JOIN)
	private Region region;//regiao (Nordeste, Sudeste, etc)
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_country")
	@Fetch(FetchMode.JOIN)
	private Country country;//Pais

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public StreetType getStreetType() {
		return streetType;
	}

	public void setStreetType(StreetType streetType) {
		this.streetType = streetType;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}