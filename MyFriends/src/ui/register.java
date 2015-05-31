package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.Entity;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.jboss.logging.Message;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Date;

import Application.registerClass;

@Entity
public class register extends JFrame {

	private JPanel contentPane;
	private JTextField nametf;
	private JTextField idtf;
	private JTextField birthdaytf;
	private JTextField sextf;
	private JTextField hometf;
	private JTextField unitf;
	private JTextField majortf;
	private JTextField connecttf;
	static register frame = new register();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setBounds(10, 10, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
		label.setBounds(10, 46, 65, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u751F\u65E5\uFF1A");
		label_1.setBounds(10, 83, 65, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u6027\u522B\uFF1A");
		label_2.setBounds(10, 121, 65, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u7C4D\u8D2F\uFF1A");
		label_3.setBounds(10, 161, 65, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u5927\u5B66\uFF1A");
		label_4.setBounds(10, 202, 65, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u4E13\u4E1A\uFF1A");
		label_5.setBounds(10, 241, 65, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u8054\u7CFB\u65B9\u5F0F\uFF1A");
		label_6.setBounds(10, 281, 65, 15);
		contentPane.add(label_6);
		
		nametf = new JTextField();
		nametf.setBounds(74, 7, 178, 21);
		contentPane.add(nametf);
		nametf.setColumns(10);
		
		idtf = new JTextField();
		idtf.setColumns(10);
		idtf.setBounds(74, 43, 178, 21);
		contentPane.add(idtf);
		
		birthdaytf = new JTextField();
		birthdaytf.setColumns(10);
		birthdaytf.setBounds(74, 80, 178, 21);
		contentPane.add(birthdaytf);
		
		sextf = new JTextField();
		sextf.setColumns(10);
		sextf.setBounds(74, 118, 178, 21);
		contentPane.add(sextf);
		
		hometf = new JTextField();
		hometf.setColumns(10);
		hometf.setBounds(74, 158, 178, 21);
		contentPane.add(hometf);
		
		unitf = new JTextField();
		unitf.setColumns(10);
		unitf.setBounds(74, 199, 178, 21);
		contentPane.add(unitf);
		
		majortf = new JTextField();
		majortf.setColumns(10);
		majortf.setBounds(74, 238, 178, 21);
		contentPane.add(majortf);
		
		connecttf = new JTextField();
		connecttf.setColumns(10);
		connecttf.setBounds(74, 278, 178, 21);
		contentPane.add(connecttf);
		
		JButton registerbtn = new JButton("\u6CE8\u518C");
		registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerClass rc = new registerClass();
				rc.addToDB(nametf.getText(), idtf.getText(), Date.valueOf(birthdaytf.getText()), 
						sextf.getText(), unitf.getText(), majortf.getText(), hometf.getText(), connecttf.getText());
				JOptionPane.showMessageDialog(null, "×¢²á³É¹¦£¡", "×¢²á", JOptionPane.YES_OPTION);
			}
		});
		registerbtn.setBounds(23, 327, 65, 23);
		contentPane.add(registerbtn);
		
		JButton findbtn = new JButton("\u67E5\u8BE2");
		findbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				research.frame.show();
			}
		});
		findbtn.setBounds(108, 327, 65, 23);
		contentPane.add(findbtn);
		
		JButton exitbtn = new JButton("\u9000\u51FA");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		exitbtn.setBounds(192, 327, 65, 23);
		contentPane.add(exitbtn);
	}
}
