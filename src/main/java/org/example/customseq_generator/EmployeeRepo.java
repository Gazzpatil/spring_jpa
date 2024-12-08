package org.example.customseq_generator;

import org.example.customseq_generator.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {



}
