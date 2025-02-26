package com.adrian.tema06.Ciclo;

public class Asignaturas {

    final private String nombre;
    final private int codigoNumerico;
    final private String asignatura;

    // Constructor con parámetros
    public Asignaturas(String nombre, int codigo, String asignatura) {
        this.nombre = nombre;
        this.codigoNumerico = codigo;
        this.asignatura = asignatura;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getCodigo() { return codigoNumerico; }
    public String getAsignatura() { return asignatura; }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", Codigo='" + codigoNumerico + '\'' +
                ", Curso=" + asignatura +
                '}';
    }
}
