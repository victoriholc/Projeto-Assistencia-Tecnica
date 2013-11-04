package br.com.assistenciaTecnica.base.person;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telephone
{
	@Column(nullable = true)
	private Short countryCode;
	@Column(nullable = false)
	private Short cityCode;
	@Column(nullable = false, length = 16)
	private String telephoneNumber;
	
	public Short getCountryCode()
	{
		return countryCode;
	}
	public void setCountryCode(Short countryCode)
	{
		this.countryCode = countryCode;
	}
	public Short getCityCode()
	{
		return cityCode;
	}
	public void setCityCode(Short cityCode)
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
