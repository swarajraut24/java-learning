package com.tca.Repository;

import com.tca.Enums.Gender;
import com.tca.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer > {
}
