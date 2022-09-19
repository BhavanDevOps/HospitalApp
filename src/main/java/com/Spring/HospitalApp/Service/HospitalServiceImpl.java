package com.Spring.HospitalApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring.HospitalApp.Repository.HospitalRepository;
import com.Spring.HospitalApp.entity.Hospital;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HospitalServiceImpl implements HospitalService {

	public HospitalRepository hospitalrepo;

	@Autowired
	public HospitalServiceImpl(HospitalRepository hospitalrepo) {
		this.hospitalrepo = hospitalrepo;
	}

	@Override
	public List<Hospital> findAllHospitals() {
		return hospitalrepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.Spring.HospitalApp.Service.HospitalService#saveHospital(com.Spring.HospitalApp.entity.Hospital)
	 */
	@Override
	public void saveHospital(Hospital hospital) {
		saveHospital(hospital);
	}

	@Override
	public void deleteHospital(long id) {
		hospitalrepo.deleteHospital(id);
	}

	public HospitalRepository getHospitalrepo() {
		return hospitalrepo;
	}

	public void setHospitalrepo(HospitalRepository hospitalrepo) {
		this.hospitalrepo = hospitalrepo;
	}

	/**
	@Override
	public void saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		
	}

	/*public void saveHospital(Hospital hospital) {
		hospitalrepo.save(hospital);
	}

    public void saveHospital(Hospital hospital) {
    	saveHospital(hospital);
    }

	public void saveHospital(Hospital hospital) {
		hospitalrepo.saveHospital(this, hospital);
	} */
}
