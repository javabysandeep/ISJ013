package _6_class_components._2_methods.mvc2;

public class StudentController {
    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        this.studentService.addStudent(student);
    }

    public void updateStudent(Student student) {
        this.studentService.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        this.studentService.deleteStudent(student);
    }
}
