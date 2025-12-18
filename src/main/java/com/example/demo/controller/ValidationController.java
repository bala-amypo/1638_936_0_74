package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import java.util.List;


@RestController
public class StudentController{
    @Autowired ValidationService vser;
@PostMapping("/postt")
public ValidationEntity dopost(@RequestBody ValidationEntity val){
    return vser.postdataa(val);
}
}