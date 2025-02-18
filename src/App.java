import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertAtBeginning(8);
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(4);
        dll.insertAtBeginning(9);
        dll.insertAtBeginning(3);
        dll.displayDLinkedList();
        System.out.println();
        dll.displayRDll();
        System.out.println();
        // dll.deleteAtPos(3);
        // dll.deleteAtEnd();
        dll.insertAtEnd(10);
        dll.insertAtEnd(12);

        dll.displayDLinkedList();
        System.out.println();
        dll.displayRDll();
        // reverselLinkedList rll = new reverselLinkedList();
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
