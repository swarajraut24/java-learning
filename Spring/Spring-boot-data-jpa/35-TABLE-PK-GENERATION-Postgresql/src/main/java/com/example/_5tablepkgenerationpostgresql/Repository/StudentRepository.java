package com.example._5tablepkgenerationpostgresql.Repository;

import com.example._5tablepkgenerationpostgresql.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
