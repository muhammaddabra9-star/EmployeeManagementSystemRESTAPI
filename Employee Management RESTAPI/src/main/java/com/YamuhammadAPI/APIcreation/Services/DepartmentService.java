package com.YamuhammadAPI.APIcreation.Services;
import com.YamuhammadAPI.APIcreation.Department;
import com.YamuhammadAPI.APIcreation.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


    public class DepartmentService {

        private final DepartmentRepository departmentRepository;

        public DepartmentService(DepartmentRepository departmentRepository) {
            this.departmentRepository = departmentRepository;
        }

        public List<Department> getAllDepartments() {
            return departmentRepository.findAll();
        }

        public Department saveDepartment(Department department) {
            return departmentRepository.save(department);
        }
    }


