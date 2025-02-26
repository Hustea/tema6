package com.adrian.tema06.Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
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


            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    GestionBicicletas.anadirBicicleta();
                    break;
                case 2:
                    GestionBicicletas.venderBicicleta();
                    break;
                case 3:
                    consultarBicicleta();
                    break;
                case 4:
                    GestionBicicletas.mostrarStock();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void consultarBicicleta() {
        Scanner scanner = new Scanner(System.in);
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
        scanner.nextLine();

        switch (opcion) {
            case 1:
                GestionBicicletas.consultarPorReferencia();
                break;
            case 2:
                GestionBicicletas.consultarPorMarca();
                break;
            case 3:
                GestionBicicletas.consultarPorModelo();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

}
