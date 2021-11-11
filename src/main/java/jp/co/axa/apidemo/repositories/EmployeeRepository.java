package jp.co.axa.apidemo.repositories;

import jp.co.axa.apidemo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class provides the interface to access data from DB
 * KEY : Employee Id 
 * Value : Employee Object
 * 
 * */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
