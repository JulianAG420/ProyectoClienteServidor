package Sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulien
 */
import Sistema.Estudiantes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Informacion implements Serializable {
   public void Escribir(Estudiantes ET) {
        try {
            ArrayList<Estudiantes> estu = Leer();
            estu.add(ET);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Estudiantes.txt"));
            for (Estudiantes per : estu) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Estudiantes> Leer() {
        ArrayList<Estudiantes> Informacion = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("Estudiantes.txt"));

            Estudiantes ET = null;
            ET = (Estudiantes) s.readObject();
            while (ET != null) {
                Informacion.add(ET);
                ET = (Estudiantes) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Informacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(Informacion);
        }
        return Informacion;
    }
   
}

