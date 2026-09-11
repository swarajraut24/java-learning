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

public interface StudentRepository extends CrudRepository<Student,Integer > {

    //jpql query
 @Query("SELECT s FROM Student s")
List<Student> findAllusingjpql();


 //SQL query
    @Query(value = "SELECT * FROM student ",nativeQuery = true)
    List<Student> findAllusingsql();


 //jpql positional paramters
    @Query("SELECT s from Student s where  s.per>=?1 and  s.per<=?2")
 List<Student> findpercentagerangeusingjpql(Double start,Double end);


 //jpql Named parameter
 @Query("SELECT s from Student s where  s.per>=:low and  s.per<=:high")
 List<Student> findperrangeusingnamedparamter(@Param("low")Double start, @Param("high") Double end);



    //sql positional parameters
    @Query(value="SELECT * FROM student  where  PER>=?1 and  PER<=?2",nativeQuery = true)
    List<Student> findpercentagerangeusingsql(Double start,Double end);


    //Scalar projection with jpql
    @Query("Select s.gender,s.name,s.per FROM Student s where s.per>=:per AND s.gender=:gender")
    List<Object[]> findgendernameper(@Param("per") Double per,@Param("gender") Gender gender);

    //Scalar projection with sql
    @Query(value="Select gender,name,per FROM student where per>=:per AND gender=:gender",nativeQuery = true)
    List<Object[]> findgendernamepersql(@Param("per") Double per,@Param("gender") Gender gender);

    // query annotation for deletion
    @Modifying
    @Transactional
    @Query("DELETE from Student s where s.per<=:p and s.gender=:g")
    public void deleteByperandgender(@Param("p") Double per,@Param("g") Gender gender);

    //query annotation for update
    @Modifying
    @Transactional
    @Query("update  Student s Set s.name=:u  where s.per=:p")
    public void updatebyname(@Param("u")String name,@Param("p") Double per);


}
