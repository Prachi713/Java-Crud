package in.pwskill.prachi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.prachi.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
