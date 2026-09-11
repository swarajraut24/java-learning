package com.tca.service;

import com.tca.Repository.StudentRepository;
import com.tca.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

        student = studentRepository.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student saveOrUpdateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> fetchById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAllStudent() {

        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public boolean deleteById(Integer id) {

        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> saveAllStudent(List<Student> students) {

        return (List<Student>) studentRepository.saveAll(students);
    }
}
