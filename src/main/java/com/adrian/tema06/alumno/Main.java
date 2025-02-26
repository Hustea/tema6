package com.adrian.tema06.alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();

    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int i;

        do{

            System.out.println("********************* ");
            System.out.println("** GESTIÓN ALUMNOS ** ");
            System.out.println("********************* ");
            System.out.println("1. Nuevo alumno … ");
            System.out.println("2. Baja de alumno … ");
            System.out.println("3. Consultas … ");
            System.out.println("---------------------- ");
            System.out.println("0. Salir ");

            i = Integer.parseInt(scanner.nextLine());

            switch (i){
                case 1 -> Instituto.anadirAlumno();
                case 2 -> Instituto.bajaAlumno();
                case 3 -> menu2();
            }

        }while(i != 0);
    }

    public static void menu2(){
        Scanner scanner = new Scanner(System.in);
        int j;

        do{

            System.out.println("*************** ");
            System.out.println("** CONSULTAS ** ");
            System.out.println("*************** ");
            System.out.println("1. Por grupo ...");
            System.out.println("2. Por edad ...");
            System.out.println("3. Por nia ...");
            System.out.println("4. Por apellidos ...");
            System.out.println("-----------------");
            System.out.println("0. Volver al menú principal");

            j = Integer.parseInt(scanner.nextLine());

            switch (j){
                case 1 -> Instituto.consultarPorGrupo();
                case 2 -> Instituto.consultarPorEdad();
                case 3 -> Instituto.consultarPorNia();
                case 4 -> Instituto.consultarPorApellido();
            }

        }while(j != 0);
    }
}
