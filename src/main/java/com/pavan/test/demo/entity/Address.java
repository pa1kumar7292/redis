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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Data
@Builder
@Entity(name = "address")
@SequenceGenerator(name = "add_seq", sequenceName = "add_seq", allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_seq")
    private Long id;
    private String line1;
    private String line2;
    private String street;
    private String city;

    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "employee_id")
    //@JoinTable(name = "employee", joinColumns = @JoinColumn(name = "id"))
    //@JoinColumn(name="employee_id", referencedColumnName = "id")
    @ManyToOne
    @JoinColumn(name = "fk_employeeId",referencedColumnName = "id")
    private Employee employee;
}
