package com.Spring.HospitalApp.Service;

import java.util.List;

import com.Spring.HospitalApp.entity.Hospital;

public interface HospitalService {
	List<Hospital> findAllHospitals();

	void saveHospital(Hospital hospital);

	void deleteHospital(long id);

}
