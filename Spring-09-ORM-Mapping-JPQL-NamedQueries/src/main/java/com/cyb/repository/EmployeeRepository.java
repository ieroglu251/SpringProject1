package com.cyb.repository;

import com.cyb.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("select e from Employee e where e.email='dtrail8@tamu.edu'")
    Employee getEmployeeDetails();


    @Query("select e.salary from Employee e where e.email = 'dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    @Query("select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeEmail(String email);

    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Optional<Employee> getEmployeeEmailAndSalary(String email, int salary);
}
