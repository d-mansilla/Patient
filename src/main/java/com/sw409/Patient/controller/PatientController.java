package com.sw409.Patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Patient.models.Patient;
import com.sw409.Patient.services.PatientService;

@RestController
@CrossOrigin("*")
public class PatientController {
	@Autowired
	PatientService patService = new PatientService();
	
	//CREATE
	
	@PostMapping("api/v1/patients")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patService.createPatient(patient);
		
	}
	
	//READ
	@GetMapping("api/v1/patients")
	public List<Patient> findAllPatients()
	{
		return patService.findAllPatients();
	}
	
	//UPDATE
	@PutMapping("api/v1/patients/{patientid}")
	public void updatePatient(@PathVariable("patientid") Integer id, @RequestBody Patient patient)
	{
		patService.updatePatient(id, patient);
	}
	
	//delete
	@DeleteMapping("api/v1/patients/{patientid}")
	public void deletePatient(@PathVariable("patientid") Integer id)
	{
		patService.deletePatient(id);
	}
	
	

}
