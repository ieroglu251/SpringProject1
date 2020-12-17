package com.cyb.repository;

import com.cyb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student,Long> {
}
