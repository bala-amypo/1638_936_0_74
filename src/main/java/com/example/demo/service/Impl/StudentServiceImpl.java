package com.example.demo.service.Impl;
import org.springframeworks.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;

    //save()
    //findall()
    //findByeId()
    //deleteById()
    //existsById()
    
    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }
}