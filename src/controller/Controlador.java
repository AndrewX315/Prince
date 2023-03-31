package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Logica;

public class Controlador implements ActionListener {

    Logica l;

    public Controlador(Logica log) {
        l=log;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

   //     l.punt();

    }


}
