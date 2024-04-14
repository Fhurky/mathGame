package deneme2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtToExcelConverter {

    public static void convertToExcel() {
        String txtDosyaYolu = "resources/stats.txt";
        String excelDosyaYolu = "resources/s.xlsx";

        try {
            List<String[]> veriler = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(txtDosyaYolu));
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] bilgiler = satir.split(" ");
                veriler.add(bilgiler);
            }
            br.close();

            FileWriter fw = new FileWriter(excelDosyaYolu);
            for (String[] bilgiler : veriler) {
                for (String bilgi : bilgiler) {
                    fw.append(bilgi).append("\t");
                }
                fw.append("\n");
            }
            fw.close();

            System.out.println("Veriler başarıyla Excel'e aktarıldı.");
        } catch (IOException e) {
        	System.out.println("Dosya işleme hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
