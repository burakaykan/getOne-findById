package me.burakaykan.getOnefindById;

import me.burakaykan.getOnefindById.model.Department;
import me.burakaykan.getOnefindById.model.Employee;
import me.burakaykan.getOnefindById.repository.DepartmentRepository;
import me.burakaykan.getOnefindById.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GetOneFindByIdApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(GetOneFindByIdApplication.class, args);
	}

//	@PostConstruct
//	private void populateData() {
//		employeeRepository.deleteAll();
//		departmentRepository.deleteAll();
//		for (int i = 1; i < 99; i++) {
//			Department department = new Department();
//			department.setName("Department-0"+i);
//			departmentRepository.save(department);
//			Employee employee = new Employee();
//			employee.setName("Employee-0"+i);
//			employee.setDepartment(departmentRepository.getOne((long) i));
//			employeeRepository.save(employee);
//		}
//	}

}
