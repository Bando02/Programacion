/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;

import java.util.Scanner;
import java.util.Arrays;

public class Motel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // precio por noche son 50€
        // tiene 20 habitaciones
        // necesitan nombre y nºnoches
        // 1. inserta huesped
        // 2. muestra nº habitaciones libres
        // 3. calcula precio por nombre del huesped
        // 4. elimina huesped por nombre
        // 5. busca huesped por nombre
        // 6. buscar huesped por nº habitaciones
        // 7. salir
        Huesped[] huespedes = new Huesped[20];

        int opcion = 0;
        boolean exit = false;
        int yn = 0;

        int habitaciones = 0;

        do {

            System.out.println("Introduce 1. Insertar nuevo huesped, 2. Muestra nºhabitaciones disponibles,"
                    + " 3. Calcula precio x noche del huesped"
                    + "4. Elimina Huesped por nombre, 5. Busca huesped por nombre,"
                    + " 6. Busca Huesped por nºhabitación, 7. salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Inserta un huesped
                    if (estaLleno(huespedes)) {
                        System.out.println("Esta lleno");

                    } else {
                        for (int i = 0; i < huespedes.length; i++) {
                            if (huespedes[i] == null) {
                                System.out.println("Introduce el nombre y nº noches ");
                                huespedes[i] = new Huesped(sc.next(), sc.nextInt());
                                i = huespedes.length;
                            }

                        }

                    }
                    break;

                case 2: //Muestra nº habitaciones disponibles
                    int libre = 0;
                    for (int a = 0; a < huespedes.length; a++) {
                        if (huespedes[a] == null) {
                            libre++;

                            System.out.println("Hay un total de " + libre + " habitaciones disponibles");
                        }
                    }
                    System.out.println("Quieres realizar otra accion ? ( 1 = Si / 2 = No )");
                    switch (yn) {
                        case 1:
                            exit = true;
                            break;

                        case 2:
                            exit = false;
                            break;

                    }
                    break;

                case 3:

                    System.out.println("Quieres realizar otra accion ? ( 1 = Si / 2 = No )");
                    switch (yn) {
                        case 1:
                            exit = true;
                            break;

                        case 2:
                            exit = false;
                            break;
                    }

                case 4:

                    System.out.println("Quieres realizar otra accion ? ( 1 = Si / 2 = No )");
                    switch (yn) {
                        case 1:
                            exit = true;
                            break;

                        case 2:
                            exit = false;
                            break;
                    }

                case 5:

                    System.out.println("Quieres realizar otra accion ? ( 1 = Si / 2 = No )");
                    switch (yn) {
                        case 1:
                            exit = true;
                            break;

                        case 2:
                            exit = false;
                            break;
                    }

                case 6:

                    System.out.println("Quieres realizar otra accion ? ( 1 = Si / 2 = No )");
                    switch (yn) {
                        case 1:
                            exit = true;
                            break;

                        case 2:
                            exit = false;
                            break;
                    }

                case 7:

                    exit = true;

            }

        } while (exit = false);

        System.out.println(" Sali del while");

    }

    public static boolean estaLleno(Huesped[] huespedes) {
        boolean respuesta = false;
        int cont = 0;
        for (int i = 0; i < huespedes.length; i++) {
            if (huespedes[i] == null) {
                cont++;
            }
        }
        if (cont == 20) {
            respuesta = true;
        }
        return respuesta;
    }}
    
