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
public class Profesores implements Serializable{
     private String nombre;
     private String apellidos;
    private String cedula;
    private String correo;
    private String profesorEstado;
    private int salariohora;
    public Profesores( String nombre,String apellidos, String cedula,String correo, String profesorEstado, int salariohora) {
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.cedula = cedula;
         this.correo = correo;
         this.profesorEstado = profesorEstado;
          this.salariohora = salariohora;
    }
    public Profesores() {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesorEstado() {
        return profesorEstado;
    }

    public void setProfesorEstado(String profesorEstado) {
        this.profesorEstado = profesorEstado;
    }

    public int getSalariohora() {
        return salariohora;
    }

    public void setSalariohora(int salariohora) {
        this.salariohora = salariohora;
    }

   
   
    

    
    @Override
    public String toString() {
        return "Profesor{" + "Nombre del Profesor=" + nombre +"Apellidos del Profesor=" + apellidos+", cedula=" + cedula +"correo=" + correo+"Estado Profesor=" + profesorEstado+"Salario x Hora=" + salariohora + '}';
    }
    
}

