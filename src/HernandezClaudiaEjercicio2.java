//Ejercicio 2 Tablero de Ajedrez
//Claudia Hernandez Colomer
//FP DAW La Salle
//Profesora Marta Bella
//noviembre 2024

import java.util.Scanner;

public class HernandezClaudiaEjercicio2 {
    public static void main(String[] args) {

        /*Te pide que escribas un programa en Java que imprima un tablero de ajedrez dado un patrón definido
        por un carácter específico y el tamaño de cada casilla.
        En tu programa tendrás que:
        • Solicitar al usuario el carácter que usar como patrón. Puede ser una letra, un número o incluso
        un símbolo.
        • Solicitar al usuario el tamaño de la casilla (1<=size<=15)*/

        System.out.println("Hola campeones del ajedrez. Hagamos esos tableros");
        Scanner input = new Scanner(System.in);

        final int TOPE_TABLERO = 4;
        final int MAYOR = 15;
        String simbolo = "";
        int size = 0;


        do {
            System.out.println("Dime que patrón quieres para tu tablero. Puede ser una letra, un número o incluso un símbolo.");
            if (input.hasNextLine()){
                simbolo = input.nextLine();

                if (simbolo.length() > 1) {
                    System.out.println("Debe ser un único elemento");
                    simbolo = "";
                 } else {
                    System.out.println("Elegiste usar: " + simbolo);
                }
            } else {
                System.out.println("algo ");
            }
        } while (simbolo == "");

        do {
            System.out.println("Ahora dime de qué tamaño quieres la casilla. Tiene que ser un número entero, diferente de cero, positivo y no mayor de " + MAYOR);
            if (input.hasNextInt()){
                size = input.nextInt();
                input.nextLine();
                if (size < 1 || size > MAYOR) {
                    System.out.println("Selección no válida. Debes elegir un número menor de " + MAYOR);
                    size = 0;
                } else {
                    System.out.println("Tenemos una casilla de " + size);
                }
            } else {
                System.out.println("Selección no válida. Debes elegir un número entero");
                input.nextLine();
            }
        } while (size == 0);

        for (int i =0; i<TOPE_TABLERO; i++) {
            for (int j =0; j<TOPE_TABLERO; j++) {
                System.out.print("|" );
                for (int blancas =0; blancas<size; blancas++){
                    System.out.print(" ");
                }
                System.out.print("|");
                for (int negras =0; negras<size; negras++){
                    System.out.print(simbolo);
                }
            }
            System.out.println("|");

            for (int j =0; j<TOPE_TABLERO; j++) {
                System.out.print("|");
                for (int negras =0; negras<size; negras++){
                    System.out.print(simbolo);
                }
                System.out.print("|" );
                for (int blancas =0; blancas<size; blancas++){
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        System.out.println("Así luce tu tablero. Espero que lo disfrutes");
    }
}