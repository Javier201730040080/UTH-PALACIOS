// clase hijo
public class Productocongelado extends Producto {
     //en esta clase derivamos el atributo que se asemeja con la clase padre
    private double tempCongelacionRecomendada;
     
    
    public Productocongelado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        tempCongelacionRecomendada = 0;
    }
    
    public void setTemperaturaRecomendada(double temperatura){
        tempCongelacionRecomendada = temperatura;// para devolver el valor a la hora de ingresarlo 
        
    }
    
    public double getTemperaturaRecomendada(){
        return tempCongelacionRecomendada;// esta linea nos devolvera el valor de la temperatura
    }
}


