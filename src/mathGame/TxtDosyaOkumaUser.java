package deneme2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtDosyaOkumaUser {
    private String dosyaYolu;
    private String[] satirlar;
    private String veri1;
    private String veri2;
    private String veri3;
    private String veri4;
    private String veri5;

    public TxtDosyaOkumaUser(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
        okuDosya();
    }

    private void okuDosya() {
        try {
            FileReader fr = new FileReader(dosyaYolu);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            br.close();

            satirlar = satir.split(" ");
            if (satirlar.length >= 5) {
                veri1 = satirlar[0];
                veri2 = satirlar[1];
                veri3 = satirlar[2];
                veri4 = satirlar[3];
                veri5 = satirlar[4];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getVeri1() {
        return veri1;
    }

    public String getVeri2() {
        return veri2;
    }

    public String getVeri3() {
        return veri3;
    }

    public String getVeri4() {
        return veri4;
    }

    public String getVeri5() {
        return veri5;
    }

}