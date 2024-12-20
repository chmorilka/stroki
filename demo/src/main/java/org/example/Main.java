package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        povtor1();
        vhod2();
        onetwo3();
        delete4();
    }

    public static void povtor1() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = scanner.nextLine();
        System.out.println("Введите количество повторений");
        String i = scanner.nextLine();

        try {
            String result = pop(s, i);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String pop(String s, String i) {
        int n = Integer.parseInt(i);
        if (n < 0) {
            throw new IllegalArgumentException("N меньше нуля");
        }
        if (n == 0) {
            System.out.println("");
        }
        String result = "";
        for (int b = 0; b < n; ++b) {
            result += s;
        }
        return result;
    }

    public static void vhod2() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = scanner.nextLine();
        try {
            int result = vhod(s1, s2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    @SuppressWarnings("unused")
    public static int vhod(String s1, String s2) {
        if (s2.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или ноль");
        } else if (s2 == null) {
            throw new IllegalArgumentException("Строка null");
        }
        int s1rasmer = s1.length();
        int s2rasmer = s2.length();
        int vhod = 0;
        for (int i = 0; i <= s1rasmer - s2rasmer; i++) {
            boolean otvet = true;
            for (int j = 0; j < s2rasmer; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    otvet = false;
                    break;
                }
            }
            if (otvet) {
                otvet = true;
                vhod++;
                i += s2rasmer - 1;
            }
        }
        return vhod;
    }

    public static void onetwo3() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = scanner.nextLine();
        try {
            String result = onetwo(s);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
        public static String onetwo(String s){
            if (s.isEmpty()) {
                throw new IllegalArgumentException("Строка пустая или ноль");
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char zamena = s.charAt(i);
                switch (zamena) {
                    case '1':
                        sb.append(" один ");
                        break;
                    case '2':
                        sb.append("два ");
                        break;
                    case '3':
                        sb.append("три ");
                        break;
                    default:
                        sb.append(zamena);
                }
            }
            return sb.toString();
        }

        public static void delete4 () {
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку");
            String s = scanner.nextLine();
            try {
                String result = delete(s);
                System.out.println(result);
            }catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        public static String delete (String s){
            if (s.isEmpty()) {
                throw new IllegalArgumentException("Строка пустая или ноль");
            }
            StringBuilder sb = new StringBuilder(s);
            for (int i = 1; i < sb.length(); i++){
                sb.deleteCharAt(i);
            }
            return sb.toString();
        }
    }