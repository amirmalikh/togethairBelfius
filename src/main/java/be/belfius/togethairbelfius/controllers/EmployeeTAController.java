package be.belfius.togethairbelfius.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.belfius.togethairbelfius.domain.EmployeeTA;
import be.belfius.togethairbelfius.services.EmployeeTAService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeTAController {
	
	@Autowired
	EmployeeTAService employeeTAService;
	
    @PostMapping
    public EmployeeTA save(@RequestBody EmployeeTA employeeTA) {
        return employeeTAService.save(employeeTA);
    }
    
    @GetMapping("/{id}")
    public EmployeeTA findById(@PathVariable Long id) {
		return employeeTAService.findById(id);
    }
	
	@GetMapping
	public List<EmployeeTA> findAll(){
		return employeeTAService.findAll();
	}
	
	@DeleteMapping
	public void delete(@RequestBody EmployeeTA employeeTA) {
		employeeTAService.delete(employeeTA);
	}

}
