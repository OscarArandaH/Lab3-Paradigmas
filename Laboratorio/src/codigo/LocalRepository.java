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
public class LocalRepository {

    private ArrayList<Commit> listaCommitsLocal;

    public LocalRepository() {

        this.listaCommitsLocal = new ArrayList<>();
    }

    public ArrayList<Commit> getListaCommitsLocal() {
        return listaCommitsLocal;
    }

    public void setListaCommitsLocal(ArrayList<Commit> listaCommitsLocal) {
        this.listaCommitsLocal = listaCommitsLocal;
    }

    public void imprimirLocal() {

        Commit commitAuxiliar;
        ArrayList<ArchivoTextoPlano> listaArchivosCommit;
        String nombresCommits = "";
        System.out.println("Commits Almacenados en el Local Repository: ");

        for (int i = 0; i < listaCommitsLocal.size(); i++) {
            commitAuxiliar = listaCommitsLocal.get(i);
            System.out.println("Mensaje Descriptivo del Commit: " + commitAuxiliar.getMensajeDescriptivo());
            listaArchivosCommit = commitAuxiliar.getCambiosArchivos();

            for (int j = 0; j < listaCommitsLocal.size(); j++) {

                nombresCommits = nombresCommits + listaCommitsLocal.get(i).getMensajeDescriptivo();
                nombresCommits = nombresCommits + "//";
            }
            System.out.println("Archivos del Commit: " + nombresCommits);
        }
    }
}
