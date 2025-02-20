package _6_class_components._2_methods.mvc2;

public class StudentDao {

    public void addStudent(Student student) {
        System.out.println("Id =" + student.id);
        System.out.println("Name =" + student.name);
        System.out.println("Address =" + student.address);
        System.out.println("Phone =" + student.phone);
        System.out.println("Email =" + student.email);
    }

    public void updateStudent(Student student) {
        System.out.println("student updated");
    }

    public void deleteStudent(Student student) {
        System.out.println("student deleted");
    }
}
