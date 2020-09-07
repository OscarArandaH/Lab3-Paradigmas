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
public class ArchivoTextoPlano {

    private String nombreArchivo, fechaModificacion, contenidoArchivo;

    public ArchivoTextoPlano() {
        
        Scanner entradaNombreArchivo = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo: ");
        String nombreArchivoAux = entradaNombreArchivo.nextLine();
        
        Scanner entradaContenidoArchivo = new Scanner(System.in);
        System.out.println("Ingrese el contenido del archivo: ");
        String contenidoArchivoAux = entradaContenidoArchivo.nextLine();
        
        Date fechaMod = new Date();
        System.out.println(fechaMod.toString());
        
        

    }

}
