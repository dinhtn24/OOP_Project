package model.person;

import java.util.Date;

public abstract class Person {
	protected String idCard;
	protected String name;
	protected Date dateOfBirth;
	protected String gender;
	protected String numberphone;
	protected String address;

	public Person(String idCard, String name, Date dateOfBirth, String gender, String numberphone, String address) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.numberphone = numberphone;
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNumberphone() {
		return numberphone;
	}

	public void setNumberphone(String numberphone) {
		this.numberphone = numberphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
