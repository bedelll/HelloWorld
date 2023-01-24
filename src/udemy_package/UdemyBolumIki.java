package udemy_package;
public class UdemyBolumIki {
    public static void main(String[] args) {

        //Arttırma ve Azaltmalar ++Number, --Number
        /*
        int sayi1 = 10;
        int sayi2 = ++sayi1; // Sayı2 = 11 //Sayi1 = 11
        System.out.println("Sayı1: " + sayi1 + "Sayi2: " + sayi2);
        int sayi3 = sayi1--; //Sayı3 =11 Sayi1=11
        System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++));
        System.out.println("Sayi3: " + sayi3);
         */

        //ÖDEV
        double ondalikliSayi=6.50;
        double sonuc = 0;
        sonuc++;
        System.out.println("SonucİlkHal: " + sonuc); //Sonuç = 1
        ondalikliSayi *= sonuc;
        System.out.println("OndalıkliSayi: "+ ondalikliSayi); // Ondalikli Sayı = 6.5
        System.out.println("Sonuç : " + sonuc); // Sonuç = 1

        //ÖDEV 2
        int s1 = 10;
        int s2 = 6;
        s1++;
        System.out.println("S1 İlk: " + s1); // S1 = 11
        --s2;
        System.out.println("S2 ilk: " + s2); //S2 = 5

        s1 *= --s2; //sonuç = 44
        System.out.println((s1 *= --s2)); //132

        System.out.println("S1 Son: " + s1); //132
        System.out.println("S2 Son: " + s2); //3

        //İşlem Önceliği Ödev
        int sayi1=15;
        int sayi2 = 5;
        int sonuc1;
        sonuc1 = (sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1; // (20) + 5 -60 + 15 = -20
        System.out.println("Sonuc 1: " + sonuc1);
        sonuc1 = (sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1; //(77) + 75 + 16 = 168
        System.out.println("Sonuc 2: " + sonuc1);

        //Udemy 2. Kurs Bölüm 20 Ödev Soruları
        //Soru1
        int saniye = 1210;
        int dakika;
        int saniyeIki;
        saniyeIki = saniye%60;
        dakika = (saniye-saniyeIki)/60;
        System.out.println("DAKİKA: " + dakika + " Saniye: " + saniyeIki);
        //Soru3
        int yil = 4000;
        if ((yil%400)==0 || ((yil%4)==0 && (yil%100)!=0)){
            System.out.println("Girilen Yıl Artık Yıldır");
        }
        //KOŞUL YAPISI ÇARŞAMBA GÜNÜ İŞLENECEK
    }
}
