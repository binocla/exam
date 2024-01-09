package task3;

import java.util.Scanner;

/**
 * Вводится двумерный массив целых чисел.
 * Проверить, что в каждом столбце массива существует не более 3х чисел
 * которые состоят только из одной цифры (1111, 55, 222)
 * Не использовать коллекции, регулярные выражения.
 * Из строковых методов разрешены только length, charAt, конкатенация.
 * Использовать String. Не использовать StringBuffer / StringBuilder
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(checkMatrix(arr));
    }

    public static boolean checkMatrix(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                String s = "" + arr[j][i]; // String.valueOf, Integer.toString()
                for (int k = 0; k < s.length() - 1; k++) {
                    if (s.charAt(k) != s.charAt(k + 1)) {
                        return false;
                    }
                }
                cnt++;
            }

            if (cnt > 3) {
                return false;
            }
        }
        return true;
    }
}
