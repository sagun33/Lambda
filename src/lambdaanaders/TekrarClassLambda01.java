package lambdaanaders;

import lambdaanaders.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarClassLambda01 {

    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        printElStructured(sayi);
        System.out.println("\n**********");
        printElStructured1(sayi);
        System.out.println("\n***********");
        printAlFunctional1(sayi);
        System.out.println("\n**********");
        ciftBul(sayi);
        System.out.println("\n**********");
        otuzDorttenKucukCift(sayi);
        System.out.println("\n**********");
        otuzDorttenBuyukCift1(sayi);
        System.out.println("\n**********");
        otuzDorttenBuyukCift2(sayi);


    }

    //TASK 1 : "Structured Programming" kullanarak list elemanlarını
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElStructured(List<Integer> sayi) {
        sayi.stream().forEach((t) -> System.out.print(t + " "));
    }
    //TASK 2 : "functional Programming" kullanarak list elemanlarını
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElStructured1(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);

    }

    public static void yazdir(int a) {

        System.out.print(a + " ");
    }

    public static void printAlFunctional1(List<Integer> sayi) {
        sayi.stream().forEach(Lambda01::yazdir);
    }
    //TASK 3 : functional Programming ile list elemanlarinin
    // cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void ciftBul(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).forEach(Lambda01::yazdir);

    }

    public static boolean ciftBul(int a) {
        return a % 2 == 0;


    }

    //TASK 5:functional Programming ile list elemanlarinin 34 den kucuk
    // cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void otuzDorttenKucukCift(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).filter(t -> t < 34).forEach(Lambda01::yazdir);

    }

    //Task 6: functional Programming ile list elemanlarinin 34 den buyk
    //ve cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void otuzDorttenBuyukCift1(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 34).forEach(Lambda01::yazdir);

    }

    //Task 6: functional Programming ile list elemanlarinin 34 den buyk
    //veya cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void otuzDorttenBuyukCift2(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 || t > 34).forEach(Lambda01::yazdir);

    }



}



