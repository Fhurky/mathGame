package deneme2;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class userResult extends JFrame {

	private JPanel contentPane;
	private JTextField txtSonu;
	private JTextField txtSoruSays;
	private JTextField txtDoruSays;
	private JTextField txtYanlSays;
	private JTextField txtOrtalamaSre;
	private JTextField txtSkor;
	private JTextField txtEnYksekSkor;
	
	private int dogru;
	private int yanlis;
	private int soru;
	private double skor;
	private double sure;
	private double max;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private int karar;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userResult frame = new userResult();
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
    
	public userResult() {
		
	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSonu = new JTextField();
		txtSonu.setForeground(Color.RED);
		txtSonu.setEditable(false);
		txtSonu.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtSonu.setHorizontalAlignment(SwingConstants.CENTER);
		txtSonu.setText("SONUÇ");
		txtSonu.setBounds(113, 19, 177, 62);
		contentPane.add(txtSonu);
		txtSonu.setColumns(10);
		
		txtSoruSays = new JTextField();
		txtSoruSays.setEditable(false);
		txtSoruSays.setBackground(SystemColor.control);
		txtSoruSays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSoruSays.setText("Soru sayısı:");
		txtSoruSays.setBounds(10, 100, 110, 29);
		contentPane.add(txtSoruSays);
		txtSoruSays.setColumns(10);
		
		txtDoruSays = new JTextField();
		txtDoruSays.setEditable(false);
		txtDoruSays.setBackground(SystemColor.control);
		txtDoruSays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDoruSays.setText("Doğru sayısı:");
		txtDoruSays.setColumns(10);
		txtDoruSays.setBounds(10, 140, 110, 29);
		contentPane.add(txtDoruSays);
		
		txtYanlSays = new JTextField();
		txtYanlSays.setEditable(false);
		txtYanlSays.setBackground(SystemColor.control);
		txtYanlSays.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtYanlSays.setText("Yanlış sayısı:");
		txtYanlSays.setColumns(10);
		txtYanlSays.setBounds(10, 180, 110, 29);
		contentPane.add(txtYanlSays);
		
		txtOrtalamaSre = new JTextField();
		txtOrtalamaSre.setEditable(false);
		txtOrtalamaSre.setBackground(SystemColor.control);
		txtOrtalamaSre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtOrtalamaSre.setText("Ortalama süre:");
		txtOrtalamaSre.setColumns(10);
		txtOrtalamaSre.setBounds(10, 220, 110, 29);
		contentPane.add(txtOrtalamaSre);
		
		txtSkor = new JTextField();
		txtSkor.setForeground(Color.RED);
		txtSkor.setEditable(false);
		txtSkor.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSkor.setText("SKOR:");
		txtSkor.setColumns(10);
		txtSkor.setBounds(260, 230, 105, 62);
		contentPane.add(txtSkor);
		
		String dosyaYolu = "resources/skorTablosu.txt";
		int ilkSayi = readFirstNumber(dosyaYolu);
		
		txtEnYksekSkor = new JTextField();
		txtEnYksekSkor.setEditable(false);
		txtEnYksekSkor.setBackground(SystemColor.control);
		txtEnYksekSkor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnYksekSkor.setText("En yüksek skor:");
		txtEnYksekSkor.setBounds(10, 285, 134, 29);
		contentPane.add(txtEnYksekSkor);
		txtEnYksekSkor.setColumns(10);
		
		JButton btnNewButton = new JButton("Yeni Oyun");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(karar == 0) {
			         User_GUI usernew = new User_GUI();	
			         usernew.setVisible(true);
			         dispose();
				}
				else if(karar == 1) {
					User1_GUI usernew = new User1_GUI();
					usernew.setVisible(true);
					dispose();
				}
			}
		});
		
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(238, 100, 171, 50);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("SET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(String.valueOf(soru));
				lblNewLabel_1.setText(String.valueOf(dogru));
				lblNewLabel_2.setText(String.valueOf(yanlis));
				lblNewLabel_3.setText(String.valueOf(sure));
				lblNewLabel_5.setText(String.valueOf(skor));
				lblNewLabel_4.setText(String.valueOf(max));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1.setBounds(322, 11, 87, 63);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(130, 102, 52, 29);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(130, 140, 52, 29);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(130, 180, 52, 29);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(130, 220, 52, 29);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 328, 134, 39);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.GREEN);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(202, 294, 211, 73);
		contentPane.add(lblNewLabel_5);
	}
	
	

	public userResult(int karar) throws HeadlessException {
		super();
		this.karar = karar;
	}

	public int getKarar() {
		return karar;
	}

	public void setKarar(int karar) {
		this.karar = karar;
	}

	public int getDogru() {
		return dogru;
	}

	public void setDogru(int dogru) {
		this.dogru = dogru;
	}

	public int getYanlis() {
		return yanlis;
	}

	public void setYanlis(int yanlis) {
		this.yanlis = yanlis;
	}

	public int getSoru() {
		return soru;
	}

	public void setSoru(int soru) {
		this.soru = soru;
	}

	public double getSkor() {
		return skor;
	}

	public void setSkor(int skor) {
		this.skor = skor;
	}

	public double getSure() {
		return sure;
	}

	public void setSure(double ortalamaSure) {
		this.sure = ortalamaSure;
	}
	

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public int readFirstNumber(String dosyaYolu) {
	    int ilkSayi = 0;

	    try {
	        FileReader fr = new FileReader(dosyaYolu);
	        BufferedReader br = new BufferedReader(fr);
	        String satir = br.readLine();

	        String[] degerler = satir.split(" ");
	        ilkSayi = Integer.parseInt(degerler[0]);

	        br.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return ilkSayi;
	}
	


}
