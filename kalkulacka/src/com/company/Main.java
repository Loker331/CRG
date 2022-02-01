package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        kalkulacka kalkulacka = new kalkulacka();
        Scanner sc = new Scanner(System.in);

        com.company.kalkulacka a = new com.company.kalkulacka();
        a.a = 99;
        a.b = 2;
        a.scitaj();

        a.b = 300;
        a.scitaj();

        System.out.println("Zadaj cislo a: " );
        kalkulacka.a = sc.nextInt();
        System.out.println("Zadaj cislo b: ");
        kalkulacka.b = sc.nextInt();
        kalkulacka.vydel();
    }
}
