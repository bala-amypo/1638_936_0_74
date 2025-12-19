package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import  com.example.demo.entity.TimeStamp;
import  com.example.demo.repository.TimeStampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class TimeStampServiceImpl implements TimeStampService{
      @Autowired TimeStampRepository student;
      @Override
 public TimeStamp postdatta(TimeStamp tim){
    return student.save(tim);
 }
 @Override
 public List<TimeStamp> findTheData(){
      return student.findAll();
 }
}