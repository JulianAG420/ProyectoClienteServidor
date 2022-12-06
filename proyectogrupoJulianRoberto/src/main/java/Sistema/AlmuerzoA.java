/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.io.Serializable;

/**
 *
 * @author yulien
 */
public class AlmuerzoA implements Serializable{
    private String  fecha;

    private String tipoBeca;
    
     public AlmuerzoA( String  fecha, String tipoBeca) {
        this.fecha = fecha ;
        
        this.tipoBeca= tipoBeca;
        
    }
      public AlmuerzoA() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
 

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
       @Override
    public String toString() {
        return "Almuerzo Informacion{" + "fecha =" + fecha  +"Tipo de Beca=" + tipoBeca + '}';
    }
}
