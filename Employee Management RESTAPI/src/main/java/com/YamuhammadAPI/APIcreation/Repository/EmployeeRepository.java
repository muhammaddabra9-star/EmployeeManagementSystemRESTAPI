

package com.YamuhammadAPI.APIcreation.Repository;

import com.YamuhammadAPI.APIcreation.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository we don't need to add @Repository here: Spring Data JPA automatically discovers repository interfaces.

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}