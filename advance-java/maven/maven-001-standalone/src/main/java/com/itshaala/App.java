package com.itshaala;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(101)
                .name("sumit")
                .build();
        System.out.println(student);
    }
}
