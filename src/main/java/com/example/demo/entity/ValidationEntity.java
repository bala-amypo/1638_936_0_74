package com.example.demo.entity ;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=10 , message="must be 2 to 10 characters")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2, max=10 , message="must be 2 to 10 characters")
    @NotNull(message="Password is mandatory")
    private String password;          
    @Max(30)     
    @Positive  
    private int age;
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
    }