package _6_class_components._1_variables;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "abc";
        System.out.println(student.id + "\t" + student.name);
    }
}
