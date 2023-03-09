package model.person;

import java.util.Date;
import java.util.List;

import model.Examination;

public class Patient extends Person {
	public Patient(String idCard, String name, Date dateOfBirth, String gender, String numberphone, String address) {
		super(idCard, name, dateOfBirth, gender, numberphone, address);
		// TODO Auto-generated constructor stub
	}
	private boolean insurance;// bảo hiểm
	private List<Examination> examinations;// Lịch sử khám bệnh
}
