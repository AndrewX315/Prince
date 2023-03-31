package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Panel {
    public int sizeX = 10;
    public int sizeY = 10;
    public boolean state = false;
    private ArrayList<Persona> persona = new ArrayList();

    public Panel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        for(int i = 0; i < this.persona.size(); ++i) {
            if (!((Persona)this.persona.get(i)).st) {
                g.setColor(Color.BLACK);
                g.fillOval(((Persona)this.persona.get(i)).x, ((Persona)this.persona.get(i)).y, this.sizeX, this.sizeY);
            } else {
                g.setColor(Color.GREEN);
                g.fillOval(((Persona)this.persona.get(i)).x, ((Persona)this.persona.get(i)).y, this.sizeX, this.sizeY);
            }
        }

    }

    public void setPersona(ArrayList<Persona> pps) {
        this.persona = pps;
    }
}
