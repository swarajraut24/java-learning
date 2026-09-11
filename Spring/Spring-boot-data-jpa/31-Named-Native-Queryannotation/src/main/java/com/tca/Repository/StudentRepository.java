package com.tca.Repository;

import com.tca.Enums.Gender;
import com.tca.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public interface StudentRepository extends CrudRepository<Student,Integer > {

  public List<Student> findAll(@Param("per") Double per,@Param("gender") Gender gender);

  @Modifying
  @Transactional
  public void updateName(@Param("per")Double per, @Param("name") String name);

  public List<Object[]>findgenderandname(@Param("per")Double per,@Param("gender")Gender gender);

  public List<Object[]>findgendercount();

  public List<Student>findgender( @Param("gender") Gender gender);


}
