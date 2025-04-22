package _15_collection.list.linkedListDemos;

public class Demo1CustomLinkedList {
    public static void main(String[] args) {

        class Node {
            Object data;
            Node next;

            public Node(Object data) {
                this.data = data;
            }

        }

        class LinkedList {
            Node head;
            Node tail;
            int size;

            public LinkedList() {
            }

            public void add(Object data) {
                Node newNode = new Node(data);
                if (head == null || tail == null) {
                    head = tail = newNode;
                } else {
                    Node temp = tail;
                    temp.next = newNode;
                    tail = newNode;
                }
                size++;
            }

            public Object remove(Object data) {
                Node temp = head;
                while (temp != null && temp.next.data != data) {
                    temp = temp.next;
                }
                temp = temp.next.next;
                size--;
                return data;
            }

            public int size() {
                return size;
            }

            @Override
            public String toString() {
                StringBuilder str = new StringBuilder();
                Node temp = head;
                while (temp != null) {
                    str.append(temp.data + " ");
                    temp = temp.next;
                }
                return str.toString();
            }
        }

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List size: " + list.size());
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
