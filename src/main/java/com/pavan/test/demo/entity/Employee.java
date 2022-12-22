package com.pavan.test.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity(name = "employee")
@Builder
@Data
@SequenceGenerator(name = "emp_seq", sequenceName = "emp_seq", allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    private Long id;
    private String name;
    private String job;
    private Integer empId;
    //@OneToMany(mappedBy="employee", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address = new LinkedList<>();
}
