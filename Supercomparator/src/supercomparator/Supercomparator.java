/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supercomparator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Medac
 */
public class Supercomparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto("Harina", 3);
        Producto p2 = new Producto("Jamón", 4.50);
        Producto p3 = new Producto("Tomate", 3.45);
        Producto p4 = new Producto("Pan", 1.50);
        Producto p5 = new Producto("Aceite", 5.50);
        Producto p6 = new Producto("Cebolla", 2.40);
        Producto p7 = new Producto("Ajos", 3.45);
        Producto p8 = new Producto("Puerro", 2.6);
        Producto p9 = new Producto("Mantequilla", 3);
        Producto p10 = new Producto("Sal", 1.35);

        //
        Producto p11 = new Producto("Harina", 3.45);
        Producto p12 = new Producto("Jamón", 3.65);
        Producto p13 = new Producto("Tomate", 2.70);
        Producto p14 = new Producto("Pan", 1);
        Producto p15 = new Producto("Aceite", 6);
        Producto p16 = new Producto("Cebolla", 3);
        Producto p17 = new Producto("Ajos", 3);
        Producto p18 = new Producto("Puerro", 2.1);
        Producto p19 = new Producto("Mantequilla", 2.9);
        Producto p20 = new Producto("Sal", 1.74);

        Producto[] primeralista = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        Producto[] segundalista = {p11, p12, p13, p14, p15, p16, p17, p18, p19, p20};

        Supermercado dia = new Supermercado("Dia", primeralista);
        Supermercado carrefour = new Supermercado("Carrefour", segundalista);
        Cesta[] cesta = new Cesta[20];
        int opcion = 0;
        File file = new File("cesta.txt");

        System.out.println("Bienvenido a la APP SuperComparator");

        while (opcion != 3) {

            System.out.println("");
            System.out.println("MENU: 1. COMPARATOR DE PRODUCTOS 2. VER LA CESTA DE LA COMPRA 3. SALIR");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
        
                        System.out.println("Introduce el nombre del producto: ");
                        String nombre = sc.nextLine();
                        for (int i = 0; i < dia.getListadeproductos().length; i++) {
                            if (dia.getListadeproductos()[i].getNombre().equalsIgnoreCase(nombre)) {
                                double precioDia = dia.getListadeproductos()[i].getPrecio();
                                double precioCarrefour = carrefour.getListadeproductos()[i].getPrecio();
                                if (precioDia > precioCarrefour) {
                                    System.out.println("El precio más barato es el del supermercado Carrefour y el precio es: " + precioCarrefour);
                                    añadirCesta(carrefour.getListadeproductos()[i], cesta, bw);
                                } else if (precioCarrefour > precioDia) {
                                    System.out.println("El precio más barato es el del supermercado Dia y el precio es: " + precioDia);
                                    añadirCesta(dia.getListadeproductos()[i], cesta, bw);
                                } else {
                                    System.out.println("El precio de ambos supermercados es el mismo" + precioDia);
                                    añadirCesta(dia.getListadeproductos()[i], cesta, bw);
                                }
                            }
                        }
                        
                        bw.close();
                    } catch (IOException e) {
                        
                    }
                    break;
                case 2:
                    double precio = 0;
                    for (int i = 0; i < cesta.length; i++) {
                        if (cesta[i] != null) {
                            int unidades = cesta[i].getUnidades();
                            String nombreProducto = cesta[i].getProducto().getNombre();
                            precio = precio + cesta[i].getProducto().getPrecio() * unidades;

                            System.out.println(nombreProducto + " " + unidades);
                        }
                    }
                    System.out.println("El precio total es: " + precio);
                    break;
                case 3:
                    System.out.println("¡Gracias por utilizar nuestra App! ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida, introduce un número correcto.");
                    break;
            }
        }
    }

    public static void añadirCesta(Producto producto, Cesta[] cesta, BufferedWriter bw) {
        System.out.println("¿Quieres añadirlo a tu cesta? Si/No");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("Si")) {
            System.out.println("¿Cuántas unidades quieres comprar?");
            int unidades = sc.nextInt();
            try {
                bw.write(producto.getNombre() + ":" + unidades + "\n");
            } catch (IOException ex) {
                Logger.getLogger(Supercomparator.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < cesta.length; i++) {
                if (cesta[i] == null) {
                    cesta[i] = new Cesta(producto, unidades);
                    break;
                }
                if (i == cesta.length - 1 && cesta[i] != null) {
                    System.out.println("La cesta está llena, no puedes añadir más productos.");
                }
            }

        }
    }
}
