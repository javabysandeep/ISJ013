package _15_collection.customDsa;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Object add(Object object) {

        return addLast(object);
    }

    public Object addLast(Object object) {
        Node newNode = new Node(object);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            Node temp = tail;
            temp.next = newNode;
            tail = newNode;
        }
        size++;
        return object;
    }

    public int size() {

        return size;
    }

    public Object addFirst(Object object) {
        Node newNode = new Node(object);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return object;
    }

    public Object add(int index, Object object) {
        Node temp = head;
        Node newNode = new Node(object);
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
        return object;
    }

    public boolean contains(Object object) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(object)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean remove(Object object) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(object)) {
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node temp = head;
        while (temp != null) {
            str.append(temp.data);
            if (temp.next != null) {
                str.append(",");
            }
            temp = temp.next;
        }
        str.append("]");
        return str.toString();
    }

}
