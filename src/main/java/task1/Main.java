package task1;

import java.util.Scanner;

public class Main {
    /**
     * Variant 1
     * Вводится двумерный массив строк. Проверить что в каждой строчке массива
     * есть ровно 3 строки, которые являются палиндромами
     * <p>
     * Не использовать regex, StringBuffer, StringBuilder, коллекции.
     * Разрешено использовать length, charAt, concat
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        String[][] arr = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = in.next();
            }
        }
        System.out.println(checkIfThreeLinesArePalindromes(arr));
    }

    public static boolean isPalindrome(String s) {
        int size = s.length(); // длина строки
        // [0...5]
        for (int i = 0; i < (size / 2); i++) { // половина строки
            if (s.charAt(i) != s.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfThreeLinesArePalindromes(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0; // счётчик строк (String)
            for (int j = 0; j < arr[i].length; j++) {
                if (isPalindrome(arr[i][j])) {
                    cnt++; // 5, 2, 0, 123
                }
            }
            if (cnt != 3) {
                return false;
            }
        }
        return true;
    }
}