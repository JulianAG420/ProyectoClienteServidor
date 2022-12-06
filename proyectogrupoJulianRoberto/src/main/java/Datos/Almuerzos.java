/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author yulien
 */
import Datos.Informacion;
import Sistema.AlmuerzoA;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Almuerzos implements Serializable  {
    public void Escribir(AlmuerzoA A) {
        try {
            ArrayList<AlmuerzoA> almuer = Leer2();
            almuer.add(A);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Almuerzos.txt"));
            for (AlmuerzoA per : almuer) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<AlmuerzoA> Leer2() {
        ArrayList<AlmuerzoA> Almuerzos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Almuerzos.txt"));

            AlmuerzoA A = null;
            A = (AlmuerzoA) s.readObject();
            while (A != null) {
                Almuerzos.add(A);
                A = (AlmuerzoA) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(Almuerzos);
        }
        return Almuerzos;
    }
   
}

