import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketUrunleri {

    public static String[] urunler = {"Ikram", "Cips", "Tutku" , "Nutella" ,
            "Hobby","Albeni","BenimO","Cekirdek","Dondurma","Jelibon","Tadelle"};
    public static double[] fiyatlar = {4.20,9.10,5.50,25.80,3.10,3.20,3.80,6.00,12.50,5.70,8.40};

    public static void marketUrunleriListele() {
        Scanner scan = new Scanner(System.in);
        String[] urunler = {"Ikram", "Cips", "Tutku" , "Nutella" ,
                "Hobby","Albeni","BenimO","Cekirdek","Dondurma","Jelibon","Tadelle"};
        double[] fiyatlar = {4.20,9.10,5.50,25.80,3.10,3.20,3.80,6.00,12.50,5.70,8.40};
        List<String> marketUrunleri = new ArrayList<>();
        List<Double> marUrunleriFiyat = new ArrayList<>();
        for (int i = 0; i < urunler.length; i++) {
            marketUrunleri.add(urunler[i]);
            marUrunleriFiyat.add(fiyatlar[i]);
            System.out.println("  " + (i + 1) + ".    " + marketUrunleri.get(i) + "      " + marUrunleriFiyat.get(i) + " TL");
        }
    }
}
