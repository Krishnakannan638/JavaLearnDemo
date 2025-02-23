package examples;

public class demodoublyList {
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

    public demodoublyList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginningList(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void Rdisplay() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        if (pos == 0) {
            insertAtBeginningList(val);
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            insertAtEnd(val);
            return;
        }
        newNode.next = temp;
        temp.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");

        head = head.next;
        head.prev = null;
    }

    public void deleteAtEnd() {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
    }

    public void deleteAtPos(int pos) {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.next == null) {
            deleteAtEnd();
            return; 
        }
        prev.next = temp.next;
        temp.next.prev = prev;
    }
}
