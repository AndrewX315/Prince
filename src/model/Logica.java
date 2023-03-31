package model;

import View.MiVentana;
import java.util.ArrayList;
import java.util.Random;
public class Logica {
    MiVentana view;
    Random r = new Random();
    Persona[] t = new Persona[]{new Persona(0, 0, true), new Persona(0, 800, false), new Persona(1200, 800, false), new Persona(1200, 0, false)};
    Persona ref;
    MiVentana Wind;
    ArrayList<Persona> dots;

    public Logica(MiVentana v) {
        this.ref = new Persona(this.r.nextInt(1100), this.r.nextInt(800), this.r.nextBoolean());
        this.dots = new ArrayList();
        this.dots.add(this.t[0]);
        this.dots.add(this.t[1]);
        this.dots.add(this.t[2]);
        this.dots.add(this.t[3]);
        this.dots.add(this.ref);
        this.view = v;
        this.view.getMiPanel().setPersona(this.dots);
        this.view.getMiPanel().repaint();
    }

    public void genDots() {
        for(int i = 0; i < 1000; ++i) {
            int sel = this.r.nextInt(this.t.length);
            int newX = Math.abs(this.ref.x + this.t[sel].x) / 2;
            int newY = Math.abs(this.ref.y + this.t[sel].y) / 2;
            boolean newS = false;
            this.dots.add(new Persona(newX, newY, newS));
            this.ref.x = newX;
            this.ref.y = newY;
            this.ref.st = newS;
            this.view.getMiPanel().setPersona(this.dots);
            this.view.getMiPanel().repaint();
        }

    }

    public void genCov() {
        for(int i = 0; i < this.dots.size(); ++i) {
            if (((Persona)this.dots.get(i)).st) {
                for(int j = 0; j < this.dots.size(); ++j) {
                    int FdistX = ((Persona)this.dots.get(j)).x;
                    int FdistY = ((Persona)this.dots.get(j)).y;
                    int IdistX = ((Persona)this.dots.get(i)).x;
                    int IdistY = ((Persona)this.dots.get(i)).y;
                    float Ope = (float)Math.sqrt(Math.pow((double)(FdistX - IdistX), 2.0) + Math.pow((double)(FdistY - IdistY), 2.0));
                    if ((double)Ope < 10.0) {
                        this.dots.set(j, new Persona(FdistX, FdistY, true));
                    }
                }
            }
        }

        this.view.getMiPanel().setPersona(this.dots);
        this.view.getMiPanel().repaint();
    }
}
