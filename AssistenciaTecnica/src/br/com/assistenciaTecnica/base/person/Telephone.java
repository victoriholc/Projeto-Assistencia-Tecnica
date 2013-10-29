package br.com.assistenciaTecnica.base.person;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telephone
{
	@Column(nullable = true)
	private Byte countryCode;
	@Column(nullable = false)
	private Byte cityCode;
	@Column(nullable = false)
	private String telephoneNumber;
	
	public Byte getCountryCode()
	{
		return countryCode;
	}
	public void setCountryCode(Byte countryCode)
	{
		this.countryCode = countryCode;
	}
	public Byte getCityCode()
	{
		return cityCode;
	}
	public void setCityCode(Byte cityCode)
	{
		this.cityCode = cityCode;
	}
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
	public void setTelephoneNumber(String phoneNumber)
	{
		this.telephoneNumber = phoneNumber;
	}
}
