package com.adrian.tema06.Ejercicio7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionBicicletas {
    private static List<Bicicleta> bicicletas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void anadirBicicleta() {
        System.out.print("Introduzca la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicletaExistente = buscarPorReferencia(referencia);
        if (bicicletaExistente != null) {
            System.out.print("La referencia ya existe. ¿Cuántas unidades desea añadir? ");
            int cantidad = scanner.nextInt();
            bicicletaExistente.existencias += cantidad;
            System.out.println("Stock actualizado. Nuevo stock: " + bicicletaExistente.existencias);
        } else {
            System.out.print("Introduzca la marca: ");
            String marca = scanner.nextLine();
            System.out.print("Introduzca el modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Introduzca el peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Introduzca el tamaño de las ruedas en pulgadas: ");
            double tamanoRuedas = scanner.nextDouble();
            System.out.print("¿Tiene motor? (true/false): ");
            boolean tieneMotor = scanner.nextBoolean();
            scanner.nextLine();
            System.out.print("Introduzca la fecha de fabricación (dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            Date fechaFabricacion = new Date();
            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Introduzca el número de existencias: ");
            int existencias = scanner.nextInt();

            Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamanoRuedas, tieneMotor, fechaFabricacion, precio, existencias);
            bicicletas.add(nuevaBicicleta);
            System.out.println("Bicicleta añadida correctamente.");
        }
    }

    public static void venderBicicleta() {
        System.out.print("Introduzca la referencia de la bicicleta a vender: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicleta = buscarPorReferencia(referencia);
        if (bicicleta != null) {
            if (bicicleta.existencias > 0) {
                bicicleta.existencias--;
                System.out.println("Bicicleta " + referencia + " vendida correctamente. Stock restante: " + bicicleta.existencias);
            } else {
                System.out.println("No hay stock disponible para la bicicleta " + referencia);
            }
        } else {
            System.out.println("No se encontró ninguna bicicleta con la referencia " + referencia);
        }
    }

    public static void consultarPorReferencia() {
        System.out.print("Introduzca la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicleta = buscarPorReferencia(referencia);
        if (bicicleta != null) {
            System.out.println(bicicleta);
        } else {
            System.out.println("No se encontró ninguna bicicleta con la referencia " + referencia);
        }
    }

    public static void consultarPorMarca() {
        System.out.print("Introduzca la marca: ");
        String marca = scanner.nextLine();

        boolean encontrada = false;
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.marca.equalsIgnoreCase(marca)) {
                System.out.println(bicicleta);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron bicicletas de la marca " + marca);
        }
    }

    public static void consultarPorModelo() {
        System.out.print("Introduzca el modelo: ");
        String modelo = scanner.nextLine();

        boolean encontrada = false;
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.modelo.equalsIgnoreCase(modelo)) {
                System.out.println(bicicleta);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron bicicletas del modelo " + modelo);
        }
    }


    public static Bicicleta buscarPorReferencia(String referencia) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.referencia.equalsIgnoreCase(referencia)) {
                return bicicleta;
            }
        }
        return null;
    }

    public static void mostrarStock() {
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("Referencia: " + bicicleta.referencia + " - Existencias: " + bicicleta.existencias);
        }
    }

}
