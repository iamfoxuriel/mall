package com.rabears.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @SequenceGenerator(name = "person_generator", sequenceName = "person_sequence", allocationSize = 1)
    @GeneratedValue(generator = "person_generator")
    private Long id;
    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName
                + "]";
    }
}