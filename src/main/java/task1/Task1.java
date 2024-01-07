package task1;


import java.util.Scanner;

public class Task1 {
    /**
     * Вводится двумерный массив целых чисел.
     * Проверить, что существует такая строка двумерного массива,
     * в которой есть ровно два числа, которые не содержат в себе подряд двух цифр,
     * являющихся простыми числами (2, 3, 5, 7).
     * Не использовать регулярные выражения. // regex [*]
     * Не использовать коллекции.
     * Не использовать строки.
     * Не использовать классы оболочки (Integer, BigInteger и др.).
     */
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var a = in.nextInt();
        var b = in.nextInt();
        int[][] ar = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ar[i][j] = in.nextInt();
            }
        }

        // 22 22 12 // 1
        // 12 21 // 2
        for (int i = 0; i < ar.length /* a */; i++) {
            int cnt = 0;
            for (int j = 0; j < ar[i].length /* b */; j++) {
                if (isPrime(ar[i][j]) || hasTwoPrimeDigits(ar[i][j])) {
                    cnt = 0;
                } else {
                    cnt++;
                }
                if (cnt == 2) {
                    System.out.format("true - %s", i);
                    System.exit(0);
                }
            }
        }
        System.out.println("false");
    }

    // 1. Prime Checker
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2. HasTwoDigits
    public static boolean hasTwoPrimeDigits(int number) {
        int followingDigit = -1; // dummy
        // 1235
        while (number > 0) {
            int digit = number % 10; //
            if (followingDigit != -1 && isPrime(digit) && isPrime(followingDigit)) {
                return true;
            }

            followingDigit = digit; //
            // followingDigit - это число с "запозданием"
            number = number / 10; //
        }
        return false;
    }


}