package deneme2;
import java.io.*;

public class TxtDosyaOkuma {
    private int ver1;
    private int ver2;
    private int ver3;
    private int ver4;
    private int ver5;

    
    
    public TxtDosyaOkuma(String dosyaYolu) {
        try {
            FileReader fr = new FileReader(dosyaYolu);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();

            String[] degerler = satir.split(" ");
            ver1 = Integer.parseInt(degerler[0]);
            ver2 = Integer.parseInt(degerler[1]);
            ver3 = Integer.parseInt(degerler[2]);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void TxtDosyaOkuma1(String dosyaYolu) {
        try {
            FileReader fr1 = new FileReader(dosyaYolu);
            BufferedReader br1 = new BufferedReader(fr1);
            String satir1 = br1.readLine();

            String[] degerler1 = satir1.split(" ");
            ver1 = Integer.parseInt(degerler1[0]);
            ver2 = Integer.parseInt(degerler1[1]);
            ver3 = Integer.parseInt(degerler1[2]);
            ver4 = Integer.parseInt(degerler1[3]);
            ver5 = Integer.parseInt(degerler1[4]);

            br1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public void TxtDosyaYazma(String dosyaYolu, int deg1, int deg2, int deg3) {
        try {
            File f = new File(dosyaYolu);
            FileWriter fw = new FileWriter(f, false);
            BufferedWriter yaz = new BufferedWriter(fw);
            yaz.write(deg1 + " " + deg2 + " " + deg3);
            yaz.flush();
            yaz.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public int getVer1() {
        return ver1;
    }

    public int getVer2() {
        return ver2;
    }

    public int getVer3() {
        return ver3;
    }

	public void setVer1(int ver1) {
		this.ver1 = ver1;
	}

	public void setVer2(int ver2) {
		this.ver2 = ver2;
	}

	public void setVer3(int ver3) {
		this.ver3 = ver3;
	}
	public int getVer4() {
		return ver4;
	}
	public void setVer4(int ver4) {
		this.ver4 = ver4;
	}
	public int getVer5() {
		return ver5;
	}
	public void setVer5(int ver5) {
		this.ver5 = ver5;
	}

    
}
