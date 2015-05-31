package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.Entity;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import object.Users;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import Application.researClass;
import javax.swing.JLabel;

@Entity
public class research extends JFrame {

	private JPanel contentPane;
	static research frame = new research();
	private JTextField hometf;
	private JTextField unitf;
	private JTextField majortf;
	private JTextField sextf;
	static List list;
	private JLabel label;
	private JLabel namelabel;
	private JLabel lblQq;
	private JLabel connectlabel;
	private JButton btnNewButton;

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
	public research() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JRadioButton homerb = new JRadioButton("\u7C4D\u8D2F");
		homerb.setBounds(6, 20, 58, 23);
		contentPane.add(homerb);
		
		final JRadioButton unirb = new JRadioButton("\u5927\u5B66");
		unirb.setBounds(6, 55, 58, 23);
		contentPane.add(unirb);
		
		final JRadioButton majorrb = new JRadioButton("\u4E13\u4E1A");
		majorrb.setBounds(6, 92, 58, 23);
		contentPane.add(majorrb);
		
		final JRadioButton sexrb = new JRadioButton("\u6027\u522B");
		sexrb.setBounds(6, 132, 58, 23);
		contentPane.add(sexrb);
		
		hometf = new JTextField();
		hometf.setBounds(83, 21, 161, 21);
		contentPane.add(hometf);
		hometf.setColumns(10);
		
		unitf = new JTextField();
		unitf.setColumns(10);
		unitf.setBounds(83, 56, 161, 21);
		contentPane.add(unitf);
		
		majortf = new JTextField();
		majortf.setColumns(10);
		majortf.setBounds(83, 93, 161, 21);
		contentPane.add(majortf);
		
		sextf = new JTextField();
		sextf.setColumns(10);
		sextf.setBounds(83, 133, 161, 21);
		contentPane.add(sextf);
		
		
		
		JButton findbtn = new JButton("\u67E5\u8BE2");
		findbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				researClass rc = new researClass();
				if(homerb.isSelected() == true)
					list = rc.findHome(hometf.getText());
				if(unirb.isSelected() == true)
					list = rc.findUniversity(list, unitf.getText());
				if(majorrb.isSelected() == true)
					list = rc.findMajor(list, majortf.getText());
				if(sexrb.isSelected() == true)
					list = rc.findSex(list, sextf.getText());
				Users user = rc.show(list);
				namelabel.setText(user.getName());
				connectlabel.setText(user.getQq());
			}
		});
		findbtn.setBounds(26, 218, 93, 23);
		contentPane.add(findbtn);
		
		label = new JLabel("\u59D3\u540D\uFF1A");
		label.setBounds(6, 173, 54, 15);
		contentPane.add(label);
		
		namelabel = new JLabel("");
		namelabel.setBounds(54, 173, 54, 15);
		contentPane.add(namelabel);
		
		lblQq = new JLabel("qq:");
		lblQq.setBounds(128, 173, 54, 15);
		contentPane.add(lblQq);
		
		connectlabel = new JLabel("");
		connectlabel.setBounds(156, 173, 54, 15);
		contentPane.add(connectlabel);
		
		btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				register.frame.show();
			}
		});
		btnNewButton.setBounds(156, 218, 93, 23);
		contentPane.add(btnNewButton);
	}
}
