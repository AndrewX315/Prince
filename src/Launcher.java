//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Controller.Controlador;
import Model.Logica;
import View.MiVentana;

public class Launcher {
    public Launcher() {
    }

    public static void main(String[] args) {
        MiVentana miVentana = new MiVentana();
        Logica miLogica = new Logica(miVentana);
        Controlador miControlador = new Controlador(miLogica);
        miVentana.setControlador(miControlador);
    }
}