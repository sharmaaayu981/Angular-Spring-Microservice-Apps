package comm.example.dao;


import comm.example.model.Employee;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository

public interface EmployeeRepository extends CrudRepository <Employee,Integer> {
}
