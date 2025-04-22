package _15_collection.customDsa;

public class Demo2 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        System.out.println("Before modification");
        System.out.println(list);

        list.add(4, 50);
        System.out.println("After modification");
        System.out.println(list);

        System.out.println("is 60 present " + list.contains(60));
    }

}
