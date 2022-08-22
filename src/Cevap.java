import java.util.Scanner;

public class Cevap {
    static Scanner scan = new Scanner(System.in);

    public static void cevabiAl() {
        char cevap = scan.next().toUpperCase().charAt(0);
        if (cevap == 'T') {
            devamBolumu();
        } else if (cevap == 'F') {
            Odeme.odeme();
        } else {
            System.out.println("Lutfen gecerli bir giris yapiniz.");
            Cevap.cevabiAl();
        }
    }

    private static void devamBolumu() {
        System.out.println("\n  No      Bolum  " + "\n====== ===========" + "\n  1     Manav" + "\n  2     Sarkuteri" + "\n  3     Market"+"\nHangi bolumden devam etmek istersiniz.");
        int bolum = scan.nextInt();
        if (bolum == 1) {
            Manav.manavBolumu();
        } else if (bolum == 2) {
            Market.marketBolumu();
        } else if (bolum == 3) {
            Sarkuteri.sarkuteriBolumu();
        } else {
            System.out.println("Lutfen gecerli bir secim yapiniz");
        }

    }
}
