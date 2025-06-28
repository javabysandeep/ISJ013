package com.itshaala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component //stereotype annotation
public class Course {
    @Value("101")
    private int id;

    @Value("Full Stack Java")
    private String name;

    @Value("Online training at best")
    private String description;
}
