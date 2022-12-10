package com.pavan.test.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
public class User implements Serializable {

    private static final long serialVersionUID = -8325318829000196342L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;
    private String name;
    private String email;
    private Long phone;

}
