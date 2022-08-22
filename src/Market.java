import java.util.Scanner;

public class Market {
    public static void marketBolumu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n  No      Urun      Fiyat     " + "\n====== ========= ===========");

        MarketUrunleri.marketUrunleriListele();
        System.out.println("  "+(MarketUrunleri.urunler.length+1)+"     Ana Menu");
        System.out.println("Market Bolumune hosgeldiniz. Lutfen alisveris yapmak istediginiz urunun numarasini giriniz:");
        int secim = scan.nextInt();
        if (secim==MarketUrunleri.urunler.length+1){
            AnaMenu.karsilamaEkrani();
        }
        if (secim >= 1 && secim <= MarketUrunleri.urunler.length) {
            System.out.println("Kaç adet satın almak istiyorsunuz?");
            int adet = scan.nextInt();
            Odeme.getSepet().add(MarketUrunleri.urunler[secim - 1]);
            Odeme.setToplam(MarketUrunleri.fiyatlar[secim - 1] * adet);
            System.out.println(adet + " adet " + MarketUrunleri.urunler[secim - 1] + " sepete eklendi." + "\nSepet : " + Odeme.getSepet()
                    +"\nGenel Toplam :"+Odeme.getToplam()+ "\nBaska bir urun almak ister misiniz? T/F");
            Cevap.cevabiAl();
        }
    }
}

