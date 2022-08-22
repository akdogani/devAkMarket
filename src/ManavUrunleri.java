import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavUrunleri {
    public static String[] urunler = {"Domates", "Patates", "Biber" , "Sogan" , "Havuc","Elma","Muz","Cilek","Kavun","Uzum","Limon"};
    public static double[] fiyatlar = {2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50};
    public static void manavUrunleriListele() {
        Scanner scan = new Scanner(System.in);
        String[] urunler = {"Domates", "Patates", "Biber" , "Sogan" , "Havuc","Elma","Muz","Cilek","Kavun","Uzum","Limon"};
        double[] fiyatlar = {2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50};
        List<String> manavUrunleri = new ArrayList<>();
        List<Double> mUrunleriFiyat = new ArrayList<>();
        for (int i = 0; i < urunler.length; i++) {
            manavUrunleri.add(urunler[i]);
            mUrunleriFiyat.add(fiyatlar[i]);
            System.out.printf("\n"+(i+1)+".\t\t"+manavUrunleri.get(i)+"\t\t"+mUrunleriFiyat.get(i)+" TL");
        }
    }
}

