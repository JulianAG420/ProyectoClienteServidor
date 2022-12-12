package Sistema;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulien
 */
public class Cocineros implements Serializable{
     private String nombre;
     private String apellidos;
    private String cedula;
    private String CocineroEstado;
    private int salariohora;
    public Cocineros( String nombre,String apellidos, String cedula, String CocineroEstado, int salariohora) {
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.cedula = cedula;
         this.CocineroEstado = CocineroEstado;
          this.salariohora = salariohora;
    }
    public Cocineros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getCocineroEstado() {
        return CocineroEstado;
    }

    public void setCocineroEstado(String CocineroEstado) {
        this.CocineroEstado = CocineroEstado;
    }

    public int getSalariohora() {
        return salariohora;
    }

    public void setSalariohora(int salariohora) {
        this.salariohora = salariohora;
    }

   
   
    

    
    @Override
    public String toString() {
        return "Cocinero{" + "Nombre del Profesor=" + nombre +"Apellidos del Profesor=" + apellidos+", cedula=" + cedula +"Estado Cocinero=" + CocineroEstado+"Salario x Hora=" + salariohora + '}';
    }
    
}

