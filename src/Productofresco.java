//clase hijo 2
public class Productofresco extends Producto {
     private String fechaEnvasado, paisDeOrigen;//declaromos la variables que concatenan con la clase
     //hijo 1
    
    public Productofresco(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        fechaEnvasado = "Desconocido";
        paisDeOrigen = "Desconocido";
    }
    
    public void setFechaEnvasado(String fecha){// declaramos un cosntructor para la fecha
        fechaEnvasado = fecha;
    }
    
    public void setPaisDeOrigen(String pais){//contructor para el pais de origen
        paisDeOrigen = pais;
    }
    
    public String getFechaEnvasado(){// esta liena nos retomara el valor la
        //fecha de envasado
        return fechaEnvasado;
    }
    
    public String getPaisDeOrigen(){ //nos retonara el pais de origen 
        return paisDeOrigen; 
    }
}
