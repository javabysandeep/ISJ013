package _7_oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        //id=0, name=null, address=null

        //1. directly because it is non-private
     /*   student.id = -101;
        student.name = "pratham";
        student.address ="Pune";*/

        student.setId(101);
        student.setName("Pratham");
        student.setAddress("Pune");

        System.out.println("id =" + student.getId());
        System.out.println("name =" + student.getName());
        System.out.println("address =" + student.getAddress());


    }
}
