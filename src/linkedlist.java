class linkedlist<T> {
    Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    linkedlist() {
        head = null;
    }

    public void insertAtBeginning(T val) {
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

    public void insertAtPos(int pos, T val) {
        if (head == null) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new ArithmeticException("Invaild position");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Array is empty");
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public T getIndex(int pos) {
        Node temp = head;
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void updateIndex(int pos, T val) {
        Node temp = head;
        if (pos == 0) {
            head.data = val;
            return;
        }
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
            if (i == pos) {
                temp.data = val;
            }
        }
    }

    public void deleteAtEnd() {
        Node temp = head;
        Node prev = null;
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void deleteAtBeginning() {
        Node temp = head;
        if (head == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }
        head = temp.next;
    }

    public void insertAtEnd(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = newNode;
        newNode.next = null;
    }

    public int search(T val) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == val) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public Boolean contains(T val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}

class reverselLinkedList {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    reverselLinkedList() {
        head = null;
    }

    public void insertData(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayAtReveral() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reversedList() {
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}