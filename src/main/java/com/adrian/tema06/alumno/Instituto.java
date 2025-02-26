
package com.adrian.tema06.alumno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Instituto {
    private static List<Alumnos> alumnos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void anadirAlumno() {
        System.out.print("Introduzca el nia: ");
        int nia = scanner.nextInt();

        Alumnos alumnoExistente = buscarPorNia(nia);
        if (alumnoExistente != null) {
            System.out.print("El nia ya existe.");

        } else {
            System.out.println("Introduzca la nombre: ");
            String nombre = String.valueOf(scanner.nextLine());
            System.out.println("Introduzca el apellido: ");
            String apellido = String.valueOf(scanner.nextLine());
            System.out.println("Introduzca la fecha de nacimiento (dd/MM/yyyy): ");
            String fechaStr = String.valueOf(scanner.nextLine());
            Date fechaFabricacion = new Date();
            System.out.println("Introduzca el grupo: ");
            String grupo = String.valueOf(scanner.nextLine());
            System.out.println("Introduzca el número de telefono: ");
            int telefono = Integer.parseInt(scanner.nextLine());

            Alumnos nuevoAlumno = new Alumnos(nia, nombre, apellido, fechaStr, grupo, telefono);
            alumnos.add(nuevoAlumno);
            System.out.println("Alumno añadido correctamente.");
        }
    }

    public static void bajaAlumno() {
        System.out.print("Introduzca el nia del alumno que desea dar de baja: ");
        int nia = scanner.nextInt();

        Alumnos alumno = buscarPorNia(nia);
        if (alumno != null) {
                //alumno.nia--;
                System.out.println("Alumno con nia: " + nia + " dado de baja correctamente.");

        } else {
            System.out.println("No se encontró ninguna alumno con el nia: " + nia);
        }
    }



    public static Alumnos buscarPorNia(int nia) {
        for (Alumnos alumno : alumnos) {
            if (alumno.getNia() == nia) {
                return alumno;
            }
        }
        return null;
    }

    public static void consultarPorGrupo() {
        System.out.print("Introduzca el grupo: ");
        String grupo = scanner.nextLine();

        boolean encontrada = false;
        for (Alumnos alumno : alumnos) {
            if (alumno.getGrupo().equalsIgnoreCase(grupo)) {
                System.out.println(grupo);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron alumnos en el grupo: " + grupo);
        }
    }

    public static void consultarPorEdad() {
        System.out.print("Introduzca el edad: ");
        String edad = scanner.nextLine();

        boolean encontrada = false;
        for (Alumnos alumno : alumnos) {
            if (alumno.getFecha().equalsIgnoreCase(edad)) {
                System.out.println(edad);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron alumnos con edad: " + edad);
        }
    }

    public static void consultarPorNia() {
        System.out.print("Introduzca el nia: ");
        int nia = scanner.nextInt();

        boolean encontrada = false;
        for (Alumnos alumno : alumnos) {
            if (alumno.getNia() == nia) {
                System.out.println(nia);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron alumnos con nia: " + nia);
        }
    }

    public static void consultarPorApellido() {
        System.out.print("Introduzca el apellido: ");
        String apellido = scanner.nextLine();

        boolean encontrada = false;
        for (Alumnos alumno : alumnos) {
            if (alumno.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println(apellido);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron alumnos con apellido: " + apellido);
        }
    }

}
