//clase hijo 3 
public class Productorefrijerado extends Producto {
    
 private String codigoSupervisionAlimentaria;//declaramos el codigo del producto
 //para dar a entender y conctenar con las otras clases lo que estamos heredando hacei aesta clase
 //para que todo valla en oreden y nuestto programa no nos presente errores de compilacion
    
    public Productorefrijerado(String fechaCaducidad, String numeroLote){// contruimos el metodo
        //constructor de la clase productos refrigerados y concatemamos.
        super(fechaCaducidad, numeroLote);// utlizamos super para referirno a una variable
        // que esta dentro de un metodo conectado con la super clase
        codigoSupervisionAlimentaria = "Desconocido";
    }
    
    public void setCodigoSupervisionAlimentaria(String codigo){// creamos este metodo para hacerel llamado
        // del codigo
        codigoSupervisionAlimentaria = codigo;
    }
    
    public String getCodigoSupervisionAlimentaria(){// nos retonara el codigo solicitado por metodo de arriba
        return codigoSupervisionAlimentaria;
    }
}
