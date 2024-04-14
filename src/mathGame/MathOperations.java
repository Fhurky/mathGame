package deneme2;

import java.util.Random;

public class MathOperations {
    private int minRange;
    private int maxRange;
    private int questionCount;
    private int[] numbers1;
    private int[] numbers2;
    private int[] multiplicationResults;
    private String dosyaYol;
    private int karar;
    private String dosyaYolu;
    public MathOperations(int karar) {  
    	
    	 
    	
    	if(karar == 0) {
    		dosyaYol = "resources/user1.txt";
    	}
    	else {
    		dosyaYol = "resources/user2.txt";
    	}
        TxtDosyaOkuma txtDosyaOkuma = new TxtDosyaOkuma(dosyaYol);

        int ver1 = txtDosyaOkuma.getVer1();
        int ver2 = txtDosyaOkuma.getVer2();
        int ver3 = txtDosyaOkuma.getVer3();
    	
        this.minRange = ver1;
        this.maxRange = ver2;
        this.questionCount = ver3;
        this.numbers1 = new int[questionCount];
        this.numbers2 = new int[questionCount];
        this.multiplicationResults = new int[questionCount];
    }
    

    public void generateRandomMultiplicationQuestions() {
        Random random = new Random();

        for (int i = 0; i < questionCount; i++) {
            int num1 = random.nextInt(maxRange - minRange + 1) + minRange;
            int num2 = random.nextInt(maxRange - minRange + 1) + minRange;
            int result = num1 * num2;
            numbers1[i] = num1;
            numbers2[i] = num2;
            multiplicationResults[i] = result;
            
        }
    }
    
    public String getDosyaYol() {
		return dosyaYol;
	}

	public void setDosyaYol(String dosyaYol) {
		this.dosyaYol = dosyaYol;
	}


	public int getKarar() {
		return karar;
	}



	public void setKarar(int karar) {
		this.karar = karar;
	}



	public String getDosyaYolu() {
		return dosyaYolu;
	}


	public void setDosyaYolu(String dosyaYolu) {
		this.dosyaYolu = dosyaYolu;
	}


	public void setNumbers1(int[] numbers1) {
		this.numbers1 = numbers1;
	}

	public void setNumbers2(int[] numbers2) {
		this.numbers2 = numbers2;
	}

	public void setMultiplicationResults(int[] multiplicationResults) {
		this.multiplicationResults = multiplicationResults;
	}

	public int[] getNumbers1() {
        return numbers1;
    }

    public int[] getNumbers2() {
        return numbers2;
    }

    public int[] getMultiplicationResults() {
        return multiplicationResults;
    }
   
	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
