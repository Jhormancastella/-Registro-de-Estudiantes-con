package com.viernes;

import java.util.*;

public class GestionEstudiantes {
    public static void main(String[] args) {
        //Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de estudiantes a registrar
        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Crear una lista para almacenar los nombres de los estudiantes
        List<String> estudiantes = new ArrayList<>();

        //Solicitar los nombres de los estudiantes
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }

        //Mostrar la lista completa de estudiantes
        System.out.println("\n📋 Lista completa de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        // Ordenar los nombres en orden alfabético y mostrarlos
        Collections.sort(estudiantes); 
        System.out.println("\n📋 Lista de estudiantes ordenada alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        //  Permitir que el usuario busque si un estudiante está 
        System.out.print("\n¿Desea buscar un estudiante? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nombre del estudiante que desea buscar: ");
            String nombreBuscar = scanner.nextLine();

            if (estudiantes.contains(nombreBuscar)) {
                System.out.println("✅ El estudiante '" + nombreBuscar + "' está en la lista.");
            } else {
                System.out.println("❌ El estudiante '" + nombreBuscar + "' NO está en la lista.");
            }
        }

        
        scanner.close();
    }
}
