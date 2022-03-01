package project.hospital.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/")
	public String getAllData(Model model) {
		model.addAttribute("patientDetails", hospitalService.getAllData());
		return "HospitalUI";
	}
	
	@GetMapping("/addnew")
	public String addPatient( Model model) {
		
		Hospital_Model patient = new Hospital_Model();
		model.addAttribute("patient",patient);
		
		return "addNewPatient";
	}
	
	@PostMapping("/save")
	public String addData(@ModelAttribute("patient") Hospital_Model patient) {
		hospitalService.addPatient(patient);
		return "redirect:/";
	}
	
	@GetMapping("/updatePatient/{id}")
	public String updatePatient(@PathVariable int id, Model model) {
		
		model.addAttribute("patient", hospitalService.getById(id));
		return "updatePatient";
	}
	
	@GetMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable int id) {
		
		hospitalService.deleteData(id);
		return "redirect:/";
	}
	
}
