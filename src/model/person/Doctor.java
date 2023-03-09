package model.person;

import java.util.Date;

public class Doctor extends Person {
	private String specialize;// Chuyên môn

	public Doctor(String idCard, String name, Date dateOfBirth, String gender, String numberphone, String address,
			String specialize) {
		super(idCard, name, dateOfBirth, gender, numberphone, address);
		this.specialize = specialize;
	}

	public String getSpecialize() {
		return specialize;
	}

	public void setSpecialize(String specialize) {
		this.specialize = specialize;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (specialize == null) {
			if (other.specialize != null)
				return false;
		} else if (!specialize.equals(other.specialize))
			return false;
		return true;
	}

}
