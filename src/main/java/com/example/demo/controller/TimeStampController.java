package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;
import java.util.List;


@RestController
public class TimeStampController{
    @Autowired TimeStampService service;
@PostMapping("/posst")
public TimeStamp dopost(@RequestBody TimeStamp tim){
    return service.postdatta(tim);
}
@GetMapping("/geet")
public List<TimeStamp>getval(){
    return service.getAllData();
}
}