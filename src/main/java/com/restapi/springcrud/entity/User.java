package com.restapi.springcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private String address;

//    public void setId(Integer id) {
//    }

//    public void setName(Object name) {
//    }
}
