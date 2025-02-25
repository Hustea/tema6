package com.adrian.tema06.coche;

class Coche {
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    private String tipo;
    private int anioFabricacion;
    private String seguro;

    private static int numeroMatricula = 0;
    private static char letra1 = 'A';
    private static char letra2 = 'A';
    private static char letra3 = 'A';

    // Constructor con valores iniciales
    public Coche() {
        this.modelo = "Ford Fiesta";
        this.color = "Negro";
        this.pinturaMetalizada = false;
        this.matricula = generarMatricula();
        this.tipo = "MINI";
        this.anioFabricacion = 2018;
        this.seguro = "TERCEROS";
    }

    // Constructor con parámetros
    public Coche(String modelo, String color, boolean pinturaMetalizada, String tipo, int anioFabricacion, String seguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = generarMatricula();
        this.tipo = tipo;
        this.anioFabricacion = anioFabricacion;
        this.seguro = seguro;
    }

    // Getters y Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isPinturaMetalizada() { return pinturaMetalizada; }
    public void setPinturaMetalizada(boolean pinturaMetalizada) { this.pinturaMetalizada = pinturaMetalizada; }

    public String getMatricula() { return matricula; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getAnioFabricacion() { return anioFabricacion; }
    public void setAnioFabricacion(int anioFabricacion) { this.anioFabricacion = anioFabricacion; }

    public String getSeguro() { return seguro; }
    public void setSeguro(String seguro) { this.seguro = seguro; }


    private String generarMatricula() {
        String nuevaMatricula = String.format("%04d%c%c%c", numeroMatricula, letra1, letra2, letra3);

        numeroMatricula++;

        if (numeroMatricula > 9999) {
            numeroMatricula = 0;

            if (letra3 < 'Z') {
                letra3++;
            } else {
                letra3 = 'A';
                if (letra2 < 'Z') {
                    letra2++;
                } else {
                    letra2 = 'A';
                    if (letra1 < 'Z') {
                        letra1++;
                    } else {

                        System.out.println("¡Se han agotado todas las matrículas posibles!");
                    }
                }
            }
        }
        return nuevaMatricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", pinturaMetalizada=" + pinturaMetalizada +
                ", matricula='" + matricula + '\'' +
                ", tipo=" + tipo +
                ", anioFabricacion=" + anioFabricacion +
                ", seguro=" + seguro +
                '}';
    }
}