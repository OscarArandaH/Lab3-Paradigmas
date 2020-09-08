package codigo;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class LocalRepository {

    /**
     * se define el arreglo que contendra los commits almacenados en el local.
     */
    private ArrayList<Commit> listaCommitsLocal;

    public LocalRepository() {

        this.listaCommitsLocal = new ArrayList<>();
    }

    /**
     * @return obtiene la lista con los commits del local repository.
     */
    public ArrayList<Commit> getListaCommitsLocal() {
        return listaCommitsLocal;
    }

    /**
     * Modifica la lista con los commits del local repository.
     * @param listaCommitsLocal lista que contiene los commits del local repository
     */
    public void setListaCommitsLocal(ArrayList<Commit> listaCommitsLocal) {
        this.listaCommitsLocal = listaCommitsLocal;
    }

    /**
     * Funcion que imprime el local repository por pantalla.
     */
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
    
    
    
    /**
     * Funcion que agrega  un commit al repositorio local
     * @param cambiosIndex la lista que contiene los commits del index.
     */
    public void agregarCommitsLocal(Commit cambiosIndex) {
        
        listaCommitsLocal.add(cambiosIndex);
    }
}
