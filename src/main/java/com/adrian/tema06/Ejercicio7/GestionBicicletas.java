package com.adrian.tema06.Ejercicio7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionBicicletas {
    public static void main(String[] args) {
        bicicletas.add(new Bicicleta("B001", "Trek", "Marlin 5", 13.5, 29, false, new Date(), 699.99, 10));
        bicicletas.add(new Bicicleta("B002", "Specialized", "Rockhopper", 14.0, 27.5, false, new Date(), 799.99, 5));
        bicicletas.add(new Bicicleta("B003", "Giant", "Talon 3", 12.8, 29, true, new Date(), 899.99, 3));

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    anadirBicicleta();
                    break;
                case 2:
                    venderBicicleta();
                    break;
                case 3:
                    consultarBicicleta();
                    break;
                case 4:
                    mostrarStock();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
    private static List<Bicicleta> bicicletas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void mostrarMenu() {
        System.out.println("*************************");
        System.out.println("** GESTIÓN DE BICICLETAS **");
        System.out.println("*************************");
        System.out.println("1.- Añadir bicicleta");
        System.out.println("2.- Vender bicicleta");
        System.out.println("3.- Consultar bicicleta");
        System.out.println("4.- Mostrar stock");
        System.out.println("------------------------------------");
        System.out.println("0.- Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void anadirBicicleta() {
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
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Introduzca la fecha de fabricación (dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            Date fechaFabricacion = new Date(); // Simplificación, usar SimpleDateFormat para parsear la fecha
            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Introduzca el número de existencias: ");
            int existencias = scanner.nextInt();

            Bicicleta nuevaBicicleta = new Bicicleta(referencia, marca, modelo, peso, tamanoRuedas, tieneMotor, fechaFabricacion, precio, existencias);
            bicicletas.add(nuevaBicicleta);
            System.out.println("Bicicleta añadida correctamente.");
        }
    }

    private static void venderBicicleta() {
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

    private static void consultarBicicleta() {
        System.out.println("***********************");
        System.out.println("** CONSULTA BICICLETA **");
        System.out.println("***********************");
        System.out.println("1.- Consultar por referencia");
        System.out.println("2.- Consultar por marca");
        System.out.println("3.- Consultar por modelo");
        System.out.println("--------------------------------");
        System.out.println("0.- Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                consultarPorReferencia();
                break;
            case 2:
                consultarPorMarca();
                break;
            case 3:
                consultarPorModelo();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void consultarPorReferencia() {
        System.out.print("Introduzca la referencia: ");
        String referencia = scanner.nextLine();

        Bicicleta bicicleta = buscarPorReferencia(referencia);
        if (bicicleta != null) {
            System.out.println(bicicleta);
        } else {
            System.out.println("No se encontró ninguna bicicleta con la referencia " + referencia);
        }
    }

    private static void consultarPorMarca() {
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

    private static void consultarPorModelo() {
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

    private static void mostrarStock() {
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("Referencia: " + bicicleta.referencia + " - Existencias: " + bicicleta.existencias);
        }
    }

    private static Bicicleta buscarPorReferencia(String referencia) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.referencia.equalsIgnoreCase(referencia)) {
                return bicicleta;
            }
        }
        return null;
    }

}
