package com.adrian.tema06.alumno;

public class Alumnos {
    final private int nia;
    final private String nombre;
    final private String apellido;
    final private String fechaNacimiento;
    final private String grupo;
    final private int telefono;

    // Constructor con parámetros
    public Alumnos(int nia, String nombre, String apellido, String fechaNacimiento, String grupo, int telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;

    }

    // Getters y Setters
    public int getNia() { return nia; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getFecha() { return fechaNacimiento; }
    public String getGrupo() { return grupo; }
    public int getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "Alumno{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupo='" + grupo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
