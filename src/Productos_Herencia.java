
public class Productos_Herencia {

    
    public static void main(String[] args) {
        // en esta parte declaramos todos los datos que queremos mostrar
        // determinamos cada variable que colocamos en cada una de las clases
        //para que la super claser o clse princiál puede conectar con cada una de las 
        //clases para adquirir la informacion de cada una.
         Productocongelado nuggets = new Productocongelado("16-10-2016","L1603004");//declaromos la fecha y lote
        Productofresco lechuga = new Productofresco("20-10-2016","L1610005");//producto
        Productorefrijerado jugo = new Productorefrijerado("25-10-2016","L1609006");//productos refrijerados con su fecha y lote 
        System.out.println("Sin datos. \nProducto Congelado: ");// estos es cunado solo tenemos productos sin datos y para dar una demsotracion
        // detallamos la varieble y concatemos para que nos imprim ala lonea de codgio de la clase heredad//                                                        // como se mira sin datos y con datos 
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote() 
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + jugo.getCodigoSupervisionAlimentaria());
        nuggets.setTemperaturaRecomendada(-18);
        lechuga.setFechaEnvasado("03-10-2015");
        lechuga.setPaisDeOrigen("Panamá");
        jugo.setCodigoSupervisionAlimentaria("B#6745");
        System.out.println();
        System.out.println("Con datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote() 
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + jugo.getCodigoSupervisionAlimentaria());
    }
    }
    

