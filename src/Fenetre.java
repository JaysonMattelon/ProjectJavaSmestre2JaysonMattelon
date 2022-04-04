import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblWelcome;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblBackground;
	private String text ="125AA45";
	private JLabel lblPkm ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
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
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(327, 184, 109, 13);
		contentPane.add(lblNewLabel);
		

		
		textField = new JTextField();
		textField.setBounds(221, 154, 109, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texte = textField.getText();
				if (texte.equalsIgnoreCase(text)) {
					/*lblPkm = new JLabel("");
					lblPkm.setIcon(new ImageIcon("C:\\Users\\jayso\\Documents\\JAVA\\worksplace\\ProjectJavaSmestre2\\Media\\PC_d'Amelle_Fond_Trois_DP_4gen"));
					lblPkm.setBounds(10, 62, 513, 340);
					contentPane.add(lblPkm);*/	
					lblNewLabel.setText("Itwork");
					
			}
				else 
					lblNewLabel.setText("Itnotwork" + textField.getText());
				
			}
		});
		btnNewButton.setBounds(232, 196, 85, 21);
		contentPane.add(btnNewButton);
		
		lblWelcome = new JLabel("Welcome Trainer !");
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWelcome.setForeground(Color.BLACK);
		lblWelcome.setBackground(SystemColor.activeCaption);
		lblWelcome.setBounds(199, 10, 165, 63);
		contentPane.add(lblWelcome);
		
		lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\jayso\\Documents\\JAVA\\worksplace\\ProjectJavaSmestre2\\Media\\PC-RB.png"));
		lblBackground.setBounds(10, 62, 513, 340);
		contentPane.add(lblBackground);
	}
}
