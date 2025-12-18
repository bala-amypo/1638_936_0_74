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
      //save()
      //findall()
      //findById()
      //deleteById()
      //existsById()
 @Override
 public ValidationEntity postdata(ValidationEntity stuu){
    return student.save(stuu);
 }
}
