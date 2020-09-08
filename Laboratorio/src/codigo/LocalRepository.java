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
     * Funcion que agrega  un commit al repositorio local
     * @param cambiosIndex la lista que contiene los commits del index.
     */
    public void agregarCommitsLocal(Commit cambiosIndex) {
        
        listaCommitsLocal.add(cambiosIndex);
    }
}
