package com.tca.service;

import com.tca.entity.Student;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


public interface StudentService {

    public Student saveStudent(Student student);
    public Student updateStudent(Student student);
    public Student saveOrUpdateStudent(Student student);

    public Optional<Student> fetchById(Integer id);

    public Iterable<Student> findAllStudent();

    public boolean deleteById(Integer id);

    public List<Student> saveAllStudent(List<Student> students);

}
