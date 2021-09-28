package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;

        System.out.println("Zadaj polomer kruhu v cm:");
        Scanner mojScanner = new Scanner(System.in);
          a  = mojScanner.nextInt();


        double b = 3.14 * (a * a);
        double c = 2 * 3.14 *a;
        System.out.println("Obsah kruhu je: " );
        System.out.println(b);
        System.out.println("Obvod kruhu je: " );
        System.out.println(c) ;


    }
}
