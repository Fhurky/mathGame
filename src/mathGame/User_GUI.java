package deneme2;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import javax.swing.border.EmptyBorder;
import java.awt.Panel;

public class User_GUI extends JFrame {

    private JPanel contentPane;
    private JTextField txtUserInterface;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField txtX;
    private JTextField textField_4;
    private JButton btnNewButton_1;
    private JButton btnNewButton_3;
    private int correctCount = 0;
    private int wrongCount = 0;
    private long totalTime = 0;
    private MathOperations mathOperations;
    private int[] numbers1;
    private int[] numbers2;
    private int[] multiplicationResults;
    private int[] multiplicationAnswers;
    private int currentIndex = 0;
    private JProgressBar progressBar;
    private static int seconds;
    private static JLabel label;
    private JLabel lblNewLabel;
    private int[] timer; 
    private int skor;
    private double ortalamaSure;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    User_GUI frame = new User_GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    /**
     * Create the frame.
     */
    public User_GUI() {
    	setResizable(false);
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 516, 507);
        contentPane = new JPanel();
        contentPane.setForeground(Color.RED);
        contentPane.setBackground(SystemColor.control);
        contentPane.setToolTipText("");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtUserInterface = new JTextField();
        txtUserInterface.setHorizontalAlignment(SwingConstants.CENTER);
        txtUserInterface.setText("Çarpım Tablosu");
        txtUserInterface.setForeground(Color.BLACK);
        txtUserInterface.setFont(new Font("Tahoma", Font.PLAIN, 30));
        txtUserInterface.setEditable(false);
        txtUserInterface.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        txtUserInterface.setColumns(10);
        txtUserInterface.setBounds(10, 26, 363, 71);
        contentPane.add(txtUserInterface);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 35));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBackground(SystemColor.textHighlightText);
        textField.setEditable(false);
        textField.setBounds(10, 199, 76, 71);
        contentPane.add(textField);
        textField.setColumns(10);
        

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setBackground(SystemColor.textHighlightText);
        textField_1.setEditable(false);
        textField_1.setColumns(10);
        textField_1.setBounds(172, 199, 76, 71);
        contentPane.add(textField_1);

        progressBar = new JProgressBar();
        progressBar.setForeground(Color.GREEN);
        progressBar.setBounds(10, 125, 480, 45);
        contentPane.add(progressBar);

        mathOperations = new MathOperations(0);
        mathOperations.generateRandomMultiplicationQuestions();
        
        numbers1 = mathOperations.getNumbers1();
        numbers2 = mathOperations.getNumbers2();
        
        multiplicationResults = mathOperations.getMultiplicationResults();
        multiplicationAnswers = new int[numbers1.length];
        
        textField.setText(String.valueOf(numbers1[0]));
        textField_1.setText(String.valueOf(numbers2[0]));

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i] + "x" + numbers2[i] + "=" + multiplicationResults[i]);
        }
        
        Panel panel = new Panel();
        panel.setBackground(SystemColor.control);
        panel.setBounds(20, 381, 238, 77);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("sayi1");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1.setBounds(10, 16, 45, 55);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBackground(SystemColor.control);
        
        JLabel lblNewLabel_1_1 = new JLabel("X");
        lblNewLabel_1_1.setBounds(46, 14, 45, 55);
        panel.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setToolTipText("");
        lblNewLabel_1_1.setBackground(SystemColor.menu);
        
        JLabel lblNewLabel_1_2 = new JLabel("sayi2");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_2.setBounds(90, 16, 45, 55);
        panel.add(lblNewLabel_1_2);
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setBackground(SystemColor.menu);
        
 
        
        JLabel lblNewLabel_1_3_1 = new JLabel("=");
        lblNewLabel_1_3_1.setBounds(128, 13, 45, 55);
        panel.add(lblNewLabel_1_3_1);
        lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3_1.setBackground(SystemColor.menu);
        
        JLabel lblNewLabel_1_3 = new JLabel("?");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_3.setBounds(183, 16, 45, 55);
        panel.add(lblNewLabel_1_3);
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setBackground(SystemColor.menu);
        
        int []tim = new int[numbers1.length];
        double soruSkor = (double)100/numbers1.length;
       
        
        btnNewButton_1 = new JButton("KONTROL");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int karar = 0;
            	if(currentIndex != 0) {
            		karar = toplam(tim,currentIndex);
            	}
            	
            	tim[currentIndex] = (Integer.parseInt(lblNewLabel.getText()))-karar;
            	System.out.println("="+tim[currentIndex]+"=");
            	
                int answer = Integer.parseInt(textField_2.getText());
                multiplicationAnswers[currentIndex] = answer;
                textField_2.setText("");
                textField.setText("");
                
                if(answer == multiplicationResults[currentIndex]) {
                	panel.setBackground(SystemColor.green);  
                	correctCount++;
                    skor = skor +(int) (soruSkor-tim[currentIndex]+5);
                }               
                else {
                	panel.setBackground(SystemColor.red);
                	wrongCount++;               	
                }
                
                if(currentIndex >= 0) {
                	lblNewLabel_1.setText(String.valueOf(numbers1[currentIndex]));
                	lblNewLabel_1_2.setText(String.valueOf(numbers2[currentIndex]));
                	lblNewLabel_1_3.setText(String.valueOf(multiplicationResults[currentIndex]));
                }
               
                

                if (currentIndex == numbers1.length-1) {
                    dispose();
                    for (int i = 0; i < numbers1.length; i++) {
                        System.out.println(numbers1[i] + "x" + numbers2[i] + "=" + multiplicationAnswers[i]);
                    }
                    System.out.println("skor:"+skor+"...");
                    System.out.println("Dogru:"+correctCount);
                    System.out.println("Yanlis:"+wrongCount);
                    
                    for(int i=0;i<numbers1.length;i++) {
                    	tim[i] = tim[i]+1;
                    }
                    ortalamaSure = ortalama(tim);
                    
                    userResult usr = new userResult();
                    usr.setKarar(0);
                    usr.setMax(ilkSayiyiGetir("resources/skorTablosu.txt"));
                  
                    
                    usr.setDogru(correctCount);
                    System.out.println(usr.getDogru());
                    usr.setYanlis(wrongCount);
                    System.out.println(usr.getYanlis());
                    usr.setSoru(correctCount+wrongCount);
                    usr.setSure(ortalamaSure);
                    usr.setSkor(skor);
                    usr.setVisible(true);
                    
                    TxtDosyaDuzenleme yeni = new TxtDosyaDuzenleme(skor); 
                    yeni.duzenle("resources/LastSkors.txt");
                    yeni.duzenleIsim("resources/lastFive.txt","user1");
                    
                    YuksekPuanTablosu nTablo = new YuksekPuanTablosu("resources/skorTablosu.txt","user1");
                    nTablo.eklePuan(skor);
                    
                
                    DosyaEkleme nDosya = new DosyaEkleme("user1",correctCount,wrongCount,skor);
                    nDosya.ekleBilgi();
                    
                    
                    return;
                }
                
                
                textField.setText(String.valueOf(numbers1[currentIndex+1]));
                textField_1.setText(String.valueOf(numbers2[currentIndex+1]));
                
                currentIndex++;
                double progress = (double) currentIndex / numbers1.length * 100;
                progressBar.setValue((int) progress);
                
            }
        });
     
    

        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton_1.setBounds(306, 298, 184, 77);
        contentPane.add(btnNewButton_1);

        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        textField_2.setBounds(338, 199, 152, 71);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        txtX = new JTextField();
        txtX.setForeground(Color.RED);
        txtX.setHorizontalAlignment(SwingConstants.CENTER);
        txtX.setBackground(SystemColor.control);
        txtX.setEditable(false);
        txtX.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txtX.setText(" X");
        txtX.setBounds(96, 199, 66, 71);
        contentPane.add(txtX);
        txtX.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setForeground(Color.RED);
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setCaretColor(SystemColor.control);
        textField_4.setBackground(SystemColor.control);
        textField_4.setEditable(false);
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 35));
        textField_4.setText("=");
        textField_4.setColumns(10);
        textField_4.setBounds(252, 199, 76, 71);
        contentPane.add(textField_4);

        btnNewButton_3 = new JButton("Çıkış");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                gui login = new gui();
                login.setVisible(true);
            }
        });

        btnNewButton_3.setForeground(Color.RED);
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton_3.setBounds(383, 26, 107, 71);
        contentPane.add(btnNewButton_3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel.setBounds(445, 413, 45, 45);
        contentPane.add(lblNewLabel);
        
        txtSre = new JTextField();
        txtSre.setBackground(SystemColor.control);
        txtSre.setEditable(false);
        txtSre.setFont(new Font("Tahoma", Font.PLAIN, 28));
        txtSre.setText("Zaman:");
        txtSre.setHorizontalAlignment(SwingConstants.CENTER);
        txtSre.setBounds(317, 413, 107, 45);
        contentPane.add(txtSre);
        txtSre.setColumns(10);
        
        lblNewLabel_2 = new JLabel("Önceki soru:");
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(20, 342, 131, 33);
        contentPane.add(lblNewLabel_2);
        
        startTimer();

        JButton btnNewButton_2 = new JButton("Çıkış");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                gui login = new gui();
                login.setVisible(true);
            }
        });
        
        userResult son = new userResult();
        
       
    }
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            seconds++;
            updateLabel();
        }
    };
    private JTextField txtSre;
    private JLabel lblNewLabel_2;
    
    private void updateLabel() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                lblNewLabel.setText(String.valueOf(seconds));
            }
        });
    }
    private void startTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
    public static int toplam(int[] dizi, int index) {
        int toplam = 0;
        for (int i = 0; i <= index; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
    public static double ortalama(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        double ortalama = (double) toplam / dizi.length;
        return ortalama;
    }
    public static int ilkSayiyiGetir(String dosyaYolu) {
        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String ilkSatir = br.readLine();
            int ilkSayi = Integer.parseInt(ilkSatir.split(" ")[0]);
            return ilkSayi;
        } catch (IOException e) {
            e.printStackTrace();
            return -1; // Hata durumunda -1 döndürülür
        }
    }
}
