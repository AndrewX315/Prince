package view;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.Controlador;

public class Ventana extends JFrame{

    private JLabel myRotulo;
    private Panel miPanel;
    private JButton boton,boton2;
    private Controlador miControlador;
    private JTextArea txt,txt2;

    public Ventana() {
        super("EnigmApp");
        setLayout(null);
        setBounds(0,0,800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);

    }

    private void initComponents() {

        miPanel=new Panel();
        miPanel.setBackground(Color.lightGray);
        miPanel.setLayout(null);
        miPanel.setBounds(100,100,600,400);
        boton=new JButton("Encriptar");
        boton2=new JButton("Desencriptar");
        boton.setBounds(100,30,200,30);
        this.add(boton);
        boton2.setBounds(500,30,200,30);
        this.add(boton2);
        Square();
        this.add(miPanel);
    }
    private void Square(){
        Font Titulo = new Font("Calibri", 3, 40);
        Font Cuerpo = new Font("Arial", 3, 20);
        txt=new JTextArea("EnigmApp");
        txt.setBounds(325,20,300,50);
        txt.setOpaque(false);
        txt.setForeground(Color.pink);
        txt.setFont(Titulo);
        this.add(txt);
        txt2=new JTextArea("Andrés Cárdenas, Juan Fernández, Juan Cortés");
        txt2.setBounds(110,70,1000,30);
        txt2.setOpaque(false);
        txt2.setForeground(Color.white);
        txt2.setFont(Cuerpo);
        this.add(txt2);
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public Controlador getMiControlador() {
        return miControlador;
    }

    public void setMiControlador(Controlador miControlador) {
        this.miControlador = miControlador;
    }

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }

    public void setControlador(Controlador c) {
        miControlador =c;
        boton.addActionListener(miControlador);
        boton2.addActionListener(miControlador);
    }


    public JLabel getMyRotulo() {
        return myRotulo;
    }

    public void setMyRotulo(JLabel myRotulo) {
        this.myRotulo = myRotulo;
    }

    public Panel getMiPanel() {
        return miPanel;
    }

    public void setMiPanel(Panel miPanel) {
        this.miPanel = miPanel;
    }

}
