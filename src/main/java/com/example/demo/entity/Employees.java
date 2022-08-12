package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLOYEES")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
