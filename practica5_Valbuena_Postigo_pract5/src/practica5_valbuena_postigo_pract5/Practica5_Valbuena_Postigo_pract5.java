package practica5_valbuena_postigo_pract5;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Practica5_Valbuena_Postigo_pract5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File pacientes = new File("pacientes.txt");

        try {
            FileReader filereader_pacientes = new FileReader(pacientes);
            BufferedReader bufferedreader_pacientes = new BufferedReader(filereader_pacientes);

            String[] personas = new String[100];

            boolean salir = true;
            int cont = 0;

            while (salir == true) {
                try {
                    System.out.println(" \n----- ELIJA UNA OPCION ----- ");
                    System.out.println(" 1: Crear un paciente:\n 2: Mostrar pacientes\n 3: Sondaje\n 4: Salir ");
                    System.out.println(" ---------------------------- \n\n ");

                    int opc = sc.nextInt();

                    Paciente seres = new Paciente(personas);

                    switch (opc) {
                        case 1:
                            seres.Crear_paciente();

                            FileWriter numero = new FileWriter("config.txt");
                            BufferedWriter bufferedwriter_num = new BufferedWriter(numero);
                            
                            seres.getId();
                            String.valueOf(seres.getId());

                            numero.write(seres.getId());

                            numero.close();

                            break;
                        case 2:

                            seres.Mostrar_paciente();

                            break;
                        case 3:

                            // Sondaje
                            File sondaje = new File("sondaje.txt");
                            FileReader reader_sondaje = new FileReader("sondaje.txt");
                            BufferedReader buffer_sondaje = new BufferedReader(reader_sondaje);
                            
                            String diente = buffer_sondaje.readLine();
                            
                            if(diente != null){
                                try{
                                String [] dientes = diente.split("  ");
                                for (int i = 0; i < dientes.length; i++) {
                                    System.out.print(dientes[i] + " ");
                                    if(dientes[i].contains("+")){
                                        System.out.println("\n");
                                        System.out.print(" Sangra el dientes " +dientes[i] +" ");
                                    }
                                    else{
                                        System.out.println("");
                                    }
                                }}
                                
                            
                                catch(ArrayIndexOutOfBoundsException t){
                                        System.out.println(" Error en el arrays");
                                }       
                                
                                        }
                            else{
                                System.out.println("\n");
                                salir = false;
                            }
                            
                            
                            break;
                        case 4:
                            System.out.println(" ------------------------- ");
                            System.out.println(" - Saliendo del programa -");
                            System.out.println(" -------------------------");
                            salir = false;
                            break;

                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Introduciste mal una opcion");
                    salir = false;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }

}
