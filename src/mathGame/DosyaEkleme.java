package deneme2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DosyaEkleme {

    private String user;
    private int dogru;
    private int yanlis;
    private int skor;

    public DosyaEkleme(String user, int dogru, int yanlis, int skor) {
        this.user = user;
        this.dogru = dogru;
        this.yanlis = yanlis;
        this.skor = skor;
    }

    public void ekleBilgi() {
        String dosyaYolu = "resources/stats.txt";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String tarih = dateFormat.format(new Date());

        try {
            String dosyaIcerigi = new String(Files.readAllBytes(Paths.get(dosyaYolu)));
            
            try {
                FileWriter fileWriter = new FileWriter(dosyaYolu);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("");
                bufferedWriter.close();
             
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(user);
            
            String yeniBilgiler = user+" "+dogru+ " "+yanlis+" "+skor+" " + tarih;

            FileWriter fileWriter = new FileWriter(dosyaYolu, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dosyaIcerigi + "\n" + yeniBilgiler);
            bufferedWriter.close();

            System.out.println("Bilgiler dosyaya başarıyla eklendi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
