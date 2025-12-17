package com.example.demo.entity ;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}