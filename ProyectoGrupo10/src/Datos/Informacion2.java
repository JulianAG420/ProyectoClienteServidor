/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Datos.Informacion;
import Sistema.Profesores;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yulien
 */
public class Informacion2 implements Serializable  {
    public void Escribir(Profesores P) {
        try {
            ArrayList<Profesores> profe = Leer();
            profe.add(P);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Profesores.txt"));
            for (Profesores per : profe) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Profesores> Leer() {
        ArrayList<Profesores> Informacion2 = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Profesores.txt"));

            Profesores P = null;
            P = (Profesores) s.readObject();
            while (P != null) {
                Informacion2.add(P);
                P = (Profesores) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(Informacion2);
        }
        return Informacion2;
    }
   
}
