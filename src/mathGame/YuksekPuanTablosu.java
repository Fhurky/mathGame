package deneme2;

import java.io.*;

public class YuksekPuanTablosu {
	
    public String getDosyaYolu() {
		return dosyaYolu;
	}

	public void setDosyaYolu(String dosyaYolu) {
		this.dosyaYolu = dosyaYolu;
	}

	private String dosyaYolu;
    private int[] puanlar;
    private String[] userlar;
    private String user;

    public YuksekPuanTablosu(String dosyaYolu, String user) {
        this.dosyaYolu = dosyaYolu;
        this.puanlar = new int[5];
        this.userlar = new String[5];
        this.user = user;
        okuPuanlar();
        okuUser();
    }

    private void okuPuanlar() {
        try {
            FileReader fr = new FileReader(dosyaYolu);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            br.close();

            String[] degerler = satir.split(" ");
            for (int i = 0; i < 5; i++) {
                puanlar[i] = Integer.parseInt(degerler[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void okuUser() {
        try {
            FileReader fr1 = new FileReader("resources/skorUSER.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            String satir = br1.readLine();
            br1.close();

            String[] degerler = satir.split(" ");
            for (int i = 0; i < 5; i++) {
                userlar[i] = degerler[i];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void yazPuanlar() {
        try {
            FileWriter fw = new FileWriter(dosyaYolu);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.join(" ", String.valueOf(puanlar[0]), String.valueOf(puanlar[1]), String.valueOf(puanlar[2]), String.valueOf(puanlar[3]), String.valueOf(puanlar[4])));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void yazUser() {
        try {
            FileWriter fw1 = new FileWriter("resources/skorUSER.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write(String.join(" ", userlar[0], userlar[1], userlar[2], userlar[3], userlar[4]));
            bw1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void eklePuan(int yeniPuan) {
        if (yeniPuan > puanlar[4]) {
            puanlar[4] = yeniPuan;
            userlar[4] = user;
            siralaPuanlar();
            yazPuanlar();
            yazUser();
            System.out.println("Puan eklendi ve tablo güncellendi.");
        } else {
            System.out.println("Yeni puan en yüksek 5 puandan düşük olduğu için eklenmedi.");
        }
    }

    private void siralaPuanlar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (puanlar[j] < puanlar[j + 1]) {
                    int temp = puanlar[j];
                    puanlar[j] = puanlar[j + 1];
                    puanlar[j + 1] = temp;

                    String temp1 = userlar[j];
                    userlar[j] = userlar[j + 1];
                    userlar[j + 1] = temp1;
                }
            }
        }
    }
}
