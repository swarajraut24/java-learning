package com.example._7customidpkgenerationpostgresqlmysql.StudentRepository;

import com.example._7customidpkgenerationpostgresqlmysql.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String>
{
}
