package com.example.demo.service;
import com.example.demo.entity.TimeStamp;
import java.util.List;
public interface TimeStampService{
    TimeStamp postdata(TimeStamp tim);
   // List<ValidationEntity>getAllData();
    TimeStamp findtheData(Long id);
}
  
