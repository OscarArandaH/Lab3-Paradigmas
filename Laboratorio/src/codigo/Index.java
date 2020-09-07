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

    private ArrayList<ArchivoTextoPlano> listaCambiosIndex;

    public Index() {

        this.listaCambiosIndex = new ArrayList<>();
    }

    public ArrayList<ArchivoTextoPlano> getListaCambiosIndex() {
        return listaCambiosIndex;
    }

    public void setListaCambiosIndex(ArrayList<ArchivoTextoPlano> listaCambiosIndex) {
        this.listaCambiosIndex = listaCambiosIndex;
    }

    public void imprimirIndex() {

        String nombresCambios = "";

        for (int i = 0; i < listaCambiosIndex.size(); i++) {

            nombresCambios = nombresCambios + listaCambiosIndex.get(i).getNombreArchivo();
            nombresCambios = nombresCambios + "//";

        }
        System.out.println("Cambios del Index: ");
        System.out.println(nombresCambios);

    }

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
                
                while(j < largo2 ){
                    
                    cambioIndexAux1 = listaCambiosIndex.get(i);
                    
                    
                    
                }
                
            }
            nombreArchivo = cambiosIndex.getNombreArchivo();
            nombreArchivoAux = archivoWorkspaceAux.getNombreArchivo();

            if (nombreArchivo.equals(nombreArchivoAux)) {

                i = largo + 1;
                listaCambiosIndex.remove(archivoWorkspaceAux);
                listaCambiosIndex.add(cambiosIndex);
                break;
            }
            i++;
        }
        if (i.intValue() == largo.intValue()) {

            listaCambiosIndex.add(cambiosIndex);

        }
    }

}
