package project.hospital.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;
	
	public List<Hospital_Model> getAllData(){
		return hospitalRepository.findAll();
	}
	
	public void addPatient(Hospital_Model patient) {
		hospitalRepository.save(patient);
	}
	
	public Hospital_Model getById(int id) {
		java.util.Optional<Hospital_Model> optional = hospitalRepository.findById(id);
		Hospital_Model patient = null;
		if(optional.isPresent()) 
			patient = optional.get();
		else
			throw new RuntimeException("Employee not found for id: " + id);
		return patient;
	}
	
	public void deleteData(int id) {
		hospitalRepository.deleteById(id);
	}
}
