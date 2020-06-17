package me.burakaykan.getOnefindById.repository;

import me.burakaykan.getOnefindById.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
