package _9_final_keyword;

public class Demo3 {
    public static void main(String[] args) {

        class Student {
            final int id;
            final String name;

            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
            //Student(){}
        }
        Student student = new Student(1, "Pratham");
       // student.id = 101;
        //student.name = "abc";


    }
}
