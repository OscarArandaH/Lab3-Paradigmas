/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Oscar
 */
public class Repositorio {

    private String nombreRepositorio, autorRepositorio, ramaRepositorio;
    private Workspace workspaceRepositorio;
    private Index indexRepositorio;
    private LocalRepository localRepositorio;
    private RemoteRepository remoteRepositorio;

    public Repositorio(String nombreRepositorio, String nombreAutor) {

        this.nombreRepositorio = nombreRepositorio;
        this.autorRepositorio = nombreAutor;
        this.ramaRepositorio = "Rama Master";

        this.workspaceRepositorio = new Workspace();
        this.indexRepositorio = new Index();
        this.localRepositorio = new LocalRepository();
        this.remoteRepositorio = new RemoteRepository();
    }

    public String getNombreRepositorio() {
        return nombreRepositorio;
    }

    public void setNombreRepositorio(String nombreRepositorio) {
        this.nombreRepositorio = nombreRepositorio;
    }

    public String getAutorRepositorio() {
        return autorRepositorio;
    }

    public void setAutorRepositorio(String autorRepositorio) {
        this.autorRepositorio = autorRepositorio;
    }

    public String getRamaRepositorio() {
        return ramaRepositorio;
    }

    public void setRamaRepositorio(String ramaRepositorio) {
        this.ramaRepositorio = ramaRepositorio;
    }

    public Workspace getWorkspaceRepositorio() {
        return workspaceRepositorio;
    }

    public void setWorkspaceRepositorio(Workspace workspaceRepositorio) {
        this.workspaceRepositorio = workspaceRepositorio;
    }

    public Index getIndexRepositorio() {
        return indexRepositorio;
    }

    public void setIndexRepositorio(Index indexRepositorio) {
        this.indexRepositorio = indexRepositorio;
    }

    public LocalRepository getLocalRepositorio() {
        return localRepositorio;
    }

    public void setLocalRepositorio(LocalRepository localRepositorio) {
        this.localRepositorio = localRepositorio;
    }

    public RemoteRepository getRemoteRepositorio() {
        return remoteRepositorio;
    }

    public void setRemoteRepositorio(RemoteRepository remoteRepositorio) {
        this.remoteRepositorio = remoteRepositorio;
    }

    public void imprimirRepositorio() {

        workspaceRepositorio.imprimirWorkspace();
        indexRepositorio.imprimirIndex();
        localRepositorio.imprimirLocal();
        remoteRepositorio.imprimirRemote();
    }
    
    public void crearArchivoNuevo(){
        
        ArchivoTextoPlano archivoNuevo = new ArchivoTextoPlano();
        workspaceRepositorio.agregarArchivosWorkspace(archivoNuevo);
    }
    
    

}
