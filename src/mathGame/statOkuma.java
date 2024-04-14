package deneme2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class statOkuma {
    
	private double ver1;
	private double ver2;
	private double ver3;
	private double ver4;
	private double ver5;
	
	String dosyaYolu = "resources/LastScors.txt";

	public statOkuma(String dosyaYolu) {
	    try {
	        FileReader fr1 = new FileReader(dosyaYolu);
	        BufferedReader br1 = new BufferedReader(fr1);
	        String satir1 = br1.readLine();

	        String[] degerler1 = satir1.split(" ");
	        ver1 = Double.parseDouble(degerler1[0]);
	        ver2 = Double.parseDouble(degerler1[1]);
	        ver3 = Double.parseDouble(degerler1[2]);
	        ver4 = Double.parseDouble(degerler1[3]);
	        ver5 = Double.parseDouble(degerler1[4]);

	        br1.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }			
	}

	public double getVer1() {
		return ver1;
	}

	public void setVer1(double ver1) {
		this.ver1 = ver1;
	}

	public double getVer2() {
		return ver2;
	}

	public void setVer2(double ver2) {
		this.ver2 = ver2;
	}

	public double getVer3() {
		return ver3;
	}

	public void setVer3(double ver3) {
		this.ver3 = ver3;
	}

	public double getVer4() {
		return ver4;
	}

	public void setVer4(double ver4) {
		this.ver4 = ver4;
	}

	public double getVer5() {
		return ver5;
	}

	public void setVer5(double ver5) {
		this.ver5 = ver5;
	}
   
	
}
