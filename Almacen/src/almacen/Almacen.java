/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public final class Almacen {
    Scanner x=new Scanner(System.in);
    private Producto lista[];
    private Cliente listaClientes[];
    private Venta ventas[];
    
    /**
     * Constructor de Almacen
     */
    
    public Almacen(){
    this.lista=cargarAlmacen();
    this.listaClientes=cargarListaClientes();
    this.ventas=iniciarVentas();
    }
    
    /**
     * Metodo para cargar el Almacen de productos
     * @return el vector Almacen cargado de productos
     */ 
    public Producto[] cargarAlmacen(){
        int tam=100;
        Producto lista[]=new Producto[tam];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=new Producto(i);
        }
         return lista;
    }
    /**
     * Este método orderna por nombre la lista de productos del almacen
     */
     public void ordenarAlmacenPorNombres(){
         for (int i = 0; i < lista.length; i++) {
             for (int j =lista.length-1; j>i; j--) {
                 if(lista[j].getNombre().compareTo(lista[j-1].getNombre())<0){
                     Producto aux=lista[j];
                     lista[j]=lista[j-1];
                     lista[j-1]=aux;  
                 } 
             }
         }
     }
     /**
      * Este método ordena por código la lista de productos del almacen
      */
     public void ordenarAlmacenPorCodigo(){
         for (int i = 0; i < lista.length; i++) {
             for (int j =lista.length-1; j>i; j--) {
                 if(lista[j].getCodigo()<(lista[j-1].getCodigo())){
                     Producto aux=lista[j];
                     lista[j]=lista[j-1];
                     lista[j-1]=aux;  
                 } 
             }
         }
     }
     /**
      * Metodo que ordena los productos por mas vendidos
      */
      public void ordenarPorMasVendidos(){
         for (int i = 0; i < lista.length; i++) {
             for (int j =lista.length-1; j>i; j--) {
                 if(lista[j].getNumVentas()>(lista[j-1].getNumVentas())){
                     Producto aux=lista[j];
                     lista[j]=lista[j-1];
                     lista[j-1]=aux;  
                 } 
             }
         }
     }
      /**
       * Metodo que ordena los productos por menos vendidos
       */
      public void ordenarPorMenossVendidos(){
         for (int i = 0; i < lista.length; i++) {
             for (int j =lista.length-1; j>i; j--) {
                 if(lista[j].getNumVentas()<(lista[j-1].getNumVentas())){
                     Producto aux=lista[j];
                     lista[j]=lista[j-1];
                     lista[j-1]=aux;  
                 } 
             }
         }
     }
     /**
      * Este método  busca productos por su nombre dentro de la lista
      */
     public void buscarPorNombre(){
        System.out.println("Introduce el nombre del producto que buscas");
        String nom=x.next();
        for (int i=0; i<lista.length; i++)
        if (lista[i].getNombre().equals(nom)){
         System.out.println("Codigo: "+lista[i].getCodigo()+" | Nombre: "+lista[i].getNombre()+" | Precio: "+lista[i].getPrecio()+" | Cantidad inicial: "+lista[i].getCantInicial()+" | Nº Ventas: "+lista[i].getNumVentas());
        }

     }
     /**
      * Metodo que busca un producto por su identificador
      */
    public void buscarProductoPorId(){
        System.out.println("Introduce el codigo del producto que buscas");
        float cod=x.nextFloat();
        for (int i=0; i<lista.length; i++){
            if (lista[i].getCodigo()==cod){
             System.out.println("Codigo: "+lista[i].getCodigo()+" | Nombre: "+lista[i].getNombre()+" | Precio: "+lista[i].getPrecio()+" | Cantidad inicial: "+lista[i].getCantInicial()+" | Nº Ventas: "+lista[i].getNumVentas());
            }
        }
    }
     /**
      * Metodo set que modifica la lista
      * @param lista 
      */
     public void setLista(Producto[] lista) {
        this.lista = lista;
    }
  /**
   * Metodo get que nos devuelve la lista
   * @return  lista
   */
     public Producto[] getLista(){
         return lista;
     }
    
     /**
      * Metodo desde el que puedo añadir un producto a lista
      */
     
     public void anadirProducto(){
              
               Producto auxiliar[]=new Producto[lista.length+1];
              for (int i = 0; i < lista.length; i++) {
                auxiliar[i]=new Producto(i);
                auxiliar[i]=lista[i]; 
              }
             auxiliar[auxiliar.length-1]=new Producto(auxiliar.length-1);
             auxiliar[auxiliar.length-1].getCodigo();
             System.out.println("Introduce el nombre del producto");
             auxiliar[auxiliar.length-1].setNombre(x.next());
             System.out.println("Introduce el Precio del producto");
             auxiliar[auxiliar.length-1].setPrecio(x.nextFloat());
             System.out.println("Introduce la cantidad inicial del producto");
             auxiliar[auxiliar.length-1].setCantInicial(x.nextInt());
             lista=auxiliar;
         }
        /**
         * Metodo para mostrar los productos qe hay en el almacen
         */
        public void mostrarAlmacen(){
            for (int i = 0; i < lista.length; i++) {
                if(lista[i]!=null){
                    System.out.println("Codigo: "+lista[i].getCodigo()+" | Nombre: "+lista[i].getNombre()+" | Precio: "+lista[i].getPrecio()+" | Cantidad inicial: "+lista[i].getCantInicial()+" | Nº Ventas: "+lista[i].getNumVentas());
                }
            }    
        }
        /**
         * Metodo que muestra la facturacion por tres productos
         */
         public void mostrarTresProductosAlmacen(){
            float total=0;
            for (int i = 0; i < 3; i++) {
                if(lista[i]!=null){
                  
                    total=total+(lista[i].getPrecio()*lista[i].getNumVentas());
                    System.out.println("Codigo: "+lista[i].getCodigo()+" | Nombre: "+lista[i].getNombre()+" | Precio: "+lista[i].getPrecio()+" | Cantidad inicial: "+lista[i].getCantInicial()+" | Nº Ventas: "+lista[i].getNumVentas());
                }
            }
            System.out.println("El total de ganancias por estos productos es: "+total+"\n");
             
        }
        /**
         * Metodo para cargar la lista de lientes
         * @return listaClientes
         */
         public Cliente[] cargarListaClientes(){
             Cliente []listaClientes=new Cliente[15];
             for (int i = 0; i < listaClientes.length; i++) {
                 listaClientes[i]=new Cliente(i);
                 listaClientes[i].getNombre();
                 listaClientes[i].generarId(i);
                 listaClientes[i].generarDireccion();
             }
         return listaClientes;
         }
         /**
          * Método para mostrar la lista de clientes
          */
         public void mostrarListaClientes(){
             for (int i = 0; i < listaClientes.length; i++) {
                 if(listaClientes[i]!=null){
                 System.out.println("Id: "+listaClientes[i].getId()+"\t | Nombre: "+listaClientes[i].getNombre()+"\t |Dirección: "+listaClientes[i].getDireccion());
                 }
             }
         }
         /**
          * Metodo que selecciona un cliente al azar
          * @return cliente seleccionado
          */
         public int azarCliente(){
             int azCliente=(int) (Math.random()*listaClientes.length);
             return azCliente;
         }
         /**
          * Metodo que genera la cantidad de ventas de un producto
          * @return cantidad
          */
        public int  generarCantidadVentas(){
            int cant=0;
            float probabilidad=(float)(Math.random()*100);
            if(probabilidad<=80){
                cant=(int)(Math.random()*3+1);
            }else if(probabilidad>80 && probabilidad<=95){
                cant=(int)(Math.random()*10+5);
            }else if(probabilidad>95){
                cant=(int)(Math.random()*15+10);
            }
        return cant;
        }
        /**
         * Metodo que selecciona al azar un producto de la lista
         * @return numero de producto de la lista
         */
        public int azarProductoVentas(){
            int numProducto=(int)(Math.random()*lista.length);
            return numProducto;
        }
        /**
         * Metodo que simmula la venta de un producto a un cliente
         */
        public void realizarVentas(){
           int numProducto=azarProductoVentas();
           int cant=generarCantidadVentas();
           int azCliente=azarCliente();
            tablaVentas();
            if(lista[numProducto].getCantInicial()>=azarProductoVentas()){
               lista[numProducto].setNumVentas(cant+lista[numProducto].getNumVentas());
               lista[numProducto].setCantInicial(lista[numProducto].getCantInicial()-cant);
               ventas[ventas.length-1]=new Venta(ventas.length-1);
               ventas[ventas.length-1].setIdCliente(azCliente);
               ventas[ventas.length-1].setCantidad(cant);
               ventas[ventas.length-1].setCodProducto(lista[numProducto].getCodigo());
            }
            if(ventas[ventas.length-1]!=null)
            System.out.println("Cliente: "+ventas[ventas.length-1].getIdCliente()+"\t |Nº Producto: "+ventas[ventas.length-1].getCodProducto()+"\t | Cantidad: "+ventas[ventas.length-1].getCantidad());
            
        }
        /**
         * Metodo que inicia las ventas
         * @return Productos vendidos
         */
        public Venta[] iniciarVentas(){
            Venta [] ventas=new Venta[1];
            
            return ventas;
        }
        /**
         * Metodo que devuelve las evntas
         * @return ventas
         */
        public Venta[] tablaVentas(){
                Venta[] aux=new Venta[ventas.length+1];
                for (int i = 0; i < ventas.length; i++) {
                    aux[i]=new Venta(i);
                    aux[i]=ventas[i];   
            }
                ventas=aux;
            
            return ventas;
        }
        /**
         * Metodo que muestra las ventas
         */
        public void mostrarTablaVentas(){
            for (int i = 0; i < ventas.length; i++) {
                if(ventas[i]!=null)
                System.out.println("Cliente: "+ventas[i].getIdCliente()+"\t |Nº Producto: "+ventas[i].getCodProducto()+"\t | Cantidad: "+ventas[i].getCantidad());
                
            }
        }
        
     
}
