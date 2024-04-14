package deneme2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class TxtDosyaDuzenleme {
    private int veriEkle;
    private String veri;

    public TxtDosyaDuzenleme(int veriEkle) {
        this.veriEkle = veriEkle;
    }

    public void duzenle(String dosyaYolu) {
        try {
           
            FileReader fr = new FileReader(dosyaYolu);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            br.close();

            
            String[] degerler = satir.split(" ");

            
            for (int i = 0; i < degerler.length - 1; i++) {
                degerler[i] = degerler[i + 1];
            }

            
            degerler[degerler.length - 1] = String.valueOf(veriEkle);

            
            FileWriter fw = new FileWriter(dosyaYolu);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.join(" ", degerler));
            bw.close();

            System.out.println("Dosya güncellendi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void duzenleIsim(String dosyaYolu, String veri_1) {
    	try {
            
            FileReader fr = new FileReader(dosyaYolu);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            br.close();

            
            String[] degerler = satir.split(" ");
            Collections.reverse(Arrays.asList(degerler));
            
            for (int i = 0; i < degerler.length - 1; i++) {
                degerler[i] = degerler[i + 1];
            }
                        
            degerler[degerler.length - 1] = veri_1;          
            Collections.reverse(Arrays.asList(degerler));
            
            FileWriter fw = new FileWriter(dosyaYolu);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.join(" ", degerler));
            bw.close();

            System.out.println("Dosya güncellendi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }
}