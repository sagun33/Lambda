package lambdaanaders;

import lambdaanaders.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TekrarClassLambda03 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havucDilim", "güvec", "kokorec",
                "küşleme", "arabAşı", "waffle", "künefe", "güvec"));
        alfBykTekrsz(menu);
        System.out.println();
        chrSayisiTersSiraliUnique(menu);
        System.out.println();
        chrSayisiBykSirali(menu);
        System.out.println();
        harfSayisi7denAzKontrol(menu);
        System.out.println();
        wIleBaslayanElKontrol(menu);
        System.out.println();
        xIleBitenElKontrol(menu);
        System.out.println();
        charSayisiEnBykElPrint(menu);
        System.out.println();
        ilkElHrcSonHrfSiraliPrint(menu);
    }

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBykTekrsz(List<String> yemek) {
        yemek.stream().
                map(String::toUpperCase).
                sorted().distinct().
                distinct().
                forEach(t -> System.out.print(t + " "));

    }

    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrSayisiTersSiraliUnique(List<String> ikram) {
        ikram.stream().map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::yazdir);

    }

    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..
    public static void chrSayisiBykSirali(List<String> ikram) {
        ikram.stream().sorted(Comparator.comparing(String::length)).forEach(Lambda01::yazdir);

    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi7denAzKontrol(List<String> ikram) {
        System.out.println(ikram.stream().allMatch(t -> t.length() <= 7) ? "7 ve 7 den daha az harften olusuyor" : "olusmuyoor");

    }

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBaslayanElKontrol(List<String> ikram) {
        System.out.println(ikram.stream().noneMatch(t -> t.startsWith("w")) ? "true  "
                : "false");
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.
    public static void xIleBitenElKontrol(List<String> ikram) {
        System.out.println(ikram.stream().anyMatch(t -> t.endsWith("x")) ? "var true" : "yok false");

    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void charSayisiEnBykElPrint(List<String> ikram) {
        ikram.stream().
                         sorted(Comparator.comparing(String::length).
                         reversed()).
                         limit(1).
                         forEach(Lambda01::yazdir);
    }
    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkElHrcSonHrfSiraliPrint(List<String> ikram){
        ikram.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(1).forEach(Lambda01::yazdir);
    }



}
