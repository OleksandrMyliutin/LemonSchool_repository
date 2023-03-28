package Leson9_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше число: ");
        int num = scanner.nextInt();
        scanner.close();
        triangular(num);
        numbers(num);

    }
    public static void triangular(int k){
        if (k > 0){
            triangular(k - 1);
            for (int i = 0; i < k; i++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void numbers(int l){
        if (l>0)
            System.out.println("Bark");
    }
}