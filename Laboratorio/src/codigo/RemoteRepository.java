package codigo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class RemoteRepository {
    
    /**
     * se define el arreglo que contendra los commits almacenados en el remote.
     */
    private ArrayList<Commit> listaCommitsRemote;

    public RemoteRepository() {

        this.listaCommitsRemote = new ArrayList<>();
    }

    /**
     * @return obtiene la lista con los commits del remote repository.
     */
    public ArrayList<Commit> getListaCommitsRemote() {
        return listaCommitsRemote;
    }

    /**
     * Modifica la lista con los commits del local repository. 
     * @param listaCommitsRemote lista que contiene los commits del remote repository
     */
    public void setListaCommitsRemote(ArrayList<Commit> listaCommitsRemote) {
        this.listaCommitsRemote = listaCommitsRemote;
    }

    /**
     * Funcion que imprime el remote repository por pantalla.
     */
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
