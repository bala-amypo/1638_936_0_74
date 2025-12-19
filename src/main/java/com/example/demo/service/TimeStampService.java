package com.example.demo.service;
import com.example.demo.entity.TimeStamp;
import java.util.List;
public interface TimeStampService{
    TimeStamp postdatta(TimeStamp tim);
    List<TimeStamp>findTheData();
    //TimeStamp findTheData(Long id);
}
  
 