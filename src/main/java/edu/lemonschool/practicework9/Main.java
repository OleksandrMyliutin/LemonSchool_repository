package edu.lemonschool.practicework9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше число: ");
        int num = scanner.nextInt();
        System.out.println("Ваш трикутник за заданим розміром");
        scanner.close();
        triangular(num);
        System.out.println("\nРух до вашого заданного чилса");
        numbers(num);

    }

    public static void triangular(int k) {
        if (k > 0) {
            triangular(k - 1);
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void numbers(int l) {
        if (l > 0) {
            numbers(l - 1);
            System.out.print(l);
        }
    }
}