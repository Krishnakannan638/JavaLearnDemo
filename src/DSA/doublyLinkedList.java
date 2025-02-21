package DSA;
public class doublyLinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    doublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if (head == null)
            tail = newNode;
        else
            head.prev = newNode;
        head = newNode;
    }

    public void displayDLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void displayRDll() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            insertAtBeginning(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (pos == 0) {
            head = head.next;

        }
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next.prev = prev;
    }

    public void deleteAtEnd() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empthy");
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        prev.next = null;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        head = head.next;
        head.next.prev = head.prev;
    }
}
