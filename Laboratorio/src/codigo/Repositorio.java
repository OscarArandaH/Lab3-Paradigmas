/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Repositorio {

    /**
     * se establecen los parametros que tendra el commit.
     */
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

    /**
     * @return el nombre del repositorio.
     */
    public String getNombreRepositorio() {
        return nombreRepositorio;
    }

    /**
     * Modifica elnombre del repositorio.
     * @param nombreRepositorio 
     */
    public void setNombreRepositorio(String nombreRepositorio) {
        this.nombreRepositorio = nombreRepositorio;
    }

    /**
     * @return el nombre del autor del repositorio.
     */
    public String getAutorRepositorio() {
        return autorRepositorio;
    }

    /**
     * Modifica el nombre del autor del repositorio.
     * @param autorRepositorio 
     */
    public void setAutorRepositorio(String autorRepositorio) {
        this.autorRepositorio = autorRepositorio;
    }

    /**
     * @return la rama del repositorio.
     */
    public String getRamaRepositorio() {
        return ramaRepositorio;
    }

    /**
     * Modifica el la rama del repositorio.
     * @param ramaRepositorio 
     */
    public void setRamaRepositorio(String ramaRepositorio) {
        this.ramaRepositorio = ramaRepositorio;
    }

    /**
     * @return el workspace del repositorio.
     */
    public Workspace getWorkspaceRepositorio() {
        return workspaceRepositorio;
    }

    /**
     * Modifica el workspace del repositorio.
     * @param workspaceRepositorio 
     */
    public void setWorkspaceRepositorio(Workspace workspaceRepositorio) {
        this.workspaceRepositorio = workspaceRepositorio;
    }

    /**
     * @return el index del repositorio.
     */
    public Index getIndexRepositorio() {
        return indexRepositorio;
    }

    /**
     * Modifica el index del repositorio.
     * @param indexRepositorio 
     */
    public void setIndexRepositorio(Index indexRepositorio) {
        this.indexRepositorio = indexRepositorio;
    }

    /**
     * @return el local del repositorio.
     */
    public LocalRepository getLocalRepositorio() {
        return localRepositorio;
    }

    /**
     * Modifica el local del repositorio.
     * @param localRepositorio 
     */
    public void setLocalRepositorio(LocalRepository localRepositorio) {
        this.localRepositorio = localRepositorio;
    }

    /**
     * @return el remote del repositorio.
     */
    public RemoteRepository getRemoteRepositorio() {
        return remoteRepositorio;
    }

    /**
     * Modifica el remote del repositorio.
     * @param remoteRepositorio 
     */
    public void setRemoteRepositorio(RemoteRepository remoteRepositorio) {
        this.remoteRepositorio = remoteRepositorio;
    }

    /**
     * funcion que crea un nuevo archivo en el workspace.
     */
    public void crearArchivoNuevo() {

        ArchivoTextoPlano archivoNuevo = new ArchivoTextoPlano();
        workspaceRepositorio.agregarArchivosWorkspace(archivoNuevo);
    }

    /**
     * Metodo que guarda los cambios del workspace en el index.
     */
    public void gitAdd() {

        if (workspaceRepositorio.getListaArchivosWorkspace().isEmpty()) {
            System.out.println("El Workspace esta vacio.");
        } else {
            System.out.println("Cuantos archivos sufireron cambios?");
            System.out.println("1. Todos los Archivos.");
            System.out.println("2. Seleccionar archivos especificos.");

            Scanner opcionArchivosAdd = new Scanner(System.in);

            System.out.println("Ingrese su opcion: ");

            ArrayList<ArchivoTextoPlano> archivosWorkspaceAdd = new ArrayList<>();

            int opcionArchivosAdd1 = opcionArchivosAdd.nextInt();

            switch (opcionArchivosAdd1) {
                case 1:
                    break;
                case 2:
                    int i = 0,
                     j;
                    Scanner opcionAddCantidadArchivos = new Scanner(System.in);

                    System.out.println("Cuantos archivos sufrieron cambios?: ");
                    int cantidadArchivos = opcionAddCantidadArchivos.nextInt();

                    String nombreArchivo,
                     nombreArchivoAux;

                    ArrayList<ArchivoTextoPlano> archivosWorkspaceAddAux = workspaceRepositorio.getListaArchivosWorkspace();
                    if (archivosWorkspaceAddAux.size() < cantidadArchivos) {

                        System.out.println("No hay esa cantidad de archivos en el Workspace, hay: " + cantidadArchivos + "Archivos");
                        break;
                    }

                    while (i < cantidadArchivos) {

                        System.out.println("Ingrese el nombre del archivo: ");
                        Scanner nombreArchivoAdd = new Scanner(System.in);
                        nombreArchivo = nombreArchivoAdd.nextLine();
                        j = 0;
                        while (j < archivosWorkspaceAddAux.size()) {

                            nombreArchivoAux = archivosWorkspaceAddAux.get(j).getNombreArchivo();
                            if (nombreArchivo.equals(nombreArchivoAux)) {

                                archivosWorkspaceAdd.add(archivosWorkspaceAddAux.get(j));

                            }
                            j++;
                        }
                        i++;
                    }
                    break;
                default:
                    System.out.println("Opcion no disponible.");
                    break;
            }
            indexRepositorio.agregarCambiosIndex(archivosWorkspaceAdd, workspaceRepositorio);
        }
    }

    /**
     * metodo que crea un commit con los cambios almacenados en el index.
     */
    public void gitCommit() {

        if (indexRepositorio.getListaCambiosIndex().isEmpty()) {

            System.out.println("El Index esta vacio.");
        } else {
            Commit commit = new Commit(autorRepositorio, indexRepositorio.getListaCambiosIndex());
            localRepositorio.agregarCommitsLocal(commit);
            indexRepositorio.getListaCambiosIndex().clear();

        }
    }

    /**
     * Metodo que mueve los commits del repositorio local al repositorio remoto.
     */
    public void gitPush() {

        if (localRepositorio.getListaCommitsLocal().isEmpty()) {

            System.out.println("El Repositorio Local esta vacio.");
        } else {
            remoteRepositorio.setListaCommitsRemote(localRepositorio.getListaCommitsLocal());
        }
    }

    /**
     * Metodo que trae los archivos desde el repositorio remoto al workspace.
     */
    public void gitPull() {

        if (remoteRepositorio.getListaCommitsRemote().isEmpty()) {

            System.out.println("El Repositorio Remoto esta vacio.");
        } else {

            Integer i = 0, j, largoAux;
            ArrayList<Commit> commitsRemoteRepository = remoteRepositorio.getListaCommitsRemote();
            ArrayList<ArchivoTextoPlano> listaArchivosCommit;
            ArchivoTextoPlano archivoCommitAux;
            Integer cantidadCommits = commitsRemoteRepository.size();
            Commit commit;

            while (i < cantidadCommits) {

                commit = commitsRemoteRepository.get(i);
                listaArchivosCommit = commit.getCambiosArchivos();
                largoAux = listaArchivosCommit.size();
                j = 0;
                while (j < largoAux) {

                    archivoCommitAux = listaArchivosCommit.get(j);
                    workspaceRepositorio.agregarArchivosWorkspace(archivoCommitAux);
                    j++;
                }
                i++;
            }

        }
    }
    
    /**
     * Metodo que muestra informacion del repositorio.
     */
    public void gitStatus(){
        
        Integer largoWorkspace = workspaceRepositorio.getListaArchivosWorkspace().size();
        Integer largoIndex = indexRepositorio.getListaCambiosIndex().size();
        Integer largoLocal = localRepositorio.getListaCommitsLocal().size();
        
        
        System.out.println("Estado Actual del Repositorio:");
        System.out.println("Nombre del Repositorio: " + nombreRepositorio );
        System.out.println("Autor del Repositorio: " + autorRepositorio);
        System.out.println("");
        System.out.println("Numero de archivos en el Workspace: " + largoWorkspace);
        System.out.println("Numero de cambios en el Index: " + largoIndex);
        System.out.println("Numero de commits en el Local Repository: " + largoLocal);
        
        if (localRepositorio.getListaCommitsLocal().equals(remoteRepositorio.getListaCommitsRemote())) {
            
            System.out.println("El Remote Repository esta al dia.");
        }else{
            System.out.println("El Remote Repository esta atrasado");
        }
    }

}
