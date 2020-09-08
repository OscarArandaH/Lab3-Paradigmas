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

}
