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

        Scanner entradaNombreRepo = new Scanner(System.in);
        System.out.println("Ingrese el nombre del repositorio: ");
        String nombreRepositorio = entradaNombreRepo.nextLine();
        
        Scanner entradaNombreAutor = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreAutor = entradaNombreAutor.nextLine();
        
        Scanner entrada = new Scanner(System.in);
        
        Repositorio repo = new Repositorio(nombreRepositorio, nombreAutor);

        int opcionMenu = 10;

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
                    repo.gitAdd();
                    break;
                case 2:
                    repo.gitCommit();
                    break;
                case 3:
                    repo.gitPull();
                    break;
                case 4:
                    repo.gitPull();
                    break;
                case 5:
                    repo.gitStatus();
                    break;
                case 6:
                    repo.crearArchivoNuevo();
                    break;
                case 7:
                    System.out.println("Programa Terminado");
                    break;
            }
        }
    }
}
