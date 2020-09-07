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
public class Index {

    /**
     * se define el arreglo que contendra los cambios almacenados en el index.
     */
    private ArrayList<ArchivoTextoPlano> listaCambiosIndex;

    public Index() {

        this.listaCambiosIndex = new ArrayList<>();
    }

    /**
     * @return  la lista con los cambios del index.
     */
    public ArrayList<ArchivoTextoPlano> getListaCambiosIndex() {
        return listaCambiosIndex;
    }

    /**
     * Modifica la lista con los cambios del index.
     * @param listaCambiosIndex lista con los cambios del index.
     */
    public void setListaCambiosIndex(ArrayList<ArchivoTextoPlano> listaCambiosIndex) {
        this.listaCambiosIndex = listaCambiosIndex;
    }

    /**
     * Funcion que imprime el index por pantalla.
     */
    public void imprimirIndex() {

        String nombresCambios = "";

        for (int i = 0; i < listaCambiosIndex.size(); i++) {

            nombresCambios = nombresCambios + listaCambiosIndex.get(i).getNombreArchivo();
            nombresCambios = nombresCambios + "//";

        }
        System.out.println("Cambios del Index: ");
        System.out.println(nombresCambios);

    }

    /**
     * Funcion que agrega un archivo nuevo al workspace.
     * @param cambiosIndex la lista que contiene los archivos a los cuales se le hicieron cambios.
     * @param workspace la zona de trabajo workspace.
     */
    public void agregarCambiosIndex(ArrayList<ArchivoTextoPlano> cambiosIndex, Workspace workspace) {

        Integer i = 0, j, largo1 = cambiosIndex.size(), largo2 = listaCambiosIndex.size();
        ArchivoTextoPlano cambioIndexAux1, cambioIndexAux2;
        String nombreCambio, nombreCambioAux;

        if (largo1 == 0) {

            cambiosIndex = workspace.getListaArchivosWorkspace();
            largo1 = cambiosIndex.size();
        }
        ArrayList<ArchivoTextoPlano> archivosWorkspace = workspace.getListaArchivosWorkspace();

        while (i < largo1) {
            j = 0;
            cambioIndexAux2 = cambiosIndex.get(i);
            if (archivosWorkspace.contains(cambioIndexAux2)) {

                while (j < largo2) {

                    cambioIndexAux1 = listaCambiosIndex.get(i);
                    nombreCambio = cambioIndexAux2.getNombreArchivo();
                    nombreCambioAux = cambioIndexAux1.getNombreArchivo();
                    if (nombreCambio.equals(nombreCambioAux)) {

                        j = largo2 + 1;
                        listaCambiosIndex.remove(cambioIndexAux1);
                        listaCambiosIndex.add(cambioIndexAux2);
                        break;
                    }
                    j++;
                }
                if (j.intValue() == largo2.intValue()) {
                    listaCambiosIndex.add(cambioIndexAux2);

                }
            }
            i++;
        }
    }

}
