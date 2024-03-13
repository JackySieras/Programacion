/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Profesor
 */
public class Alumno extends Persona{
    private String idAlumno;
    private double promedio;

    public Alumno(String idAlumno, double promedio, String nombres, String apellidos, int edad) {
        super(nombres, apellidos, edad);
        this.idAlumno = idAlumno;
        this.promedio = promedio;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "\nNombre: "+super.getNombres()
                +"\nApellido: "+super.getApellidos()
                +"\nEdad: "+super.getEdad()
                +"\nID: "+idAlumno
                +"\nPromedio: "+promedio;
          
    }
    
}
