package com.example.medicalsystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;



 @TableName("usertable")
public class User {
        @TableId(value = "id", type = IdType.AUTO)
        private Long id;

        private String username;

        private String password;

        private Integer age;

        private String gender;

        private String bloodPressure;

        private String lungCapacity;

        private String role;

         @Override
         public String toString() {
                 return "User{" +
                         "id=" + id +
                         ", username='" + username + '\'' +
                         ", password='" + password + '\'' +
                         ", age=" + age +
                         ", gender='" + gender + '\'' +
                         ", bloodPressure='" + bloodPressure + '\'' +
                         ", lungCapacity='" + lungCapacity + '\'' +
                         ", role='" + role + '\'' +
                         '}';
         }

         public Long getId() {
                 return id;
         }

         public void setId(Long id) {
                 this.id = id;
         }

         public String getUsername() {
                 return username;
         }

         public void setUsername(String username) {
                 this.username = username;
         }

         public String getPassword() {
                 return password;
         }

         public void setPassword(String password) {
                 this.password = password;
         }

         public Integer getAge() {
                 return age;
         }

         public void setAge(Integer age) {
                 this.age = age;
         }

         public String getGender() {
                 return gender;
         }

         public void setGender(String gender) {
                 this.gender = gender;
         }

         public String getBloodPressure() {
                 return bloodPressure;
         }

         public void setBloodPressure(String bloodPressure) {
                 this.bloodPressure = bloodPressure;
         }

         public String getLungCapacity() {
                 return lungCapacity;
         }

         public void setLungCapacity(String lungCapacity) {
                 this.lungCapacity = lungCapacity;
         }

         public String getRole() {
                 return role;
         }

         public void setRole(String role) {
                 this.role = role;
         }
 }
