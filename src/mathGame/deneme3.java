package deneme2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenu;
import java.awt.Point;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;

public class deneme3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdmnInterface;
	private JTextField textField;
	private JTextField textField_1;
	private String dosyaYolu = "resources/dosya.txt";
	private JTextField textField_2;
	private JTextPane txtpnAltDeer;
	private JTextPane txtpnstDeer;
	private JTextPane txtpnAltDeer_2;
	private final Action action = new SwingAction();
	private JToggleButton tglbtnNewToggleButton_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deneme3 frame = new deneme3();
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
	public deneme3() {
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 832);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setOpaque(false);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setLocation(new Point(12, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		statOkuma stats = new statOkuma("resources/LastSkors.txt");
        double stat1 = stats.getVer1();
        double stat2 = stats.getVer2();
        double stat3 = stats.getVer3();
        double stat4 = stats.getVer4();
        double stat5 = stats.getVer5();
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(346, 762, 32, 20);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(String.valueOf(stat1));
		lblNewLabel.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(262, 762, 32, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(String.valueOf(stat2));
		lblNewLabel_1.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(178, 762, 32, 20);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setText(String.valueOf(stat3));
		lblNewLabel_2.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(94, 762, 32, 20);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setText(String.valueOf(stat4));
		lblNewLabel_3.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 762, 32, 20);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setText(String.valueOf(stat5));
		lblNewLabel_4.setVisible(false);
		
		JButton btnNewButton = new JButton("Excel");
		btnNewButton.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtToExcelConverter excel = new TxtToExcelConverter();
				excel.convertToExcel();			
			}
		});
		
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(13, 52, 102, 32);
		contentPane.add(btnNewButton);
		
		
		txtAdmnInterface = new JTextField();
		txtAdmnInterface.setForeground(new Color(0, 0, 0));
		txtAdmnInterface.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtAdmnInterface.setText("ADMIN INTERFACE");
		txtAdmnInterface.setBounds(125, 22, 194, 45);
		txtAdmnInterface.setEditable(false);
		txtAdmnInterface.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.add(txtAdmnInterface);
		txtAdmnInterface.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Çıkış");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				gui login = new gui();
				login.setVisible(true);
			}
		});
		
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(343, 28, 81, 38);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setEnabled(true);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setBounds(162, 171, 104, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		textField_1.setEnabled(true);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setBounds(162, 227, 104, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setVisible(false);
		textField_2.setEnabled(true);
		textField_2.setBounds(162, 283, 104, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("User2");
		tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tglbtnNewToggleButton_4.setBounds(146, 326, 120, 38);
		contentPane.add(tglbtnNewToggleButton_4);
		tglbtnNewToggleButton_4.setVisible(false);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("User1");
		tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tglbtnNewToggleButton_3.setBounds(13, 326, 120, 38);
		contentPane.add(tglbtnNewToggleButton_3);
		tglbtnNewToggleButton_3.setVisible(false);
				
		JButton btnNewButton_3 = new JButton("KAYDET");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setVisible(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtDosyaOkuma tx = new TxtDosyaOkuma(dosyaYolu);
				tx.TxtDosyaYazma(dosyaYolu,Integer.valueOf(textField.getText()), Integer.valueOf(textField_1.getText()), Integer.valueOf(textField_2.getText()));
				if(tglbtnNewToggleButton_3.isSelected() && tglbtnNewToggleButton_4.isSelected()) {
					
					TxtDosyaOkuma tx1 = new TxtDosyaOkuma("resources/user1.txt");
					tx1.TxtDosyaYazma("resources/user1.txt",Integer.valueOf(textField.getText()), Integer.valueOf(textField_1.getText()), Integer.valueOf(textField_2.getText()));
					
					TxtDosyaOkuma tx2 = new TxtDosyaOkuma("resources/user2.txt");
					tx2.TxtDosyaYazma("resources/user2.txt",Integer.valueOf(textField.getText()), Integer.valueOf(textField_1.getText()), Integer.valueOf(textField_2.getText()));
					
				}
				else if(tglbtnNewToggleButton_3.isSelected() && !tglbtnNewToggleButton_4.isSelected()) {
					TxtDosyaOkuma tx1 = new TxtDosyaOkuma("resources/user1.txt");
					tx1.TxtDosyaYazma("resources/user1.txt",Integer.valueOf(textField.getText()), Integer.valueOf(textField_1.getText()), Integer.valueOf(textField_2.getText()));
					
				}
				else if(!tglbtnNewToggleButton_3.isSelected() && tglbtnNewToggleButton_4.isSelected()) {
					TxtDosyaOkuma tx2 = new TxtDosyaOkuma("resources/user2.txt");
					tx2.TxtDosyaYazma("resources/user2.txt",Integer.valueOf(textField.getText()), Integer.valueOf(textField_1.getText()), Integer.valueOf(textField_2.getText()));
				}
				else {
					System.out.println("Hata kullanici seceilmedi...");
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(13, 11, 102, 32);
		contentPane.add(btnNewButton_3);
		
		txtpnAltDeer = new JTextPane();
		txtpnAltDeer.setEditable(false);
		txtpnAltDeer.setVisible(false);
		txtpnAltDeer.setBackground(SystemColor.control);
		txtpnAltDeer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnAltDeer.setText("ALT DEĞER:");
		txtpnAltDeer.setBounds(26, 171, 104, 32);
		contentPane.add(txtpnAltDeer);
		
		txtpnstDeer = new JTextPane();
		txtpnstDeer.setEditable(false);
		txtpnstDeer.setVisible(false);
		txtpnstDeer.setBackground(SystemColor.control);
		txtpnstDeer.setText("ÜST DEĞER:");
		txtpnstDeer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnstDeer.setBounds(26, 227, 104, 32);
		contentPane.add(txtpnstDeer);
		
		txtpnAltDeer_2 = new JTextPane();
		txtpnAltDeer_2.setEditable(false);
		txtpnAltDeer_2.setVisible(false);
		txtpnAltDeer_2.setBackground(SystemColor.control);
		txtpnAltDeer_2.setText("ADET:");
		txtpnAltDeer_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnAltDeer_2.setBounds(26, 283, 104, 32);
		contentPane.add(txtpnAltDeer_2);
		
		
		
		
		
		
		tglbtnNewToggleButton_1 = new JToggleButton("Ayarlar");
		tglbtnNewToggleButton_1.setForeground(Color.RED);
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_1.isSelected()) {
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					txtpnAltDeer.setVisible(true);
					txtpnstDeer.setVisible(true);
					txtpnAltDeer_2.setVisible(true);
					btnNewButton_3.setVisible(true);
					tglbtnNewToggleButton_3.setVisible(true);			
					tglbtnNewToggleButton_4.setVisible(true);
				}
				else {
					textField.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					txtpnAltDeer.setVisible(false);
					txtpnstDeer.setVisible(false);
					txtpnAltDeer_2.setVisible(false);
					btnNewButton_3.setVisible(false);
					tglbtnNewToggleButton_3.setVisible(false);			
					tglbtnNewToggleButton_4.setVisible(false);
				}
			}
		});
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tglbtnNewToggleButton_1.setBounds(10, 107, 120, 38);
		contentPane.add(tglbtnNewToggleButton_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setVisible(false);
		textField_3.setEditable(false);
		textField_3.setBounds(372, 171, 52, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setVisible(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(372, 202, 52, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setVisible(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(372, 235, 52, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setVisible(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(372, 266, 52, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setVisible(false);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(372, 295, 52, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setVisible(false);
		textField_8.setEditable(false);
		textField_8.setBackground(SystemColor.control);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setText("1.");
		textField_8.setColumns(10);
		textField_8.setBounds(276, 171, 22, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setVisible(false);
		textField_9.setEditable(false);
		textField_9.setBackground(SystemColor.control);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_9.setText("2.");
		textField_9.setColumns(10);
		textField_9.setBounds(276, 202, 22, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setVisible(false);
		textField_10.setEditable(false);
		textField_10.setBackground(SystemColor.control);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_10.setText("3.");
		textField_10.setColumns(10);
		textField_10.setBounds(276, 233, 22, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setVisible(false);
		textField_11.setEditable(false);
		textField_11.setBackground(SystemColor.control);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_11.setText("4.");
		textField_11.setColumns(10);
		textField_11.setBounds(276, 262, 22, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setVisible(false);
		textField_12.setEditable(false);
		textField_12.setBackground(SystemColor.control);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_12.setText("5.");
		textField_12.setColumns(10);
		textField_12.setBounds(276, 289, 22, 20);
		contentPane.add(textField_12);
		
		String dosyaYolu = "resources/skorTablosu.txt";
		int i;
        TxtDosyaOkuma txtDosyaOkuma = new TxtDosyaOkuma(dosyaYolu);
        txtDosyaOkuma.TxtDosyaOkuma1(dosyaYolu);     

        int ver1 = txtDosyaOkuma.getVer1();
        int ver2 = txtDosyaOkuma.getVer2();
        int ver3 = txtDosyaOkuma.getVer3();
        int ver4 = txtDosyaOkuma.getVer4();
        int ver5 = txtDosyaOkuma.getVer5();
        
        TxtDosyaOkumaUser userSkorName = new TxtDosyaOkumaUser("resources/skorUSER.txt");
        
        String ver_1 = userSkorName.getVeri1();
        String ver_2 = userSkorName.getVeri2();
        String ver_3 = userSkorName.getVeri3();
        String ver_4 = userSkorName.getVeri4();
        String ver_5 = userSkorName.getVeri5();
        
        JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(308, 171, 54, 20);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setText(ver_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setVisible(false);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(308, 202, 54, 20);
		contentPane.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setText(ver_2);
		
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setVisible(false);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBounds(308, 233, 54, 20);
		contentPane.add(lblNewLabel_5_2);
		lblNewLabel_5_2.setText(ver_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setVisible(false);
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setBounds(308, 297, 52, 20);
		contentPane.add(lblNewLabel_5_3);
		lblNewLabel_5_3.setText(ver_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setVisible(false);
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setBounds(308, 265, 52, 20);
		contentPane.add(lblNewLabel_5_4);
		lblNewLabel_5_4.setText(ver_5);
                
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Skor Tablosu");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					lblNewLabel_5_4.setVisible(true);
					lblNewLabel_5_3.setVisible(true);
					lblNewLabel_5_2.setVisible(true);
					lblNewLabel_5_1.setVisible(true);
					lblNewLabel_5.setVisible(true);
					textField_3.setVisible(true);
					textField_3.setText(Integer.toString(ver1));
					textField_4.setVisible(true);
					textField_4.setText(Integer.toString(ver2));
					textField_5.setVisible(true);
					textField_5.setText(Integer.toString(ver3));
					textField_6.setVisible(true);
					textField_6.setText(Integer.toString(ver4));
					textField_7.setVisible(true);
					textField_7.setText(Integer.toString(ver5));
					textField_8.setVisible(true);
					textField_9.setVisible(true);
					textField_10.setVisible(true);
					textField_11.setVisible(true);
					textField_12.setVisible(true);	
					
				}
				else {
					lblNewLabel_5_4.setVisible(false);
					lblNewLabel_5_3.setVisible(false);
					lblNewLabel_5_2.setVisible(false);
					lblNewLabel_5_1.setVisible(false);
					lblNewLabel_5.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					textField_5.setVisible(false);
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					textField_8.setVisible(false);
					textField_9.setVisible(false);
					textField_10.setVisible(false);
					textField_11.setVisible(false);
					textField_12.setVisible(false);	
				}
			}
		});
		
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tglbtnNewToggleButton.setBounds(276, 107, 148, 38);
		contentPane.add(tglbtnNewToggleButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setMaximum(150);
		progressBar.setBounds(346, 504, 32, 247);
		contentPane.add(progressBar);
		progressBar.setVisible(false);
		progressBar.setValue((int) stat1);
		
		
		
		if(stat1<50) {
			progressBar.setForeground(Color.RED);
		}
		else if(stat1>=50 && stat1<80) {
			progressBar.setForeground(Color.YELLOW);
		}
		else if(stat1>=80 && stat1<120){
			progressBar.setForeground(Color.GREEN);
		}
		else {
			progressBar.setForeground(Color.BLUE);
		}
		
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setOrientation(SwingConstants.VERTICAL);
		progressBar_1.setMaximum(150);
		progressBar_1.setBounds(262, 504, 32, 247);
		contentPane.add(progressBar_1);
		progressBar_1.setVisible(false);
		progressBar_1.setValue((int) stat2);
		
		if(stat2<50) {
			progressBar_1.setForeground(Color.RED);
		}
		else if(stat2>=50 && stat2<80) {
			progressBar_1.setForeground(Color.YELLOW);
		}
		else if(stat2>=80 && stat2<120){
			progressBar_1.setForeground(Color.GREEN);
		}
		else {
			progressBar_1.setForeground(Color.BLUE);
		}
		
		
		
		JProgressBar progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setOrientation(SwingConstants.VERTICAL);
		progressBar_1_1.setMaximum(150);
		progressBar_1_1.setBounds(178, 504, 32, 247);
		contentPane.add(progressBar_1_1);
		progressBar_1_1.setVisible(false);
		progressBar_1_1.setValue((int) stat3);
		
		if(stat3<50) {
			progressBar_1_1.setForeground(Color.RED);
		}
		else if(stat3>=50 && stat3<80) {
			progressBar_1_1.setForeground(Color.YELLOW);
		}
		else if(stat3>=80 && stat3<120){
			progressBar_1_1.setForeground(Color.GREEN);
		}
		else {
			progressBar_1_1.setForeground(Color.BLUE);
		}
		
		JProgressBar progressBar_1_2 = new JProgressBar();
		progressBar_1_2.setOrientation(SwingConstants.VERTICAL);
		progressBar_1_2.setMaximum(150);
		progressBar_1_2.setBounds(94, 509, 32, 242);
		contentPane.add(progressBar_1_2);
		progressBar_1_2.setVisible(false);
		progressBar_1_2.setValue((int) stat4);
		
		if(stat4<50) {
			progressBar_1_2.setForeground(Color.RED);
		}
		else if(stat4>=50 && stat4<80) {
			progressBar_1_2.setForeground(Color.YELLOW);
		}
		else if(stat4>=80 && stat4<120){
			progressBar_1_2.setForeground(Color.GREEN);
		}
		else {
			progressBar_1_2.setForeground(Color.BLUE);
		}
		
		JProgressBar progressBar_1_3 = new JProgressBar();
		progressBar_1_3.setOrientation(SwingConstants.VERTICAL);
		progressBar_1_3.setMaximum(150);
		progressBar_1_3.setBounds(10, 504, 32, 247);
		contentPane.add(progressBar_1_3);
		progressBar_1_3.setVisible(false);
		progressBar_1_3.setValue((int) stat5);
		
		if(stat5<50) {
			progressBar_1_3.setForeground(Color.RED);
		}
		else if(stat5>=50 && stat5<80) {
			progressBar_1_3.setForeground(Color.YELLOW);
		}
		else if(stat5>=80 && stat5<120){
			progressBar_1_3.setForeground(Color.GREEN);
		}
		else {
			progressBar_1_3.setForeground(Color.BLUE);
		}
		
       TxtDosyaOkumaUser userSkorName_1 = new TxtDosyaOkumaUser("resources/lastFive.txt");
        
        String ver1_1 = userSkorName_1.getVeri1();
        String ver1_2 = userSkorName_1.getVeri2();
        String ver1_3 = userSkorName_1.getVeri3();
        String ver1_4 = userSkorName_1.getVeri4();
        String ver1_5 = userSkorName_1.getVeri5();
		
		
		JLabel lblNewLabel_6 = new JLabel("user1");
		lblNewLabel_6.setBounds(10, 479, 74, 14);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setText(ver1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("user1");
		lblNewLabel_6_1.setBounds(91, 484, 74, 14);
		contentPane.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setVisible(false);
		lblNewLabel_6_1.setText(ver1_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("user1");
		lblNewLabel_6_2.setBounds(178, 479, 74, 14);
		contentPane.add(lblNewLabel_6_2);
		lblNewLabel_6_2.setVisible(false);
		lblNewLabel_6_2.setText(ver1_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("user1");
		lblNewLabel_6_3.setBounds(262, 479, 74, 14);
		contentPane.add(lblNewLabel_6_3);
		lblNewLabel_6_3.setVisible(false);
		lblNewLabel_6_3.setText(ver1_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("user1");
		lblNewLabel_6_4.setBounds(346, 479, 74, 14);
		contentPane.add(lblNewLabel_6_4);
		lblNewLabel_6_4.setVisible(false);
		lblNewLabel_6_4.setText(ver1_5);
		
		
				
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("İstatistikler");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_2.isSelected()) {	
					btnNewButton.setVisible(true);
					lblNewLabel.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
					progressBar.setVisible(true);
					progressBar_1.setVisible(true);
					progressBar_1_1.setVisible(true);
					progressBar_1_2.setVisible(true);
					progressBar_1_3.setVisible(true);
						
					lblNewLabel_6.setVisible(true);
					lblNewLabel_6_1.setVisible(true);
					lblNewLabel_6_2.setVisible(true);
					lblNewLabel_6_3.setVisible(true);
					lblNewLabel_6_4.setVisible(true);
					
				}
				else {
					btnNewButton.setVisible(false);
					lblNewLabel.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_2.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(false);
					progressBar.setVisible(false);
					progressBar_1.setVisible(false);
					progressBar_1_1.setVisible(false);
					progressBar_1_2.setVisible(false);
					progressBar_1_3.setVisible(false);
					
					lblNewLabel_6.setVisible(false);
					lblNewLabel_6_1.setVisible(false);
					lblNewLabel_6_2.setVisible(false);
					lblNewLabel_6_3.setVisible(false);
					lblNewLabel_6_4.setVisible(false);
				}
			}
		});
		
		tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tglbtnNewToggleButton_2.setBounds(140, 107, 126, 38);
		contentPane.add(tglbtnNewToggleButton_2);
		
		
		
		
		
		
		
		
		
		
	}
	public String getDosyaYolu() {
		return dosyaYolu;
	}

	public void setDosyaYolu(String dosyaYolu) {
		this.dosyaYolu = dosyaYolu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
