package edu.lemonschool.practicework11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваш текст: ");
        String l = String.valueOf(scanner.nextLine());
        System.out.print("Введіть фразу для зрівнянна наявності в тексті: ");
        String w = String.valueOf(scanner.nextLine());
        System.out.println(search(l, w));
        System.out.print("Введіть ваш текст: ");
        String word = String.valueOf(scanner.nextLine());
        System.out.print("Введіть ваш текст, слово, яке з'являється у тексті: ");
        String word2 = String.valueOf(scanner.nextLine());
        System.out.println(audit(word, word2));
        System.out.print("Введіть фразу з верхніми регістрами: ");
        String m = String.valueOf(scanner.nextLine());
        System.out.print("Введіть фразу з нижнього регістру: ");
        String n =String.valueOf(scanner.nextLine());
        System.out.println(equalsIgnoreCase(m, n));
        System.out.print("Введіть фразу з для порівняння: ");
        String k = String.valueOf(scanner.nextLine());
        System.out.print("Введіть перше слово цієї фрази: ");
        String p =String.valueOf(scanner.nextLine());
        System.out.println(equalsFirstWord(k, p));
    }
    public static boolean searchWithDefaultFunction(String k, String word) {
       return k.endsWith(word);
    }
    public static boolean auditWithDefaultFunction(String l, String word){
        return l.contains(word);
    }
    public static boolean equalsIgnoreCaseWithDefaultFunction(String m, String n){
        return m.equalsIgnoreCase(n);
    }
    public  static  boolean equalsFirstWordWithDefaultFunction(String w1, String w2){
        return w1.startsWith(w2);
    }
    public static boolean search(String k, String word) {
        char[] charArray = k.toCharArray();
        char[] charArray2 = word.toCharArray();
        boolean a = false;
        int i = charArray.length - 1;
        int j = charArray2.length - 1;
        while (j >= 0 && i >= 0) {
            if (charArray[i] == charArray2[j]) {
                a = true;
                i--;
                j--;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }
    public static boolean audit(String l, String word){
        char[] charArray = l.toCharArray();
        char[] charArray2 = word.toCharArray();
        boolean a = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray2[0]) {
                int k = i;
                for (int j = 0; j < charArray2.length && k < charArray.length; j++) {
                    if (charArray[k] != charArray2[j]) {
                        break;
                    }
                    if (j == charArray2.length - 1) {
                        a = true;
                        break;
                    }
                    k++;
                }
                if (a) {
                    break;
                }
            }
        }

        return a;
    }


    public static boolean equalsIgnoreCase(String m, String n){
        if (m.length() != n.length()) {
            return false;
        }

        char[] charArray1 = m.toCharArray();
        char[] charArray2 = n.toCharArray();

        for (int i = 0; i < charArray1.length; i++) {
            char c1 = charArray1[i];
            char c2 = charArray2[i];

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
        }

        return true;
    }

    public  static  boolean equalsFirstWord(String w1, String w2){
        char[] charArray = w1.toCharArray();
        char[] charArray2 = w2.toCharArray();
        boolean a = false;
        int i = 0;
        int j = 0;
        while (j < charArray.length && i < charArray2.length) {
            if (charArray[i] == charArray2[j]) {
                a = true;
                i++;
                j++;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }
}