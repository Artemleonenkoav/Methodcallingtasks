package com.company;

public class Main {
    public static int min(int a, int b) {
        //напишите тут ваш код
int m2 ;
if (a<b)
    m2 = a;
else m2 = b ;
        return m2;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
