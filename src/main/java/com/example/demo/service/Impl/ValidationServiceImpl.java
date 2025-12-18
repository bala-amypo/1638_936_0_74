package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import  com.example.demo.entity.ValidationEntity;
import  com.example.demo.repository.ValidationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService{
      @Autowired ValidationRepository student;
     
      @Override
 public ValidationEntity postdataa(ValidationEntity val){
    return student.save(val);
 }
}