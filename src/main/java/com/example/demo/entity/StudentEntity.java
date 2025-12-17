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
   public void setName(String name){
    this.name=name;
   }
    public String getPassword(){
    return password;
   }
   public void setPassword(String password){
    this.password=password;
   }
    public String getEmail(){
    return email;
   }
   public void setEmail(String email){
    this.email=email;
   }
    public Date getCreated(){
    return created;
   }
   public void setCreated(Date created){
    this.created=created;
   }
   public StudentEntity(Integer id, String name, String password , String email , Date created){
           this.id=id;
           this.name=nmn
   }