import java.util.List;
import java.util.Scanner;

public class Manav {

    public static void manavBolumu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n  No      Urun      Fiyat     " + "\n====== ========= ===========");

        ManavUrunleri.manavUrunleriListele();
        System.out.printf("\n" + (ManavUrunleri.urunler.length + 1) + ".\t\tAna Menu");
        System.out.printf("\nManav Bolumune hosgeldiniz. Lutfen alisveris yapmak istediginiz urunun numarasini giriniz:\n");
        int secim = scan.nextInt();
        if (secim == ManavUrunleri.urunler.length + 1) {
            AnaMenu.karsilamaEkrani();
        }
        if (secim >= 1 && secim <= ManavUrunleri.urunler.length) {
            System.out.println("Kaç kg satın almak istiyorsunuz?");
            double kg = scan.nextDouble();
            Odeme.getSepet().add(ManavUrunleri.urunler[secim - 1]);
            Odeme.setToplam(ManavUrunleri.fiyatlar[secim - 1] * kg);
            System.out.println(kg + " kg " + ManavUrunleri.urunler[secim - 1] + " sepete eklendi." + "\nSepet : " + Odeme.getSepet()
                    + "\nGenel Toplam :" + Odeme.getToplam() + "\nBaska bir urun almak ister misiniz? T/F");
            Cevap.cevabiAl();
        }
    }
}



