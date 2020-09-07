/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int opcionMenu = 10;
        String nombre;
        String autor;

        while (opcionMenu != 7) {

            System.out.println("### SIMULACION DE GIT ###");
            System.out.println("Opciones:");
            System.out.println("1. Add.");
            System.out.println("2. Commit.");
            System.out.println("3. Pull.");
            System.out.println("4. Push.");
            System.out.println("5. Status.");
            System.out.println("6. Crear Archivo.");
            System.out.println("7. Salir.");
            System.out.println("Introduzca una opcion: ");

                       
            opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                case 1:
                    //ADD
                    break;
                case 2:
                    //COMMIT
                    break;
                case 3:
                    //PULL
                    break;
                case 4:
                    //PUSH
                    break;
                case 5:
                    //STATUS
                    break;
                case 6:
                    //CREAR ARCHIVO
                    break;
                case 7:
                    //SALIR
                    break;
            }
        }
    }
}
