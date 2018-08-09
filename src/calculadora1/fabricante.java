
package calculadora1;


public class fabricante {
   
    //declaramos los atributos con private de eso se trata el encapsulamiento
    // para proteger nuestro codigos a esto se le llama get para proteger los
    //los datos y  el set nos ayuda a mostrar los datos que tenemos protegidos 
    // con el get aqui lo hizmos con private para hacer un poca mas privado el atributp
    // para no ser alterado muy facilmnete.
    private String fabricante;
    private String color;
    private String modelo;
    private String tamaño;
    // Ahora creamos lo que son los metodos Get y Set
    //para poder acceder a nuestros atributos de tipo 
    // luego estos los utilizamos en la clase principal para hacer
    // el llamado de la funcion

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
     // luego creamos el metodo que motrara los datos de que estamos pidiendo
    //al metodo constructor y nos imprime cada unos de los datos que le solicitamos
    
    void verdatosfabricantes(){
        System.out.println("fabricante:"+fabricante);
         System.out.println("Modelo:"+modelo);
          System.out.println("Color:"+color);
           System.out.println("Tamaño:"+tamaño);
        
    }
}
