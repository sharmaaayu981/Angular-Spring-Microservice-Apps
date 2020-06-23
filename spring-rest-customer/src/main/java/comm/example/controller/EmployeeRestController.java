package comm.example.controller;


import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController

@CrossOrigin("http://localhost:4200")
public class EmployeeRestController {
private EmployeeService employeeService;
@Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
@GetMapping("/employees")
    public ResponseEntity<Iterable<Employee>> getAllEmployees()
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    }
    @GetMapping("/employees/{Id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("Id") int Id)
    {
        return  ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(Id));
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {

        return ResponseEntity.status(HttpStatus.OK).body(employeeService.createAndUpdateEmployee(employee));
    }
    @PutMapping("/employees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.createAndUpdateEmployee(employee));
    }
    @DeleteMapping("/employees/{Id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("Id") int Id){

    employeeService.deleteEmployeeById(Id);
    return  ResponseEntity.status(HttpStatus.OK).body("deleted successfully");
    }
}
