/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

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
public class Informacion3 implements Serializable  {
    public void Escribir(Cocineros C) {
        try {
            ArrayList<Cocineros> chef = Leer();
            chef.add(C);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Cocineros.txt"));
            for (Cocineros per : chef) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Cocineros> Leer() {
        ArrayList<Cocineros> Informacion3 = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Cocineros.txt"));

            Cocineros C = null;
            C = (Cocineros) s.readObject();
            while (C != null) {
                Informacion3.add(C);
                C = (Cocineros) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(Informacion3);
        }
        return Informacion3;
    }
   
}
