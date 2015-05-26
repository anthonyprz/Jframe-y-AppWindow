package com.zubiri.JF;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProyectoAPPwindow {

	private ActionEvent accion;
	private JFrame frame;
	JTextField caja = new JTextField();
	JLabel texto = new JLabel();
    JButton boton = new JButton();
    JButton boton2 = new JButton();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoAPPwindow window = new ProyectoAPPwindow();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoAPPwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//accion = new ActionEvent();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setTitle("JFrame");                   
		 frame.setSize(310, 210);                                 
		 frame.setLocationRelativeTo(null);                       
		 frame.getContentPane().setLayout(null);                                   
		 frame.setResizable(false);                               
		 frame.setVisible(true);   

		
		
        texto.setText("el nombre");   
        texto.setBounds(50, 50, 100, 25); 
        caja.setBounds(150, 50, 100, 25);  
   
        boton.setText("enviar");
        boton.setBounds(10, 97, 100, 30);  
   
        boton2.setText("cancelar");
        boton2.setBounds(150, 97, 100, 30);  
        
     //  frame.boton.addActionListener(this);      
    //    boton2.addActionListener(this);  
        
        frame.getContentPane().add(texto);
        frame.getContentPane().add(caja);
        frame.getContentPane().add(boton);
        frame.getContentPane().add(boton2);
        
        frame.setVisible(true);
        
		       
	}
	public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();          
        
        Object fuente = e.getSource();
        if (fuente == boton ){System.out.println("nombre: "+ nombre);}
        else if (fuente == boton2){System.out.println("abortado ");}
    }

}
