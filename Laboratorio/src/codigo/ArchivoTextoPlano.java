package codigo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class ArchivoTextoPlano {

    /**
     * Se inician las variables en las cuales se guardaran informacion del archivo.
     */
    private String nombreArchivo, fechaModificacion, contenidoArchivo;

    public ArchivoTextoPlano() {

        /**
         * Se solicita el nombre del archivo, y el contenido del archivo, aparte, se obtiene la fecha de creacion del archivo.
         */
        Scanner entradaNombreArchivo = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivoAux = entradaNombreArchivo.nextLine();

        Scanner entradaContenidoArchivo = new Scanner(System.in);
        System.out.println("Ingrese el contenido del archivo: ");
        String contenidoArchivoAux = entradaContenidoArchivo.nextLine();

        Date fechaMod = new Date();
        String fechaArchivo = fechaMod.toString();

        this.nombreArchivo = nombreArchivoAux;
        this.contenidoArchivo = contenidoArchivoAux;
        this.fechaModificacion = fechaArchivo;

    }

    /**
     * @return Obtiene el nombre del archivo.
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Modifica el nombre del archivo.
     *
     * @param nombreArchivo el nombre del archivo a cambiar.
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * @return la fecha de modificacion del archivo.
     */
    public String getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Modifica la fecha de modificacion del archivo.
     *
     * @param fechaModificacion la fecha de modificacion del archivo.
     */
    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return el contenido del archivo.
     */
    public String getContenidoArchivo() {
        return contenidoArchivo;
    }

    /**
     * Modifica el contenido del archivo
     *
     * @param contenidoArchivo el contenido del archivo.
     */
    public void setContenidoArchivo(String contenidoArchivo) {
        this.contenidoArchivo = contenidoArchivo;
    }

}
