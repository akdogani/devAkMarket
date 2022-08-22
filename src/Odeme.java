import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odeme {
    private static List<String> sepet = new ArrayList<>();
    private static double toplam;

    public static void setToplam(double toplam) {
        Odeme.toplam += toplam;
    }

    public static List<String> getSepet() {
        return sepet;
    }

    public static double getToplam() {
        return toplam;
    }

    public static void odeme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen odeme yontemini seciniz:" + "\n1. Nakit" + "\n2. Kredi karti");
        int secim = scan.nextInt();
        if (secim == 1) {
            nakit();
        } else if (secim == 2) {
            krediKarti();
        }else {
            System.out.println("Hatali secim");
        odeme();
        }
    }

    private static void nakit() {
        System.out.println("Aldiginiz urunler = " + sepet + "\nOdemeniz gereken tutar : " + toplam);
    }

    private static void krediKarti() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kredi karti bilgilerinizi giriniz." + "\nKart sahibinin adi : ");
        String isim = scan.nextLine();

        System.out.println("Soyadi : ");
        String soyisim = scan.nextLine();
        String kartNo="";

        for (int i = 0; i < 1; i++) {
            System.out.println("Kart no : ");
            kartNo = scan.next();
            if (kartNo.length()!=16) {
                System.out.println("Hatali giris. Kart numarasi 16 haneli olmalidir.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Son kullanma tarihi ay : ");
            int sktAy = scan.nextInt();
            if (sktAy < 1 || sktAy > 12) {
                System.out.println("Hatali giris. Lutfen gecerli bir ay giriniz.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Son kullanma tarihi yil : "+"\nOrnek=>2024");
            int sktYil = scan.nextInt();
            if (sktYil< LocalDate.now().getYear() || sktYil> 2032) {
                System.out.println("Hatali giris. Lutfen yil bilgisini 4 haneli olacak sekilde giriniz.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("CVC kodu : ");
            String cvc = scan.next();
            if (cvc.length()!=3){
                System.out.println("Hatali giris. Lutfen 3 haneli CVC kodunuzu giriniz.");
                i--;
            }
        }

        System.out.println("Lutfen cep telefonunuza gelen 6 haneli onay kodunu giriniz.");
        String onayKodu = scan.next();
        if (onayKodu.length()==6){
            bilgileriYazdir(isim,soyisim,kartNo);
            System.out.println("Siparisiniz basariyla olusturuldu.");
        }else {
            System.out.println("Onay kodu hatali. Islem basarisiz!"+
                    "\nBilgilerinizi yeniden girdikten sonra lutfen gecerli bir onay kodu giriniz.");
            krediKarti();
        }
    }

    private static void bilgileriYazdir(String isim, String soyisim, String kartNo) {
        String isimIlkIki = isim.substring(0,2).toUpperCase();
        String isimGeriyeKalan = isim.substring(2);
        isimGeriyeKalan = isimGeriyeKalan.replaceAll("\\w","*");

        String soyisimIlkIki = soyisim.substring(0,2).toUpperCase();
        String soyisimGeriyeKalan = soyisim.substring(2);
        soyisimGeriyeKalan = soyisimGeriyeKalan.replaceAll("\\w","*");

        String kartNoSakla = "**** **** **** ";
        String kartNoSonDort = kartNo.substring(kartNo.length()-4);

        System.out.println(isimIlkIki+isimGeriyeKalan+" "+soyisimIlkIki+soyisimGeriyeKalan+"\n"+kartNoSakla+kartNoSonDort);
    }
}




