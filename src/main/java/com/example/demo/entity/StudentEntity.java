package com.example.demo.entity 
import java.sql.Date
@Entity
public class StudentEntity(){
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Date created;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
       this.id=id;
    }
   public String getName(){
    return name;
   }
   