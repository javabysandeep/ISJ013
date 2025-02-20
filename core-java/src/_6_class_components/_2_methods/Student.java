package _6_class_components._2_methods;

public class Student {
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
       if(id > 0){
           this.id = id;
       }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}