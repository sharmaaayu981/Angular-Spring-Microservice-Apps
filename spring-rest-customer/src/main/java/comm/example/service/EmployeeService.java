package comm.example.service;

import comm.example.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    public Iterable<Employee> getAllEmployees();
    public Optional<Employee> getEmployeeById(int Id);

    public Employee createAndUpdateEmployee(Employee employee);
    public void deleteEmployeeById(int Id);

}
