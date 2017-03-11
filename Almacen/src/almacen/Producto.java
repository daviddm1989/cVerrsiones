package almacen;

public class Producto {
	  private float codigo;
    private String nombre;
    private float precio;
    private int cantidadInicial;
    private int nVentas;
    
    //Constructor
    public Producto(int i){
        this.codigo=generarCodigo(i);
        this.nombre=generarNombre();
        this.precio=generarPrecio();
        this.cantidadInicial=generarCantidadInicial();
        this.nVentas=getNumVentas();
    }
    public float generarCodigo(int i){
        codigo=(float) (float)(Math.random()*0.501)+(i+1);
        codigo=(float) ((float)Math.round(codigo * 100d) / 100d);
        
        return codigo;
    }
    /**
     * Método para pedirle un nombre al azar
     * @return nos devuelve el nombre del producto
     */
    public String generarNombre(){
        int i=(int) (Math.random()*5+1);
        switch(i){
            case 1:nombre="Ordenador";
            break;
            case 2:nombre="Teléfono";
            break;
            case 3:nombre="Consola";
            break;
            case 4:nombre="Tablet";
            break;
            case 5:nombre="Cámara";
            break;
        }
        return nombre;
    }
    /**
     * Método para darnos el precio del producto aleatoriamente
     * @return el precio del producto
     */
    public float generarPrecio(){
        
        precio=(float) (Math.random()*300+50);
        precio=(float) ((float)Math.round(precio*100)/100);
        return precio;
    }
    /**
     * Método que nos devulve la cantidad inicial de productos
     * @return la cantidad inicial de productos
     */
    public int generarCantidadInicial(){
        this.cantidadInicial=(int)(Math.random()*101+50);
        return cantidadInicial;
    }
    /**
     * Nos dice el numero de productos vendidos
     * @return el número de ventas
     */
    public int getNumVentas(){
        return nVentas;
    }
    /**
     * Modifica el codigo del producto
     * @param codigo 
     */
    public void setCodigo(float codigo){
        this.codigo=codigo;
    }
    /**
     * Devuelve el codigo del producto
     * @return codigo del producto
     */
    public float getCodigo(){
        return codigo;
    }
    /**
     * Modifica el nombre del producto
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre=nombre;  
    }
    /**
     * Devuelve el nombre del producto
     * @return nombre del producto
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Modifica el precio del producto
     * @param precio 
     */
    public void setPrecio(float precio){
        this.precio=precio;
    }
    /**
     * Devuelve el precio del producto
     * @return precio del producto
     */
    public float getPrecio(){
        return precio;
    }
    /**
     * Modifica la cantidad inicial del producto
     * @param cantidadInicial 
     */
    public void setCantInicial(int cantidadInicial){
        this.cantidadInicial=cantidadInicial;
    }
    /**
     * Devuelve la cantidad inicial del producto
     * @return cantidad inicial del producto
     */
   public int getCantInicial(){
       return cantidadInicial;
   }
   /**
    * Modifica el numero de ventas del producto
    * @param nVentas 
    */
   public void setNumVentas(int nVentas){
       this.nVentas=nVentas;
   }
}
