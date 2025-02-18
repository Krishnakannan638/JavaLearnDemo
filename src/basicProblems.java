import java.util.*;

public class basicProblems {

    public static int optimal(String s) {
        int right = s.length() - 1;
        while (right >= 0) {
            if (s.charAt(right) == ' ') {
                right--;
            } else {
                break;
            }
        }
        int count = 0;
        while (right >= 0) {
            if (s.charAt(right) != ' ') {
                count++;
                right--;
            } else {
                break;
            }
        }
        return count;
    }

    public static int searchWord(String w, char ch) {
        // char letter,ans;
        // for (int i = 0; i < w.length(); i++) {
        // letter = w.charAt(i);
        // ans =letter;
        // if (letter == ch) {
        // System.out.println("equal");
        // }
        // }
        return 0;
    }

    public static int searchNum(int[] a, int b) {
        int[] arr = a;
        // int search = b;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            pos++;
            if (arr[i] == b) {
                for (int j = pos - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
            } else if (pos - 1 <= i) {
                System.out.println(arr[i]);
            }
        }
        return 0;
    }

    public static String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
            }
        }
        if (index == 1) {
            return word;
        }
        char[] arr = word.toCharArray();
        int left = 0, right = index;
        if (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    static int[] twosSumAdd(int[] arr, int t) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1] == t)) {
                return new int[] { i, i + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static boolean palindrome(int num) {
        int temp = num, sum = 0, r;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }

    public static Boolean vaildPalindrome(String s) {
        char str;
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            str = s.charAt(i);
            if (Character.isLetterOrDigit(str)) {
                a += Character.toLowerCase(str);
            }
        }
        int left = 0;
        int right = a.length() - 1;
        while (left <= right) {
            if (a.charAt(left) == a.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    static Boolean palindrome11(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static int factorial(int n, int end) {
        int result;
        if (n == end) {
            return end;
        }
        result = factorial(n + 1, end) * n;
        System.out.println(n);
        return result;
    }

    public static int numberFactorial(int a, int b) {
        // List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if ((a % i) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int i = 1; i <= b; i++) {
            if ((b % i == 0)) {
                System.out.print(i + " ");
            }
        }
        return 0;
    }

    public static List<Integer> mergeTwoList(int[] list1, int[] list2) {
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i <= list1.length - 1; i++) {
            lis.add(list1[i]);
        }
        for (int i = 0; i <= list2.length - 1; i++) {
            lis.add(list2[i]);
        }
        Collections.sort(lis);
        return lis;
    }

}
