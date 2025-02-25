package com.adrian.tema06.Ejercicio7;

import java.util.Date;

class Bicicleta {
    String referencia;
    String marca;
    String modelo;
    double peso;
    double tamanoRuedas;
    boolean tieneMotor;
    Date fechaFabricacion;
    double precio;
    int existencias;

    public Bicicleta(String referencia, String marca, String modelo, double peso, double tamanoRuedas, boolean tieneMotor, Date fechaFabricacion, double precio, int existencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanoRuedas = tamanoRuedas;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia + "\nMarca: " + marca + "\nModelo: " + modelo + "\nPeso: " + peso + " kg\nTamaño de ruedas: " + tamanoRuedas + " pulgadas\nTiene motor: " + (tieneMotor ? "Sí" : "No") + "\nFecha de fabricación: " + fechaFabricacion + "\nPrecio: $" + precio + "\nExistencias: " + existencias;
    }
}
