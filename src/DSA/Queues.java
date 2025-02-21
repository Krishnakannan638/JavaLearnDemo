package DSA;
public class Queues {
    Node front, rear;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public Queues() {
        front = null;
        rear = null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (front == null) {
            front = newNode;
        } else
            rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int temp = front.data;
        front = front.next;
        if (rear == null) {
            rear = null;
        }
        return temp;
    }
}
