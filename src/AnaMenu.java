import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaMenu {

    public static void karsilamaEkrani() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****DevAk Markete Hosgeldiniz*****"
                + "\n  No      Bolum  " + "\n====== ===========" + "\n  1     Manav" + "\n  2     Sarkuteri" + "\n  3     Market"
                + "\nLutfen alisveris icin ilgili menuyu seciniz:");
        int secim = scan.nextInt();
        if (secim == 1) {
                Manav.manavBolumu();
        }else if (secim == 2) {
                Sarkuteri.sarkuteriBolumu();
        }else if (secim == 3) {
                Market.marketBolumu();
        }else {
            System.out.println("Lutfen gecerli bir giris yapiniz.");
            karsilamaEkrani();
        }
    }
}
