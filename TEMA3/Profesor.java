/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Profesor
 */
public class Profesor extends Persona{
    private String idProfesor, gradoEstudios;
    private double sueldo;

    public Profesor(String idProfesor, String gradoEstudios, double sueldo, String nombres, String apellidos, int edad) {
        super(nombres, apellidos, edad);
        this.idProfesor = idProfesor;
        this.gradoEstudios = gradoEstudios;
        this.sueldo = sueldo;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getGradoEstudios() {
        return gradoEstudios;
    }

    public void setGradoEstudios(String gradoEstudios) {
        this.gradoEstudios = gradoEstudios;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + "idProfesor=" + idProfesor 
                + ", nombres=" + super.getNombres()
                + ", apellidos=" + super.getApellidos()
                + ", gradoEstudios=" + gradoEstudios
                + ", edad=" + super.getEdad()
                + ", sueldo=" + sueldo + '}';
    }
    
}
