package be.belfius.togethairbelfius.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee_togethair")
public class EmployeeTA extends User{

	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
