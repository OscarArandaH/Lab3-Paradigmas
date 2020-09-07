/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Workspace {

    private ArrayList<ArchivoTextoPlano> listaArchivosWorkspace;

    public Workspace() {

        this.listaArchivosWorkspace = new ArrayList<>();
    }

    public ArrayList<ArchivoTextoPlano> getListaArchivosWorkspace() {
        return listaArchivosWorkspace;
    }

    public void setListaArchivosWorkspace(ArrayList<ArchivoTextoPlano> listaArchivosWorkspace) {
        this.listaArchivosWorkspace = listaArchivosWorkspace;
    }

    public void imprimirWorkspace() {

        String nombresArchivos = "";

        for (int i = 0; i < listaArchivosWorkspace.size(); i++) {

            nombresArchivos = nombresArchivos + listaArchivosWorkspace.get(i).getNombreArchivo();
            nombresArchivos = nombresArchivos + "//";

        }
        System.out.println("Archivos del Workspace: ");
        System.out.println(nombresArchivos);

    }

    public void agregarArchivosWorkspace(ArchivoTextoPlano archivoWorkspace) {

        Integer i = 0, largo = listaArchivosWorkspace.size();
        ArchivoTextoPlano archivoWorkspaceAux;
        String nombreArchivo, nombreArchivoAux;

        while (i < largo) {

            archivoWorkspaceAux = listaArchivosWorkspace.get(i);
            nombreArchivo = archivoWorkspace.getNombreArchivo();
            nombreArchivoAux = archivoWorkspaceAux.getNombreArchivo();

            if (nombreArchivo.equals(nombreArchivoAux)) {

                i = largo + 1;
                listaArchivosWorkspace.remove(archivoWorkspaceAux);
                listaArchivosWorkspace.add(archivoWorkspace);
                break;
            }
            i++;
        }
        if (i.intValue() == largo.intValue()) {

            listaArchivosWorkspace.add(archivoWorkspace);

        }
    }

}
