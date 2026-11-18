package com.YamuhammadAPI.APIcreation.Services;
import com.YamuhammadAPI.APIcreation.Employee;
import com.YamuhammadAPI.APIcreation.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
