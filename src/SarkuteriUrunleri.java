import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SarkuteriUrunleri {

    public static String[] urunler = {"Pastirma", "Kavurma", "Sosis", "Sucuk",
            "Salam", "Tavuk", "Bonfile", "Kofte", "Yumurta", "Zeytin", "Kasar Peyniri"};
    public static double[] fiyatlar = {200.95, 125.30, 55.40, 152.95, 40.85, 65.90, 175.50, 85.40, 43.70, 32.80, 74.50};

    public static void sarkuteriUrunleriListele() {
        Scanner scan = new Scanner(System.in);
        String[] urunler = {"Pastirma", "Kavurma", "Sosis", "Sucuk",
                "Salam", "Tavuk", "Bonfile", "Kofte", "Yumurta", "Zeytin", "Kasar Peyniri"};
        double[] fiyatlar = {200.95, 125.30, 55.40, 152.95, 40.85, 65.90, 175.50, 85.40, 43.70, 32.80, 74.50};
        List<String> sarkuteriUrunleri = new ArrayList<>();
        List<Double> sUrunleriFiyat = new ArrayList<>();
        for (int i = 0; i < urunler.length; i++) {
            sarkuteriUrunleri.add(urunler[i]);
            sUrunleriFiyat.add(fiyatlar[i]);
            System.out.println("  " + (i + 1) + ".    " + sarkuteriUrunleri.get(i) + "      " + sUrunleriFiyat.get(i) + " TL");
        }
    }
}
