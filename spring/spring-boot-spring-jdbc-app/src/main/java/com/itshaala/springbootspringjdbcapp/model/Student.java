package com.itshaala.springbootspringjdbcapp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
}
