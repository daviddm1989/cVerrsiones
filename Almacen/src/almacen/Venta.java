/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author Jesus
 */
public class Venta {
    private int cantidad;
    private int idCliente;
    private float codProducto;
    
    public Venta(int i){
        this.cantidad=cantidad;
        this.idCliente=idCliente;
        this.codProducto=codProducto;
    }

    /*Métodos de consulta y modificación de atributos*/
    /**
     * Modifica la cantidad de ventas
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Devuelve la cantidad de ventas
     * @return cantidad de ventas
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * modifica el identificador del cliente
     * @param idCliente identificador del cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    /**
     * Devuelve el identificador del cliente
     * @return 
     */
    public int getIdCliente() {
        return idCliente;
    }
    /**
     * Modifica el codigo del producto
     * @param codProducto 
     */
    public void setCodProducto(float codProducto) {
        this.codProducto = codProducto;
    }
    /**
     * Deviuelve el codigo del producto
     * @return codigo del producto
     */
    public float getCodProducto() {
        return codProducto;
    }
    
    
}
