package com.employee.EMA.repository;

import com.employee.EMA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
JpaRepository provides the EmployeeRepository interface
with basic CRUD functionality for managing instances of the Employee entity class.
It specifies the Employee entity class and the Long data type for the entity's primary key.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
