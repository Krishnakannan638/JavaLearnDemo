import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] n = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] ans = plusOneArray(n);

        for (int i : ans) {
            System.out.print(i + " ");
        }
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
