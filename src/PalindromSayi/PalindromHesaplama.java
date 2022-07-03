package PalindromSayi;

import java.util.EnumMap;

public class PalindromHesaplama {

    static boolean isPolindrom (int num){

        int sayi = num;
        int yeniSayi=0;
        int sonSayi;
        int sonBas;

        while (sayi !=0 ) {

            System.out.println("==========");

            sonBas = sayi % 10;
            System.out.println("Son basamak: " + sonBas);

            yeniSayi = (yeniSayi*10) + sonBas;
            System.out.println("Yeni sayi: " + yeniSayi);

            sayi = sayi / 10;
            System.out.println("Num: " + sayi);
        }

        if (yeniSayi == num){
            System.out.println("girilen sayi poliondromdur.");
        }else {
            System.out.println("Sayi poliondrom degildir.");
        }
        return true;
    }

    public static void main(String[] args) {
        isPolindrom(303);

    }
}
