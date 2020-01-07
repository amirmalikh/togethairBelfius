package be.belfius.togethairbelfius.services;

import java.util.List;

import be.belfius.togethairbelfius.domain.EmployeeTA;

public interface EmployeeTAService {

	EmployeeTA findById(Long id);
	
	List<EmployeeTA> findAll();
	
	EmployeeTA save(EmployeeTA employeeTA);
	
	void delete(EmployeeTA employeeTA);
	
}
