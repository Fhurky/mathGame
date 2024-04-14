package deneme2;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import java.awt.List;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.util.HashMap;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	HashMap<String, String> hashMap = new HashMap<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		
		
		
		hashMap.put("admin", "adminadmin");
		hashMap.put("user", "useruser");
		hashMap.put("user1", "user1user1");		
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setTitle("GIRIS EKRANI");
		setBounds(100, 100, 428, 332);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField.setBounds(167, 115, 147, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrKullancAd = new JTextArea();
		txtrKullancAd.setForeground(Color.RED);
		txtrKullancAd.setCaretColor(Color.BLACK);
		txtrKullancAd.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrKullancAd.setTabSize(20);
		txtrKullancAd.setBackground(new Color(192, 192, 192));
		txtrKullancAd.setEditable(false);
		txtrKullancAd.setText("Kullanıcı adı\r\n");
		txtrKullancAd.setBounds(10, 111, 199, 27);
		contentPane.add(txtrKullancAd);
		
		JTextArea txtrifre = new JTextArea();
		txtrifre.setForeground(Color.RED);
		txtrifre.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrifre.setWrapStyleWord(true);
		txtrifre.setText("Şifre");
		txtrifre.setEditable(false);
		txtrifre.setBackground(Color.LIGHT_GRAY);
		txtrifre.setBounds(10, 161, 147, 27);
		contentPane.add(txtrifre);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(10, 225, 225, 33);
		contentPane.add(textPane);
		System.out.println(textPane.getText());
		
		
		Button button = new Button("Giriş yap");
		button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String username = textField.getText();
		            String password = new String(passwordField.getPassword());

		            if (CredentialsReader.checkCredentials(username, password)) {
		            	
		                System.out.println("Giris basarili:");
		                System.out.println("Kullanici ismi: " + username);
		                System.out.println("Sifre: " + password);
		                textPane.setText("Giris başarılı");
		                
		                if (username.equals("admin") && password.equals("adminadmin")) {
		                    deneme3 arayuz2 = new deneme3();
		                    arayuz2.setVisible(true);
		                    System.out.println("Admin giris yapildi...");
		                } else if(username.equals("user") && password.equals("useruser")){
		                    User_GUI arayuz3 = new User_GUI();
		                    arayuz3.setVisible(true);
		                    System.out.println("User0 giris yaildi...");
		                }
		                else if(username.equals("user1") && password.equals("user1user1")){
		                	User1_GUI arayuz4 = new User1_GUI();
		                	arayuz4.setVisible(true);
		                	System.out.println("User1 giris yapildi...");
		                }
		                Thread.sleep(1000);
		                dispose();
		                
		            } else{
		            	if(username.equals("admin") && password.equals("adminadmin")) {
		            		deneme3 arayuz2 = new deneme3();
		                    arayuz2.setVisible(true);
		                    Thread.sleep(1000);
			                dispose();
		            	}
		            	else if(username.equals("user") && password.equals("useruser")) {
		            		User_GUI arayuz3 = new User_GUI();
		                    arayuz3.setVisible(true);
		                    Thread.sleep(1000);
			                dispose();
		            	}
		            	else if(username.equals("user1") && password.equals("user1user1")) {
		            		User1_GUI arayuz3 = new User1_GUI();
		                    arayuz3.setVisible(true);
		                    System.out.println("1");
		                    Thread.sleep(1000);
			                dispose();
		            	}
		            	else {
		            		System.out.println("Hatali giris...");
		            		textPane.setText("Hatali giris...");
		            	}
		                
		            }
		        } catch (InterruptedException ex) {
		            ex.printStackTrace();
		        }
		    }
		});

		button.setFont(new Font("Dialog", Font.PLAIN, 18));
		button.setBounds(286, 225, 116, 58);
		contentPane.add(button);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Göster");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					passwordField.setEchoChar((char)0);				        
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		
		rdbtnNewRadioButton.setBounds(320, 161, 82, 27);
		contentPane.add(rdbtnNewRadioButton);
		
		JTextArea txtrGiri = new JTextArea();
		txtrGiri.setText("GİRİŞ");
		txtrGiri.setTabSize(20);
		txtrGiri.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 26));
		txtrGiri.setEditable(false);
		txtrGiri.setBackground(Color.LIGHT_GRAY);
		txtrGiri.setBounds(157, 24, 79, 45);
		contentPane.add(txtrGiri);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(167, 161, 147, 27);
		contentPane.add(passwordField);

	}
}
