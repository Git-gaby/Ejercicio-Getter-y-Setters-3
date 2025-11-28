package org.project;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Persona persona = new Persona(); // Usamos el constructor por defecto
        
        System.out.println("\n--- SISTEMA DE REGISTRO CIVIL CREATIVO ---");
        System.out.println("Por favor, ingrese los siguientes datos:");
        
        // 1. Uso de Setters para ingresar datos desde la consola
        System.out.print("Nombre: ");
        persona.setNombre(scn.nextLine());
        
        System.out.print("Apellido Paterno: ");
        persona.setApellidoPaterno(scn.nextLine());
        
        System.out.print("Apellido Materno: ");
        persona.setApellidoMaterno(scn.nextLine());
        
        System.out.print("Sexo (M/F): ");
        // Lee la línea y toma el primer carácter
        persona.setSexo(scn.nextLine().toUpperCase().charAt(0)); 
        
        System.out.print("Edad: ");
        // Aseguramos que la edad sea un número entero
        if (scn.hasNextInt()) { 
            persona.setEdad(scn.nextInt());
            scn.nextLine(); // Consumir el salto de línea pendiente
        } else {
            System.out.println("Error: Edad ingresada no es válida. Usando edad por defecto (0).");
            persona.setEdad(0);
            scn.nextLine();
        }

        System.out.print("Dirección Completa: ");
        persona.setDireccion(scn.nextLine());
        
        // 2. Mostrar resultados usando los métodos de la clase
        System.out.println("\n===============================================");
        System.out.println(persona.mostrarDatos()); // Muestra todos los datos y la ID
        System.out.println("===============================================");
        
        // 3. Uso de las nuevas funciones
        System.out.println(">> Análisis de Derechos Cívicos:");
        System.out.println(persona.verificarDerechoVoto());
        
        scn.close();
    }
}