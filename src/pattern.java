public class pattern {

    // The Number Pattern
    // Input Format: N = 3
    // Result:
    // 3 3 3 3 3
    // 3 2 2 2 3
    // 3 2 1 2 3
    // 3 2 2 2 3
    // 3 3 3 3 3
    public void pattern22(int val) {
        int size = 2 * val - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((val - min) + " ");
            }
            System.out.println();
        }
    }

    // Hollow Rectangle Pattern
    // Input Format: N = 6
    // Result:
    // ******
    // * *
    // * *
    // * *
    // * *
    // ******
    public void pattern21(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                if (i == 0 || j == 0 || i == val - 1 || j == val - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Symmetric-Butterfly Pattern
    // Input Format: N = 6
    // Result:
    // * *
    // ** **
    // *** ***
    // **** ****
    // ***** *****
    // ************
    // ***** *****
    // **** ****
    // *** ***
    // ** **
    // * *
    public void pattern20(int val) {
        int space = 2 * (val - 1);
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
        int s = 2;
        for (int i = val - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            s += 2;
            System.out.println();
        }
    }

    // Symmetric-Void Pattern
    // Input Format: N = 6
    // Result:
    // ************
    // ***** *****
    // **** ****
    // *** ***
    // ** **
    // * *
    // * *
    // ** **
    // *** ***
    // **** ****
    // ***** *****
    // ************
    public void pattern19(int val) {
        int s = 0;
        for (int i = val; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            s += 2;
            System.out.println();
        }

        int space = 2 * (val - 1);
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            space -= 2;
        }
    }

    // Alpha-Triangle Pattern
    // Input Format: N = 6
    // Result:
    // F
    // E F
    // D E F
    // C D E F
    // B C D E F
    // A B C D E F
    public void pattern18(int val) {
        for (int i = 0; i < val; i++) {
            for (char ch = (char) (int) ('A' + val - 1 - i); ch <= 'A' + val - 1; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Input Format: N = 6
    // Result:
    // 6
    // 5 6
    // 4 5 6
    // 3 4 5 6
    // 2 3 4 5 6
    // 1 2 3 4 5 6
    public void pattern181(int v) {
        int val = v + 1;
        for (int i = 0; i < val; i++) {
            for (int j = val - i; j <= val - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Alpha-Hill Pattern
    // Input Format: N = 6
    // Result:
    // A
    // ABA
    // ABCBA
    // ABCDCBA
    // ABCDEDCBA
    // ABCDEFEDCBA
    public void pattern17(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= (2 * i + 1) / 2)
                    ch++;
                else
                    ch--;
            }
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Alpha-Ramp Pattern
    // Input Format: N = 6
    // Result:
    // A
    // B B
    // C C C
    // D D D D
    // E E E E E
    // F F F F F F
    public void pattern16(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (int) ('A' + i) + " ");
            }
            System.out.println();
        }
    }

    // Reverse Letter Triangle Pattern
    // Input Format: N = 6
    // Result:
    // A B C D E F
    // A B C D E
    // A B C D
    // A B C
    // A B
    // A
    public void pattern15(int val) {
        for (int i = val; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Increasing Letter Triangle
    // Input Format: N = 6
    // Result:
    // A
    // A B
    // A B C
    // A B C D
    // A B C D E
    // A B C D E F
    public void pattern14(int val) {
        for (int i = 0; i <= val; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Increasing Number Triangle
    // nput Format: N = 6
    // Result:
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    // 16 17 18 19 20 21
    public void pattern13(int val) {
        int num = 1;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    // Number Crown Pattern
    // Input Format: N = 3
    // Result:
    // 1 1
    // 12 21
    // 123321
    public void pattern12(int val) {
        int space = 2 * (val - 1);
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    // Binary Number Triangle
    // Input Format: N = 6
    // Result:
    // 1
    // 01
    // 101
    // 0101
    // 10101
    // 010101
    public void pattern11(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Half Diamond Star Pattern
    // Input Format: N = 3
    // Result:
    // *
    // **
    // ***
    // **
    // *
    public void pattern10(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = val - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond Star Pattern
    // Input Format: N = 3
    // Result:
    // *
    // ***
    // *****
    // *****
    // ***
    // *
    public void pattern9(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = val - 1; i >= 0; i--) {
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Inverted Star Pyramid
    // Input Format: N = 3
    // Result:
    // *****
    // ***
    // *
    public void pattern8(int val) {
        for (int i = val - 1; i >= 0; i--) {
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Star Pyramid
    // Input Format: N = 3
    // Result:
    // *
    // ***
    // *****
    public void pattern7(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < val - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Inverted Numbered Right
    // Input Format: N = 3
    // Result:
    // 1 2 3
    // 1 2
    // 1
    public void pattern6(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Inverted Right Pyramid
    // Input Format: N = 3
    // Result:
    // * * *
    // * *
    // *
    public void pattern5(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right-Angled Number Pyramid
    // Input Format: N = 3
    // Result:
    // 1
    // 2 2
    // 3 3 3
    public void pattern4(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Right-Angled Number Pyramid
    // Input Format: N = 3
    // Result:
    // 1
    // 1 2
    // 1 2 3
    public void pattern3(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Right-Angled Triangle Pattern
    // Input Format: N = 3
    // Result:
    // *
    // * *
    // * * *
    public void pattern2(int val) {
        for (int i = 0; i <= val; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Rectangular Star Pattern
    // Input: N = 3
    // Output:
    // * * *
    // * * *
    // * * *

    public void pattern1(int val) {
        for (int i = 0; i <= val; i++) {
            for (int j = 0; j <= val; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
