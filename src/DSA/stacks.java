package DSA;
public class stacks<T> {
    private static int MAX_SIZE = 4;
    @SuppressWarnings("unchecked")
    T[] arr = (T[]) new Object[MAX_SIZE];
    int top;

    stacks() {
        top = -1;
    }

    public void push(T val) {
        if (top == MAX_SIZE) {
            throw new IndexOutOfBoundsException("Array List is full");
        }
        arr[++top] = val;
    }

    public T pop() {
        return arr[top--];
    }

    public T peek() {
        return arr[top];
    }
}

class LinkedListStacks {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedListStacks() {
        top = null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int peek() {
        return top.data;
    }

    public Boolean isEmpty() {
        return top == null;
    }
}
