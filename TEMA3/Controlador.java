/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Profesor
 */
public class Controlador {

    public static String agregarPersona(Persona persona, byte indice) {
        if (Modelo.persona[indice] != null) {
            return "Warning: Ya existe una persona en esa  posicion";
        } else {
            Modelo.persona[indice] = new Persona(
                    persona.getNombres(),
                    persona.getApellidos(),
                    persona.getEdad()
            );
            return "Success: Registro Exitoso";
        }

    }

    public String agregarProfesor(Profesor profesor, byte indice) {
        if (Modelo.profesor[indice] != null) {
            return "Peligro: Ya existe un Profesor agregado";
        } else {
            Modelo.profesor[indice] = new Profesor(
                    profesor.getIdProfesor(),
                    profesor.getGradoEstudios(),
                    profesor.getSueldo(),
                    profesor.getNombres(),
                    profesor.getApellidos(),
                    profesor.getEdad());
            return "Felicidades: Su registro ha sido exitoso";
        }
    }

    public String agregarAlumno(Alumno alumno, byte indice) {
        if (Modelo.alumno[indice] != null) {
            return "Warning: Ya existe un Alumno en esa  posicion";
        } else {
            Modelo.alumno[indice] = new Alumno(
                    alumno.getIdAlumno(),
                    alumno.getPromedio(),
                    alumno.getNombres(),
                    alumno.getApellidos(),
                    alumno.getEdad()
            );
            return "Success: Registro Exitoso";
        }
    }

    public String agregarPacticante(Practicante practicante, byte indice) {
        if (Modelo.practicante[indice] != null) {
            return "Warning: Ya existe un Pacticante en esa  posicion";
        } else {
            Modelo.practicante[indice] = new Practicante(
                    practicante.getIdPracticante(),
                    practicante.getPeriodo(),
                    practicante.getIdAlumno(),
                    practicante.getPromedio(),
                    practicante.getNombres(),
                    practicante.getApellidos(),
                    practicante.getEdad()
            );
            return "Success: A sido registrado";
        }
    }
}
