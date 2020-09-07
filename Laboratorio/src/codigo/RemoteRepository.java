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
public class RemoteRepository {
    
    private ArrayList<Commit> listaCommitsRemote;

    public RemoteRepository() {

        this.listaCommitsRemote = new ArrayList<>();
    }

    public ArrayList<Commit> getListaCommitsRemote() {
        return listaCommitsRemote;
    }

    public void setListaCommitsRemote(ArrayList<Commit> listaCommitsRemote) {
        this.listaCommitsRemote = listaCommitsRemote;
    }

    public void imprimirRemote() {

        Commit commitAuxiliar;
        ArrayList<ArchivoTextoPlano> listaArchivosCommit;
        String nombresCommits = "";
        System.out.println("Commits Almacenados en el Remote Repository: ");

        for (int i = 0; i < listaCommitsRemote.size(); i++) {
            commitAuxiliar = listaCommitsRemote.get(i);
            System.out.println("Mensaje Descriptivo del Commit: " + commitAuxiliar.getMensajeDescriptivo());
            listaArchivosCommit = commitAuxiliar.getCambiosArchivos();

            for (int j = 0; j < listaCommitsRemote.size(); j++) {

                nombresCommits = nombresCommits + listaCommitsRemote.get(i).getMensajeDescriptivo();
                nombresCommits = nombresCommits + "//";
            }
            System.out.println("Archivos del Commit: " + nombresCommits);
        }
    }
    
    
}
