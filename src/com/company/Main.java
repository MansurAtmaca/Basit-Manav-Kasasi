package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****Manav Fiyat Listesi****\n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL\n"+
                "*****************");
        System.out.print("Armut Kaç Kilo: ");
        int armut = input.nextInt();
        System.out.print("Elma Kaç Kilo: ");
        int elma = input.nextInt();
        System.out.print("Domates Kaç Kilo: ");
        int domates = input.nextInt();
        System.out.print("Muz Kaç Kilo: ");
        int muz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo: ");
        int patlıcan = input.nextInt();

        double sonuc=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5);
        System.out.println("Toplam Tutar: "+sonuc);
    }
}
