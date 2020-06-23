package comm.example.service;

import comm.example.dao.EmployeeRepository;

import comm.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> getEmployeeById(int Id) {
        return employeeRepository.findById(Id);
    }

    @Override
    @Transactional
    public Employee createAndUpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int Id) {
        employeeRepository.deleteById(Id);
    }

}
