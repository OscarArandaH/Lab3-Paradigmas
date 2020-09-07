/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Commit {

    private String autorCommit, marcaTiempo, mensajeDescriptivo;
    private ArrayList<ArchivoTextoPlano> cambiosArchivos;

    public Commit(String autorCommit, ArrayList<ArchivoTextoPlano> cambiosArchivos) {

        Scanner entradaMensajeDescriptivo = new Scanner(System.in);
        System.out.println("Ingrese el mensaje descriptivo del commit: ");
        String mensajeDescriptivoAux = entradaMensajeDescriptivo.nextLine();

        Date fechaMod = new Date();
        System.out.println(fechaMod.toString());
        String fechaCommit = fechaMod.toString();

        this.autorCommit = autorCommit;
        this.marcaTiempo = fechaCommit;
        this.mensajeDescriptivo = mensajeDescriptivoAux;
        this.cambiosArchivos = cambiosArchivos;

    }

    public String getAutorCommit() {
        return autorCommit;
    }

    public void setAutorCommit(String autorCommit) {
        this.autorCommit = autorCommit;
    }

    public String getMarcaTiempo() {
        return marcaTiempo;
    }

    public void setMarcaTiempo(String marcaTiempo) {
        this.marcaTiempo = marcaTiempo;
    }

    public String getMensajeDescriptivo() {
        return mensajeDescriptivo;
    }

    public void setMensajeDescriptivo(String mensajeDescriptivo) {
        this.mensajeDescriptivo = mensajeDescriptivo;
    }

    public ArrayList<ArchivoTextoPlano> getCambiosArchivos() {
        return cambiosArchivos;
    }

    public void setCambiosArchivos(ArrayList<ArchivoTextoPlano> cambiosArchivos) {
        this.cambiosArchivos = cambiosArchivos;
    }

}
