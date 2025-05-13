public class Demo2LoadClassByUsingClassForNameMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Employee");
        System.out.println("Class is loaded using Class.forName");

    }
}
