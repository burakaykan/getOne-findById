package me.burakaykan.getOnefindById.controller;

import me.burakaykan.getOnefindById.model.Department;
import me.burakaykan.getOnefindById.model.Employee;
import me.burakaykan.getOnefindById.repository.DepartmentRepository;
import me.burakaykan.getOnefindById.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/findById")
    public void findByIdExample() {
        for (int i = 1; i < 20; i++) {
        Instant start = Instant.now();
        employeeRepository.findById((long) i);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        }
    }

    @GetMapping("/getOne")
    public void getOneExample() {
        for (int i = 1; i < 20; i++) {
            Instant start = Instant.now();
            employeeRepository.getOne((long) i);
            Instant end = Instant.now();
            System.out.println(Duration.between(start, end));
        }
    }

    @PostMapping("/findById/{id}")
    public void findByIdCreate(@PathVariable Long id) {
        Employee employee = new Employee();
        employee.setName("MyEmployee");
        Instant start = Instant.now();
        Department department = departmentRepository.findById(id).get();
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        employee.setDepartment(department);
        employeeRepository.save(employee);
    }
    @PostMapping("/getOne/{id}")
    public void getOneCreate(@PathVariable Long id) {
        Employee employee = new Employee();
        employee.setName("MyEmployee");
        Instant start = Instant.now();
        Department department = departmentRepository.getOne(id);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
        employee.setDepartment(department);
        employeeRepository.save(employee);
    }
}
