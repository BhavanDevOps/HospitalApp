package com.Spring.HospitalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.HospitalApp.Service.HospitalServiceImpl;
import com.Spring.HospitalApp.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long>{

    default void saveHospital(HospitalServiceImpl hospitalServiceImpl, Hospital hospital) {
    	hospitalServiceImpl.saveHospital(hospital);
    }

    default void deleteHospital(long id) {
    	deleteById(id);
    }

    //default void saveHospital(HospitalServiceImpl hospitalServiceImpl, Hospital hospital) {
    	//hospitalServiceImpl.saveHospital(hospital);
    //} 
	

}
