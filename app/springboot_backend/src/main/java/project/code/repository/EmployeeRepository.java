package project.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.code.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
