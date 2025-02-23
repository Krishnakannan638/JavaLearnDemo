import java.util.*;
import sorting.sortingMethods;

public class App {

    public static void main(String[] args) throws Exception {

        sortingMethods ss = new sortingMethods();
        int[] arr = { 22, 10, 14, 13, 6, 17 };
        ss.quickSort(arr);

        // demodoublyList d = new demodoublyList();
        // d.insertAtBeginningList(4);
        // d.insertAtBeginningList(5);
        // d.insertAtBeginningList(6);
        // d.insertAtBeginningList(7);
        // d.display();
        // System.out.println();
        // d.insertAtPos(4, 3);
        // d.insertAtPos(5, 2);
        // d.deleteAtBeginning();
        // d.deleteAtBeginning();
        // d.deleteAtEnd();
        // d.deleteAtPos(5);
        // d.display();
        // System.out.println();
        // d.Rdisplay();

        // int target = 3;
        // System.out.println(serachMethods.binarySearch(arr, target));
        // basicMath m = new basicMath();
        // String pattern = "abba", s = "dog cat cat dog";
        // int[] arr = { 1,1,1,3,3,4,3,2,4,2 };
        // System.out.println(m.wordPattern(pattern, s));

        // Queues q = new Queues();
        // q.enqueue(4);
        // q.enqueue(2);
        // q.enqueue(8);
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());

        // LinkedListStacks s = new LinkedListStacks();
        // s.push(1);
        // s.push(2);
        // s.push(8);
        // s.push(4);
        // // s.push(5);
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println(s.isEmpty());

        // exercise e = new exercise();
        // int[] arr1 = { 1, 2 };
        // int[] arr2 = { 3,4 };
        // e.medianArray(arr1, arr2);
        // e.insert(4);
        // e.insert(4);
        // e.insert(4);
        // e.insert(5);
        // e.insert(7);
        // e.display();
        // System.out.println();
        // e.removeSortedList();
        // e.display();
        // e.insert(7);
        // e.insert(7);
        // e.display();
        // e.remove(7);
        // e.display();
        // pattern p = new pattern();
        // p.pattern22(5);

        // doublyLinkedList dll = new doublyLinkedList();
        // dll.insertAtBeginning(8);
        // dll.insertAtBeginning(5);
        // dll.insertAtBeginning(4);
        // dll.insertAtBeginning(9);
        // dll.insertAtBeginning(3);
        // dll.displayDLinkedList();
        // System.out.println();
        // dll.displayRDll();
        // System.out.println();
        // // dll.deleteAtPos(3);
        // // dll.deleteAtEnd();
        // // dll.insertAtEnd(10);
        // // dll.insertAtEnd(12);
        // dll.deleteAtBeginning();
        // dll.displayDLinkedList();
        // System.out.println();
        // dll.displayRDll();
        // // reverselLinkedList rll = new reverselLinkedList();
        // rll.insertData(1);
        // rll.insertData(2);
        // rll.insertData(3);
        // rll.insertData(4);
        // rll.displayAtReveral();
        // System.out.println();
        // rll.reversedList();
        // rll.displayAtReveral();

        // linkedlist<Integer> ll = new linkedlist<>();
        // ll.insertAtBeginning(4);
        // ll.insertAtBeginning(6);
        // ll.insertAtBeginning(2);
        // ll.insertAtBeginning(8);
        // ll.displayLinkedList();
        // System.out.println();
        // ll.insertAtPos(4, 10);
        // ll.insertAtPos(5, 7);
        // ll.displayLinkedList();
        // System.out.println();
        // // ll.deleteAtPos(4);
        // // System.out.println(ll.getIndex(4));
        // // ll.updateIndex(0, 3);
        // // ll.deleteAtEnd();
        // // ll.deleteAtBeginning();
        // ll.insertAtEnd(5);
        // ll.insertAtEnd(9);
        // System.out.println(ll.search(4));
        // System.out.println(ll.contains(3));

        // ll.displayLinkedList();
    }

    public static int[] plusOneArray(int[] n) {
        int size = n.length - 1;
        if (n[size] != 9) {
            n[size]++;
            return n;
        }
        List<Integer> lis = new ArrayList<>();
        long num = 0;
        for (int i = 0; i < n.length; i++) {
            num = num * 10 + n[i];
        }
        num += 1;
        long sum = 0;
        while (num != 0) {
            sum = num % 10;
            lis.add((int) sum);
            num /= 10;
        }
        lis = lis.reversed();
        System.out.print(lis);
        int[] arr = new int[lis.size()];
        for (int i = 0; i <= lis.size() - 1; i++) {
            arr[i] = lis.get(i);
        }
        return arr;

    }

    public static int revarseNumber(int num) {
        int r = 0;
        while (num != 0) {
            int n = num % 10;
            num /= 10;
            if (r > Integer.MAX_VALUE / 10 || r == Integer.MAX_VALUE / 10 && n > 7)
                return 0;
            if (r < Integer.MIN_VALUE / 10 || r == Integer.MIN_VALUE / 10 && n < -8)
                return 0;
            r = r * 10 + n;
        }
        return r;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int removedupilicateArray(int[] arr) {
        int size = arr.length - 1;
        int left = 0, identity = left + 1;
        while (left <= size && identity <= size) {
            if (arr[left] == arr[identity]) {
                identity++;
            } else {
                int temp = arr[left + 1];
                arr[left + 1] = arr[identity];
                arr[identity] = temp;
                left++;
                identity++;
            }
        }
        return left + 1;
    }

    public static void arrays(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void twoDArrays(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}
