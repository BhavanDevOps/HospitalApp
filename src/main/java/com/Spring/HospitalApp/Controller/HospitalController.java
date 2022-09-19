package com.Spring.HospitalApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.HospitalApp.entity.Hospital;

@RestController
public class HospitalController {



	@Autowired
	
	Hospital hospitalserv;
	@GetMapping("/Hospitals")

	public List<Hospital> getAllCourses() {
		return Hospital.findAllHospitals();
	}

	@PostMapping("/post")
	public void createhospital(@RequestBody Hospital hospital) {
		Hospital.saveHospital(hospital);
	}

	@DeleteMapping("/students/{id}")
	public void deleteHospital(@PathVariable long id) {
		Hospital.deleteHospital(id);
	}

	@PutMapping("/course/{id}")
	public void updateHospital(@RequestBody Hospital hospital, @PathVariable long id) {
		Hospital.saveHospital(hospital);
	}

}
