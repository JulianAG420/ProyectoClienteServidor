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

    private int cedula;
    private String nombre;
    private float salarioXhoras;
    private double horas;
    private int mes;
    private int anio;

    public Colaborador() {
    }

    public Colaborador(int cedula, String nombre, float salarioXhoras, double horas, int mes, int anio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioXhoras = salarioXhoras;
        this.horas = horas;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "cedula=" + cedula + ", nombre=" + nombre + ", salarioXhoras=" + salarioXhoras + ", horas=" + horas + ", mes=" + mes + ", anio=" + anio + '}';
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalarioXhoras() {
        return salarioXhoras;
    }

    public void setSalarioXhoras(float salarioXhoras) {
        this.salarioXhoras = salarioXhoras;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
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


}
