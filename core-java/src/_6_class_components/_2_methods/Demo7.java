package _6_class_components._2_methods;

public class Demo7 {

    public static void main(String[] args) {
        Student student = new Student();//id=0, name=null
        //student.id;//CTE
        student.setId(101);
        student.setName("Aditya");
        System.out.println("ID = " + student.getId());
        System.out.println("Name = " + student.getName());
    }
}

