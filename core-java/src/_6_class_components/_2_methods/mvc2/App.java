package _6_class_components._2_methods.mvc2;


public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        Student student = new Student();

        student.id = 101;
        student.name = "Aditya";
        student.address = "Washim";
        student.email = "Aditya@gmail.com";
        student.phone = "+91 XXXXX XXXXX";


        studentController.addStudent(student);
        studentController.updateStudent(student);
        studentController.deleteStudent(student);
    }
}
