package com.zubiri.JF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


public class ProyectoJF extends JFrame implements ActionListener {

	 JLabel texto;         
     JTextField caja;       
     JButton boton;
     JButton boton2;			
 
    public ProyectoJF() {
        super();                    
      
        iniciarcomponientes();   
        this.setTitle("JFrame");                   
        this.setSize(310, 210);                                 
        this.setLocationRelativeTo(null);                       
        getContentPane().setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setVisible(true);   
    }
 
    private void iniciarcomponientes() {
        
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        boton2 = new JButton();
       
        texto.setText("el nombre");   
        texto.setBounds(50, 50, 100, 25); 
        caja.setBounds(150, 50, 100, 25);  
        boton.setText("enviar");
        boton.setBounds(50, 97, 100, 30);  
        boton.addActionListener(this);      
        boton2.setText("cancelar");
        boton2.setBounds(160, 97, 100, 30);  
        boton2.addActionListener(this);  
       
        getContentPane().add(texto);
        getContentPane().add(caja);
        getContentPane().add(boton);
        getContentPane().add(boton2);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();          
        
        Object fuente = e.getSource();
        if (fuente == boton ){System.out.println("nombre: "+ nombre);}
        else if (fuente == boton2){System.out.println("abortado ");}
    }
 
    public static void main(String[] args) {
    	ProyectoJF V = new ProyectoJF();     
                
    }
}
