package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeId")
    private Employee employee;

}
