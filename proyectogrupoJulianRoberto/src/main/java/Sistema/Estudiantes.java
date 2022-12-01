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
public class Estudiantes implements Serializable{
     private String nombre;
     private String apellidos;
    private int cedula;
    private int edad;
    private String estadobeca;
    private String estudianteEstado;
    private String seccion;
    public Estudiantes( String nombre,String apellidos, int cedula,int edad, String estadobeca,String estudianteEstado,String seccion) {
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.cedula = cedula;
        this.edad= edad;
        this.estadobeca= estadobeca;
        this.estudianteEstado = estudianteEstado;
        this.seccion=seccion;
    }
    public Estudiantes() {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadobeca() {
        return estadobeca;
    }

    public void setEstadobeca(String estadobeca) {
        this.estadobeca = estadobeca;
    }

    public String getEstudianteEstado() {
        return estudianteEstado;
    }

    public void setEstudianteEstado(String estudianteEstado) {
        this.estudianteEstado = estudianteEstado;
    }



    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    

   
    

    
    @Override
    public String toString() {
        return "Estudiante{" + "Nombre del Estudiante=" + nombre +"Apellidos del Estudiante=" + apellidos+", cedula=" + cedula +"edad=" + edad+"Estado beca=" + estadobeca+"Estado Estudiante=" + estudianteEstado+ ", seccion=" + seccion + '}';
    }
    
}

