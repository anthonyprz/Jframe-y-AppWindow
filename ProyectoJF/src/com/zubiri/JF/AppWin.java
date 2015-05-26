package com.zubiri.JF;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AppWin {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWin window = new AppWin();
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
	public AppWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblIntroduceTuNombre = new JLabel("nombre ");
		panel.add(lblIntroduceTuNombre);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton enviar = new JButton("enviar");
		enviar.setBounds(300, 500, 200, 200);
		enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				System.out.println("tu nombre: " + text);
			}
		});
		panel.add(enviar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(300, 500, 200, 200);
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("aboratada");
				
			}
		});
		panel.add(cancelar);
	}

}

