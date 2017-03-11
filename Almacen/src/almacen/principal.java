/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
/**
 *
 * @author david
 */
public class principal {
    
    /**
     * @param args the command line arguments
     */
    private static void buscarProducto(BufferedReader x, Almacen a1) throws NumberFormatException, IOException {
        System.out.println("Pulsa 1 para buscar por nombre");
        System.out.println("Pulsa 1 para buscar por su código");
        int i=Integer.parseInt(x.readLine());
        if(i==1){
            a1.buscarPorNombre();
        } else if(i==2){
            a1.buscarProductoPorId();
        }
    }
    
     private static void listadoOpciones(BufferedReader x, Almacen a1) throws IOException, NumberFormatException {
        System.out.println("Pulsa 1 para ver los productos ordenados por nombre");
        System.out.println("Pulsa 2 para ver la lista ordenada por Id");
        System.out.println("Pulsa 3 para ver los 3 poductos más vendidos y menos vendidos ");
        System.out.println("Pulsa 4 para ver el total media por venta");
        System.out.println("Pulsa 5 para ver el cliente que más compra y su número de ventas");
        System.out.println("Pulsa 6 para ver las compras de un cliente especifico ");
        System.out.println("Pulsa 7 para no realizar ninguna acción y volver al menú");
        int j=Integer.parseInt(x.readLine());
        switch(j){
            case 1:
                a1.ordenarAlmacenPorNombres();
                a1.mostrarAlmacen();
                a1.ordenarAlmacenPorCodigo();
                break;
            case 2:
                a1.mostrarAlmacen();
                
                break;
            case 3:
                System.out.println("Los productos mas vendidos son:");
                a1.ordenarPorMasVendidos();
                a1.mostrarTresProductosAlmacen();
                System.out.println("Los productos menos vendidos son:");
                a1.ordenarPorMenossVendidos();
                a1.mostrarTresProductosAlmacen();
                a1.ordenarAlmacenPorCodigo();
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                break;
        }
    }
    
    public static void menu() throws IOException, InterruptedException{
        Almacen a1=new Almacen();
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int i;
        do{
            System.out.println("Para cargar almacen pulse 1");
            System.out.println("Para añadir un producto pulse 2");
            System.out.println("Para ver un listado e opciones para ver los productos pulse 3 ");
            System.out.println("Pulse 4 para buscar un producto");
            System.out.println("Pulse 5 para simular las ventas");
            System.out.println("Pulse 6 para salir");
            i=Integer.parseInt(x.readLine());
            switch(i){
                case 1:
                    a1.cargarAlmacen();
                break;
                case 2:
                    a1.anadirProducto();
                break;
                case 3:
                    listadoOpciones(x,a1);
                break;
                case 4:
                    buscarProducto(x, a1);
                break;
                case 5:
                    int j = 0;
                    do{
                    a1.realizarVentas();
                    
                    j++;
                    }while(j<10);
                break;
                case 6:
                    System.exit(0);
            }
          
                    
        }while(i!=6);
    
    }

    

   
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
       
        menu();
        
    }
    
    
}
