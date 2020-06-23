package comm.example;

import comm.example.dao.EmployeeRepository;

import comm.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestCustomerApplication implements CommandLineRunner {
    private EmployeeRepository employeeRepository;
@Autowired
    public SpringRestCustomerApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRestCustomerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    employeeRepository.save(new Employee(1,"Ayush","Sharma","aayu@gmail.com"));
        employeeRepository.save(new Employee(2,"vivek","kumar","vivek@gmail.com"));

    }
}
