package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Course {
    private int id;
    private String name;
    private String duration;
    private int price;
    private String description;
}
