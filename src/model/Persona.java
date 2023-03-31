//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Model;

public class Persona {
    public int x = 0;
    public int y = 0;
    public boolean st = false;

    public Persona(int x, int y, boolean st) {
        this.x = x;
        this.y = y;
        this.st = st;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSt() {
        return this.st;
    }

    public void setSt(boolean st) {
        this.st = st;
    }

    public String toString() {
        return "Persona{Posición x=" + this.x + ", Posición y=" + this.y + ", Estado =" + this.st + '}';
    }
}