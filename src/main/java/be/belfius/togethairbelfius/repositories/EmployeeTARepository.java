package be.belfius.togethairbelfius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.belfius.togethairbelfius.domain.EmployeeTA;

@Repository
public interface EmployeeTARepository extends JpaRepository<EmployeeTA, Long>{

}
