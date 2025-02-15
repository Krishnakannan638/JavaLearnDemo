import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String test = "()";
        System.out.println( isValid(test));
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
