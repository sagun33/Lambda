package lambdaanaders;

import java.util.*;

public class TekrarClassLambda02 {


    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));

        LCEK(sayi);
        System.out.println("\n********");
        LTEKBFAS(sayi);
        System.out.println("\n********");
        LTEKBFAS1(sayi);
        System.out.println("\n********");
        LCEKKAS(sayi);
        System.out.println("\n********");
        enBE(sayi);
        System.out.println("\n********");
        structuredMAxElBul(sayi);
        System.out.println("\n********");
        ciftKareMaxPrint(sayi);
        System.out.println("\n********");
        tET(sayi);
        System.out.println("\n********");
//        tET1(sayi);
        System.out.println("\n********");
        ciftCarp(sayi);
        System.out.println("\n********");
        minBul(sayi);
        System.out.println("\n********");
        bestenBykTekKck(sayi);
        System.out.println("\n********");
        ciftKareKbSortPrint(sayi);


    }

    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz
    public static void LCEK(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::yazdir);

    }

    // Task-2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda
    // aralarina bosluk birakarak print ediniz
    public static void LTEKBFAS(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 != 0).map(t -> (t * t * t) + 1).forEach(Lambda01::yazdir);


    }

    public static boolean tekSayiMi(int a) {
        return a % 2 != 0;

    }

    // Task-2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda
    // aralarina bosluk birakarak print ediniz
    public static void LTEKBFAS1(List<Integer> sayi) {
        sayi.stream().filter(TekrarClassLambda02::tekSayiMi).map(TekrarClassLambda02::Kup).forEach(TekrarClassLambda01::yazdir);


    }

    public static int Kup(int a) {
        return (a * a * a) + 1;
    }

    // Task-3 : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void LCEKKAS(List<Integer> sayi) {
        sayi.stream().filter(TekrarClassLambda01::ciftBul).map(Math::sqrt).forEach(TekrarClassLambda02::yazdir1);

    }

    public static void yazdir1(double a) {
        System.out.print(a + " ");

    }

    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void enBE(List<Integer> sayi) {
        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        System.out.println(maxSayi);


    }

    // Structured yapı ile çözelim
    public static void structuredMAxElBul(List<Integer> sayi) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sayi.size(); i++) {
            if (sayi.get(i) > max) {
                max = sayi.get(i);
            }

        }
        System.out.println(max);
    }

    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKareMaxPrint(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).forEach(t -> System.out.println(t + " "));
    }

    //6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    public static void tET(List<Integer> l) {
        int toplam = l.stream().reduce(0, (a, b) -> a + b);
        System.out.println(toplam);

    }

    //6:2.yol  List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
//    public static void tET1(List<Integer> l){
//        Optional<Integer> toplam =l.stream().reduce(Integer::sum);
//        System.out.println(toplam);
//
//    }
    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer> sayi) {
        int carpim = sayi.stream().filter(Lambda01::ciftBul).reduce(1, (a, b) -> a * b);
        System.out.println(carpim);
    }

    // Task-8 : List'teki elemanlardan en kucugunu  print ediniz.
    public static void minBul(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Methods::min));
    }

    // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void bestenBykTekKck(List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 != 0).reduce(Methods::min));
    }

    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKareKbSortPrint(List<Integer> sayi){
        sayi.stream().filter(Methods::cift).map(t->t*t).sorted().forEach(Lambda01::yazdir);
    }

}








