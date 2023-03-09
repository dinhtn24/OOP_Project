package controller;

import dao.DoctorDAO;
import model.person.Doctor;

public class DoctorController {
	private DoctorDAO doctorDAO;

	public boolean addDoctor(Doctor newDoctor) {
		for (Doctor doctor : doctorDAO.getDoctors()) {
			if (!doctor.equals(newDoctor)) {
				if (doctorDAO.insertDoctor(newDoctor)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	public boolean deleteDoctor(String idCard) {
		for (Doctor doctor : doctorDAO.getDoctors()) {
			if (doctor.getIdCard().equalsIgnoreCase(idCard)) {
				if (doctorDAO.deleteDoctor(idCard)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	public boolean editDoctor(Doctor doctor) {
		//TO DO
		return false;

	}
}
