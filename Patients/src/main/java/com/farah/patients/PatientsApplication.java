package com.farah.patients;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.farah.patients.entities.*;
import com.farah.patients.service.PatientService;
@SpringBootApplication
public class PatientsApplication implements CommandLineRunner {
	
	
	
@Autowired
private PatientService patientService ;


public static void main(String[] args) {
SpringApplication.run(PatientsApplication.class, args);
}

public PatientService getPatientService() {
	return patientService;
}
public void setPatientService(PatientService patientService) {
	this.patientService = patientService;
	
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	patientService.savePatient(new Patient("farh ","fki",new Date()));
}


}






























//import java.util.Date;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.farah.patients.entities.Patient;
//import com.farah.patients.service.PatientService;
//
//@SpringBootApplication
//public class PatientsApplication implements CommandLineRunner{
//
//	@Autowired
//	PatientService patientService;
//	
//	
//	public static void main(String[] args) {
//		SpringApplication.run(PatientsApplication.class, args);
//	}
//	@Override
//	public void run(String... args) throws Exception {
//	/*patientService.savePatient(new Patient("aymen", "dayah", new Date()));
//	patientService.savePatient(new Patient("karim", "beahmed", new Date()));
//	patientService.savePatient(new Patient("yasmin", "messadi", new Date()));*/
//	}
//}