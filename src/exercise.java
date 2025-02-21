import java.util.*;

public class exercise {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    exercise() {
        head = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void remove(int val) {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            if (temp.data == val) {
                head = temp.next;
                temp = temp.next;
                continue;
            }
            temp = temp.next;
            if (temp.data == val) {
                if (temp.next == null) {
                    prev.next = temp.next;
                    return;
                }
                prev.next = temp.next;
                temp = temp.next;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void medianArray(int[] arr1, int[] arr2) {
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        Collections.sort(list);
        int l = list.size() / 2;
        double a, b, c;
        if (list.size() % 2 == 0) {
            a = (int) list.get(l);
            b = (int) list.get(l - 1);
            c = (a + b) / 2;
            System.out.println(c);
        } else {
            double ans = 0;
            ans = (int) list.get(l);
            System.out.println(ans);
        }

    }
}
