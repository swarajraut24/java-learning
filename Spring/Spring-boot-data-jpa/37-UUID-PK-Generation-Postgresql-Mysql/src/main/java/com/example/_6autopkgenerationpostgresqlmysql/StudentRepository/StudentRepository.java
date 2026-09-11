package com.example._6autopkgenerationpostgresqlmysql.StudentRepository;

import com.example._6autopkgenerationpostgresqlmysql.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
