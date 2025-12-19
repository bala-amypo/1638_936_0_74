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
public class StudentController{
    @Autowired TimeStampService ser;
@PostMapping("/posst")
public TimeStamp dopost(@RequestBody StudentEntity stu){
    return ser.postdata(stu);
}
@GetMapping("/geet")
public List<StudentEntity>getval(){
    return ser.getAllData();
}
}