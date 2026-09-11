package com.example._9customidwithcustomannoationpk.StudentRepository;

import com.example._9customidwithcustomannoationpk.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
