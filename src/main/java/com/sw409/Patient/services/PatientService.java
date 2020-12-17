package com.sw409.Patient.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Patient.controller.Repositories.PatientRepository;
import com.sw409.Patient.models.Patient;


@Service
public class PatientService {
	
	List<Patient> patientList = new ArrayList<>();
	@Autowired
	PatientRepository patientRepository;
	
	//create
	public Patient createPatient(Patient patient)
	{
		patientList.add(patient);
//		return patient;            //original code
		return patientRepository.save(patient);
		
	}
	
	//read
	public List<Patient> findAllPatients()
	{
		return (List<Patient>) (patientRepository.findAll());
	}
	
	
	//update
	public void updatePatient(Integer id, Patient patient)
	{
		Patient oldpatient = patientRepository.findById(id).get();
		
		oldpatient.setGender(patient.getGender());		
		oldpatient.setName(patient.getName());		
		oldpatient.setAge(patient.getAge());
		oldpatient.setAllergy(patient.getAllergy());
		oldpatient.setCond(patient.getCond());
		oldpatient.setHeight(patient.getHeight());
		oldpatient.setWeight(patient.getWeight());
		oldpatient.setDetails(patient.getDetails());

		
		patientRepository.save(patient);
		
		
//		for (int i = 0; i < patientList.size(); i++) {        // original code
//			if(patientList.get(i).getId().equals(id))
//			{
//				patientList.set(i, patient);
//			}
//		}
	}
	
	//delete
	public void deletePatient(Integer id)
	{
		patientRepository.deleteById(id);
		
		
//		for (int i=0; i < patientList.size(); i++) {
//			if(patientList.get(i).getId().equals(id))
//			{
//				patientList.remove(i);
//			}
//				
//		}
		
	}
	
	

}
