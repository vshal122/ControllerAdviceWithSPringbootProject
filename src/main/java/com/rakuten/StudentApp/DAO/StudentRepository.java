package com.rakuten.StudentApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.StudentApp.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
