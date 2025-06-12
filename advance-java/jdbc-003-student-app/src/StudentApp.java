import controller.StudentController;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        //
        Student student = new Student();
        StudentController controller = new StudentController();
        controller.addStudent(student);
    }
}
