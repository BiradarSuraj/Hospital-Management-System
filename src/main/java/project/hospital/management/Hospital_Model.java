package project.hospital.management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital_model")
public class Hospital_Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_id;
	private String name;
	private String age;
	private String bloodgroup;
	private String symptoms;
	private String address;
	private String phone_no;
	
	
	public Hospital_Model() {
		super();
	}
	public Hospital_Model(int patient_id, String name, String age, String bloodgroup, String symptoms, String address,
			String phone_no) {
		super();
		this.patient_id = patient_id;
		this.name = name;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.symptoms = symptoms;
		this.address = address;
		this.phone_no = phone_no;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
	
	
	
	
	
}
