import hotel.Room;

import java.util.Scanner;

/**
 * Clase que modela el programa Hotel Reservation
 * */
public class HotelReservation {

    /**
     * Método principal, obtiene parámetros para ejectuar los procesos.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Hotel Castillo");

        // Opción del menú.
        int action;
        int actionEnd;
        do {
            System.out.println("¿En qué tipo de cuarto deseas hospedarte?");
            System.out.println("#1. Económica\n" +
                    "#2. Matrimonial\n" +
                    "#3. Presidencial\n");
            action = sc.nextInt();
            menuOption(action);
            System.out.println("¿Deseas volver o salir?\n" +
                    "#1. Volver.\n" +
                    "#2. Salir.");
            actionEnd = sc.nextInt();
            optionEnd(actionEnd);
        } while (action != 4);
        sc.close();
    }

    public static void menuOption(int action){
        Scanner sc = new Scanner(System.in);

        int days;
        Room room;
        switch (action){
            case 1:
                System.out.println("¿Cuantos días te quieres quedar?");
                days = sc.nextInt();
                room = new Room("Económica", 20000, days);
                System.out.println(room.printInnvoiceReservation());
                break;
            case 2:
                System.out.println("¿Cuantos días te quieres quedar?");
                days = sc.nextInt();
                room = new Room("Matrimonial", 35000, days);
                System.out.println(room.printInnvoiceReservation());
                break;
            case 3:
                System.out.println("¿Cuantos días te quieres quedar?");
                days = sc.nextInt();
                room = new Room("Presidencial", 55000, days);
                System.out.println(room.printInnvoiceReservation());
                break;
        }
    }

    public static void optionEnd(int actionEnd){
          switch (actionEnd){
            case 1:
                break;
            case 2:
                System.out.println("Gracias por usarme.");
                System.exit(0);
                break;
        }

    }
}
