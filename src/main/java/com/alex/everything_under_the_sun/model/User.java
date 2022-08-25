package com.alex.everything_under_the_sun.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @NotNull(message = "The must have a firstName")
    private String firstName;
    @NotNull(message = "The must have a lastName")
    private String lastName;
    private String email;
    private Integer age;
    private String password;


}
