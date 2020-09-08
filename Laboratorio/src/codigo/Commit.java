package codigo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Commit {

    /**
     * se establecen los parametros que tendra el commit.
     */
    private String autorCommit, marcaTiempo, mensajeDescriptivo;
    private ArrayList<ArchivoTextoPlano> cambiosArchivos;

    /**
     * Se crea el commit con los paremtros ingresados
     * @param autorCommit el nombre del usuario.
     * @param cambiosArchivos los cambios que contendra el commit.
     */
    public Commit(String autorCommit, ArrayList<ArchivoTextoPlano> cambiosArchivos) {

        /**
         * Se solicita el mensaje descriptivo que tendra el commit.
         */
        Scanner entradaMensajeDescriptivo = new Scanner(System.in);
        System.out.print("Ingrese el mensaje descriptivo del commit: ");
        String mensajeDescriptivoAux = entradaMensajeDescriptivo.nextLine();

        Date fechaMod = new Date();
        System.out.println(fechaMod.toString());
        String fechaCommit = fechaMod.toString();

        this.autorCommit = autorCommit;
        this.marcaTiempo = fechaCommit;
        this.mensajeDescriptivo = mensajeDescriptivoAux;
        this.cambiosArchivos = cambiosArchivos;

    }

    /**
     * @return el nombre del autor del commit.
     */
    public String getAutorCommit() {
        return autorCommit;
    }

    /**
     * Modifica el nombre del autor del commit.
     * @param autorCommit el nombre del autor del commit.
     */
    public void setAutorCommit(String autorCommit) {
        this.autorCommit = autorCommit;
    }

    /**
     * @return La marca de tiempo del commit.
     */
    public String getMarcaTiempo() {
        return marcaTiempo;
    }

    /**
     * Modifica la marca de tiempo del commit
     * @param marcaTiempo
     */
    public void setMarcaTiempo(String marcaTiempo) {
        this.marcaTiempo = marcaTiempo;
    }

    /**
     * @return el mensaje descriptivo del commit.
     */
    public String getMensajeDescriptivo() {
        return mensajeDescriptivo;
    }

    /**
     * Modifica el mensaje descriptivo del commit
     * @param mensajeDescriptivo el mensaje descriptivo del commit
     */
    public void setMensajeDescriptivo(String mensajeDescriptivo) {
        this.mensajeDescriptivo = mensajeDescriptivo;
    }

    /**
     * @return los cambios que contiene el commit.
     */
    public ArrayList<ArchivoTextoPlano> getCambiosArchivos() {
        return cambiosArchivos;
    }

    /**
     * Modifica el mensaje descriptivo del commit
     * @param mensajeDescriptivo el mensaje descriptivo del commit
     */
    public void setCambiosArchivos(ArrayList<ArchivoTextoPlano> cambiosArchivos) {
        this.cambiosArchivos = cambiosArchivos;
    }

}
