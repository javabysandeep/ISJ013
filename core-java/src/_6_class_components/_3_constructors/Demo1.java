package _6_class_components._3_constructors;

public class Demo1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("id = " + student1.id);
        System.out.println("name = " + student1.name);
        System.out.println("address = " + student1.address);


        Student student2 = new Student(1, "Aditya", "USA");
        System.out.println("id = " + student2.id);
        System.out.println("name = " + student2.name);
        System.out.println("address = " + student2.address);


        //using copy constructor
        Student student3 = new Student(student2);


        System.out.println("id = " + student3.id);
        System.out.println("name = " + student3.name);
        System.out.println("address = " + student3.address);
    }
}
