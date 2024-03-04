package in.pwskill.prachi.service;

import java.util.List;

import in.pwskill.prachi.entity.Employee;

public interface IEmployeeService {
	public List<Employee> listAllEmps();
	public Employee getEmployeebyId(Integer id);
	public void saveEmployee(Employee emp);
	public void deleteEmployee(Integer id);
}
