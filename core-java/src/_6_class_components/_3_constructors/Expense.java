package _6_class_components._3_constructors;

public class Expense {

    int id;
    String title;
    double amount;

    public Expense(int id, String title, double amount) {
        this();
        this.id = id;
        this.title = title;
        this.amount = amount;
    }

    public Expense() {
        //call param constructor
        // this(101, "coffee", 200.0f);
        System.out.println("no args constructor");
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        Expense expense = new Expense(0, null, 1);
        System.out.println(expense.toString());

    }
}
