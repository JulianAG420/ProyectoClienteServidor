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
    private int dia;
    private int mes;
    private int anio;
    private String tipoBeca;
    
     public AlmuerzoA( int dia, int mes, int anio, String tipoBeca) {
        this.dia = dia;
        this.mes= mes;
        this.anio= anio;
        this.tipoBeca= tipoBeca;
        
    }
      public AlmuerzoA() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
       @Override
    public String toString() {
        return "Almuerzo Informacion{" + "Dia=" + dia +"mes=" + mes+", año=" + anio +"Tipo de Beca=" + tipoBeca + '}';
    }
}
