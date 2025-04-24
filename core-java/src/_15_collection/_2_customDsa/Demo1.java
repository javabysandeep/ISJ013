package _15_collection._2_customDsa;

public class Demo1 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        System.out.println("List size " + list.size());
        System.out.println(list);
        System.out.println("After adding first");
        list.addFirst("Good morning");
        System.out.println(list);
    }
}
