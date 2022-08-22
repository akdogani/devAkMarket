import java.util.Scanner;

public class Sarkuteri {

    public static void sarkuteriBolumu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n  No      Urun      Fiyat     " + "\n====== ========= ===========");

        SarkuteriUrunleri.sarkuteriUrunleriListele();
        System.out.println("  "+(SarkuteriUrunleri.urunler.length+1)+"     Ana Menu");
        System.out.println("Sarkuteri Bolumune hosgeldiniz. Lutfen alisveris yapmak istediginiz urunun numarasini giriniz:");
        int secim = scan.nextInt();
        if (secim==SarkuteriUrunleri.urunler.length+1){
            AnaMenu.karsilamaEkrani();
        }
        if (secim >= 1 && secim <= SarkuteriUrunleri.urunler.length) {
            System.out.println("Kaç kg satın almak istiyorsunuz?");
            double kg = scan.nextDouble();
            Odeme.getSepet().add(SarkuteriUrunleri.urunler[secim - 1]);
            Odeme.setToplam(SarkuteriUrunleri.fiyatlar[secim - 1] * kg);
            System.out.println(kg + " kg " + SarkuteriUrunleri.urunler[secim - 1] + " sepete eklendi." + "\nSepet : " + Odeme.getSepet()
                    +"\nGenel Toplam :"+Odeme.getToplam()+ "\nBaska bir urun almak ister misiniz? T/F");
            Cevap.cevabiAl();
        }
    }
}
