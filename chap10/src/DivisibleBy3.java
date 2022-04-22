import java.awt.EventQueue;

import javax.swing.*;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField dis;
	private JTextField interger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 24, 470, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Enter = new JLabel("Enter a interger:");
		Enter.setBounds(33, 81, 109, 26);
		panel.add(Enter);
		
		dis = new JTextField();
		dis.setBounds(36, 169, 202, 70);
		panel.add(dis);
		dis.setColumns(10);
	
		JButton Check = new JButton("Check");
		Check.setBounds(33, 135, 89, 23);
		panel.add(Check);
		
		interger = new JTextField();
		interger.setBounds(152, 84, 86, 20);
		panel.add(interger);
		interger.setColumns(10);
		
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double x;
				String num = interger.getText();
				x = Double.parseDouble(num) % 3;
				if(x == 0)
				{
					dis.setText("number is divisible by 3");
				}
				else
				{
					dis.setText("number is not divisible by 3");
				}
			}
		});
		
		
		
	}
}
