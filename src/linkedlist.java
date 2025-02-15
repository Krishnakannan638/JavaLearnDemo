class linkedlist {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    linkedlist() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        for (int i = 0; i < pos - 1; i++) {
            
        }
    }
}