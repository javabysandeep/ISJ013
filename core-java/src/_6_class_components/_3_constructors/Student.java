package _6_class_components._3_constructors;

public class Student {
    int id;
    String name;
    String address;

    //normal java method
    void Student() {
        System.out.println("instance method with ");
    }

    //zero parameterized constructor
    Student() {
        System.out.println("zero parameterized constructor");
    }

    //parameterized constructor
    Student(int id, String name, String address) {
        //assign local variable value to instance variable
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    //copy constructor
    Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.address = student.address;
    }

}
