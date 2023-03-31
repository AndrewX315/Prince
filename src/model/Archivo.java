package model;

import java.io.*;

public class Archivo {
    public String roW;
    File file_Name = null;
    FileReader file_Reader = null;
    BufferedReader buff_Reader = null;

    public void file_Load() {

        try {
            file_Name = new File("resources\\texto.txt");
            FileInputStream file_Input = new FileInputStream(file_Name);
            BufferedInputStream buff_Input = new BufferedInputStream(file_Input);

            file_Reader = new FileReader(file_Name);
            buff_Reader = new BufferedReader(file_Reader);

            while ((roW = buff_Reader.readLine()) != null) {
                System.out.println(roW);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != file_Reader) {
                    file_Reader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public void file_Write(){
        try {

            File file_Name = new File("texto.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(b);
            escribir.close();
        }
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

}
