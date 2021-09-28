package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Zadajte koeficienty a b c v rovnici ");

        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        int b = sc1.nextInt();

        int c = sc1.nextInt();

        int d = (b * b) - 4 * a * c;

        double o1 = Math.pow(d,2);

        double x1 = (-b + o1) / (2 * a);
        double x2 = (-b - o1) / ( 2 * a);

        if (d < 0){
            System.out.println("Rovnica nema riesenie.");
        } else {
            System.out.println("Rovnica ma korene " + x1 + " " + x2);
        }
    }
}