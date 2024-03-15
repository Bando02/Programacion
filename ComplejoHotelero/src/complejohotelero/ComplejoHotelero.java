package complejohotelero;

import java.util.Scanner;
import java.util.Arrays;

public class ComplejoHotelero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boom HotelBoom = new Boom();
        Blue HotelBlue = new Blue();
        ChinaTown HotelChinaTown = new ChinaTown();
        Fontaine HotelFontaine = new Fontaine();
        President HotelPresident = new President();
        Waikiki HotelWaikiki = new Waikiki();

        Hoteles[] HotelArray = {HotelBlue, HotelBoom, HotelChinaTown, HotelFontaine, HotelPresident, HotelWaikiki};
        Jugador j1 = new Jugador("");
        int turnos = 12;

        System.out.println("******COMIENZA EL JUEGO: EL COMPLEJO HOTELERO NO TAN COMPLEJO********");

        System.out.println("Añade nombre de jugador");

        String nombre = sc.next();
        j1.setJugador(nombre);

        System.out.println(j1.getNombre() + " empezaras con 25000000€");

        System.out.println("Estas son las instrucciones ");
        System.out.println("El juego acaba cuando te quedas sin dinero o\n"
                + "se termina el total de los turnos (12). Ganas siempre que consigas todos los complejos en menos\n"
                + "de 12 turnos y no estás con 0 euros");

        do {
            int opcion = 0;

            switch (opcion) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;
                case 6:
                    break;

            }

        } while (turnos > 0 || j1.DineroJugador > 0);

    }

}
