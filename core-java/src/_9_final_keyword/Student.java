package _9_final_keyword;

class Student {
    int id;
    String name;

    private Student() {
    }

    private Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static final Student studentInstance = new Student(1, "abc");

    public static Student getInstance() {
        return studentInstance;
    }
}