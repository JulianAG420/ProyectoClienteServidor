/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.io.Serializable;

/**
 *
 * @author Roberto
 */
public class Colaborador implements Serializable {
    
    private int horasTrabajadas;
    private int horas;
    private String mes;
    private int año;
    private int cedulaTrabajador;

    public Colaborador(int horasTrabajadas, int horas, String mes, int año, int cedulaTrabajador) {
        this.horasTrabajadas = horasTrabajadas;
        this.horas = horas;
        this.año= año;
        this.mes= mes; 
        this.cedulaTrabajador = cedulaTrabajador;
    }

    public Colaborador() {
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

   

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCedulaTrabajador() {
        return cedulaTrabajador;
    }

    public void setCedulaTrabajador(int cedulaTrabajador) {
        this.cedulaTrabajador = cedulaTrabajador;
    }

@Override
    public String toString() {
  return "Colaborador{" + "Las horas trabajadas son =" + horasTrabajadas +"Horas=" + horas+", mes=" + mes +"año=" + año+ ", la cedula del trabajador=" + cedulaTrabajador + '}';       
      
}
}
