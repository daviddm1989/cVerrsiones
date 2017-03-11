/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *	Clase cliente que almacenara toda la informacion relacionada con el cliente
 * @author david
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private int numArticulosComprados;
    
    /**
     * Constructor de la clase cliente
     * @param i, para generar la ID de forma ascendete @see Almacen donde crear cliente
     */
public Cliente(int i){
    this.nombre=generarNombre();
    this.id=generarId(i);
    this.direccion=generarDireccion();
    this.numArticulosComprados=0;
}

   
	/**
	 * Metodo que se encarga de generar un nombre aleatorio dependiendo de i (numero aleatorio)
	 * @return el nombre obtenido para asignarlo a su cliente
	 */
    private String generarNombre(){
        int i=(int) (Math.random()*5+1);
        switch(i){
            case 1:nombre="Maria";
            break;
            case 2:nombre="David";
            break;
            case 3:nombre="Zacarias";
            break;
            case 4:nombre="Pepe";
            break;
            case 5:nombre="Josefa";
            break;
            case 6:nombre="Jaime";
            break;
            case 7:nombre="Ana";
            break;
        }
        return nombre;
    }
    
    /**
     * Metodo que se encarga de generar una direccion aleatorio dependiendo de i (numero aleatorio)
	 * @return la direccion obtenido para asignarlo a su cliente
     */
    private String generarDireccion(){
        int i=(int) (Math.random()*5+1);
        switch(i){
            case 1:nombre="C/San Gregorio Nº 98";
            break;
            case 2:nombre="Av 1º de Mayo Nº 45";
            break;
            case 3:nombre="C/Toledo Nº 8";
            break;
            case 4:nombre="Plaza Paco Nº3";
            break;
            case 5:nombre="C/Cooperación Nº 1";
            break;
            case 6:nombre="C/Aduana Nº 13";
            break;
            case 7:nombre="C/Amargura Nº 57";
            break;
        }
        return nombre;
    }
    
    /**
     * Metodo que genera la id del cliente de forma ascendete
     * @param i, @see Almacen como crear cliente
     * @return la id correspondiente al cliente
     */
    private int generarId(int i){
        this.id=i+1;
        return id;
    }
    
    /**
     * Metodo de modificacion de la id del cliente
     * @param id del cliente actual
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo de modificacion del nombre del cliente
     * @param nombre del cliente actual
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo de modificacion de la direccion actual del cliente
     * @param direccion del cliente actual
     */
     public void setDireccion(String direccion){
        this.direccion=direccion;
    }

     /**
      * Metodo de consulta del atributo id del cliente
      * @return la id perteneciente al cliente
      */
    public int getId() {
        return id;
    }

    /**
     * Metodo de consulta del atributo nombre del cliente
     * @return el nombre que pertenece al cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo de consulta del atributo direccion del cliente
     * @return la direccion que posee el cliente
     */
    public String getDireccion() {
        return direccion;
    }

}
