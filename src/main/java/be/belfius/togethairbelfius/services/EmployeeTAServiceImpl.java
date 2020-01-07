package be.belfius.togethairbelfius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.belfius.togethairbelfius.domain.EmployeeTA;
import be.belfius.togethairbelfius.repositories.EmployeeTARepository;
import lombok.AllArgsConstructor;

@Service
public class EmployeeTAServiceImpl implements EmployeeTAService{

	@Autowired
	private EmployeeTARepository employeeTARepository;
	
	@Override
	public EmployeeTA findById(Long id) {
		return employeeTARepository.findById(id).get();
	}

	@Override
	public List<EmployeeTA> findAll() {
		return employeeTARepository.findAll();
	}

	@Override
	public EmployeeTA save(EmployeeTA employeeTA) {
		return employeeTARepository.save(employeeTA);
	}

	@Override
	public void delete(EmployeeTA employeeTA) {
		employeeTARepository.delete(employeeTA);
	}

}
