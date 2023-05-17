package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "emp")
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String firstName;

    private String lastName;

    private String role;

    private String email;
}
