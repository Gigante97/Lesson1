import java.util.Scanner;
//Задвние 1
public class FirstApp {
    public static void main(String[] args) {
        //Задание 2
        byte bt = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double db = 6.0;
        char ch = '*';
        boolean logic = false;

        //Задание 3
        System.out.println("Значение выражения a * (b + (c / d)) равняется " + function(1, 2, 3, 4));
        //Задание 4
        System.out.println("Сумма 2х чисел находится в пределах от 10 до 20? " + sum(1, 3));
        //Задание 5
        sign(7);
        //Задание 6
        System.out.println("Число отрицательное? " + signBolean(-1));
        //Задание 7
        MyName("Кирилл");
        //Задание 8
        leapYear(2020);
    }

    static float function(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean sum(int g, int j) {
        int o = g + j;
        if (o >= 10 && o <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void sign(int u) {
        if (u >= 0) {
            System.out.println("Число " + u + " положительное");
        } else {
            System.out.println("Число " + u + " отрицательное");
        }

    }

    static boolean signBolean(int p) {
        if (p < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void MyName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void leapYear(int year) {

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
