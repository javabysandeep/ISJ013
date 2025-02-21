package _6_class_components._3_constructors;

public class LombokAppTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie(1, "Chhava", "historic movie", 5, "NA", "Vickey Kaushal");

        System.out.println(movie1.toString());
        System.out.println(movie2.toString());

    }
}
