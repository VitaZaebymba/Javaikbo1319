package Lab18;

public class Main {
    // разложение на множители
    public static void decomposition(int n, int k) {
        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        //  рекурсивное условие
        if (n % k == 0) {
            System.out.print(k + " ");
            decomposition(n / k, k);
        } //  рекурсивное условие
        else {
            decomposition(n, ++k);
        }
    }


    // палиндром
    public static String palindrome(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                //  рекурсивное условие
                return palindrome(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }


    // максимум последовательности
    public static int maximumOfSequence() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии
        else {
            return Math.max(n, maximumOfSequence());
        }
    }
    public static void main(String[] args) {
        System.out.println("Решение первой задачи: ");
        decomposition(150, 2);
        System.out.println("\n\nРешение второй задачи: " + palindrome("radar"));
        System.out.println("\nРешение третьей задачи.\nВведите последовательность чисел:");
        System.out.println(maximumOfSequence());
    }
}
