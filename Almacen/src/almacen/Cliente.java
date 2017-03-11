/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author david
 */
public class Cliente {
      private int id;
    private String nombre;
    private String direccion;
    private int numArticulosComprados;
    
public Cliente(int i){
    this.nombre=generarNombre();
    this.id=generarId(i);
    this.direccion=generarDireccion();
    this.numArticulosComprados=0;
}

   

    public String generarNombre(){
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
    public String generarDireccion(){
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
    public int generarId(int i){
        this.id=i+1;
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void setDireccion(){
        this.direccion=direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }

}
