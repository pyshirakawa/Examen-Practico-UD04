package huevoSorpresa;
/**
 * La clase HuevoSorpresa
 * @author Pablo Yuuki Shirakawa
 */
public class HuevoSorpresaPabloYuukiShirakawa {
    /**
     * número de huevos que quedan 
     */
    private int unidades;//número de huevos que quedan 
    /**
     * precio actual de un huevo sorpresa
     */
    private double precio;//precio actual de un huevo sorpresa
    /**
     * nombre de la sorpresa que incluye huevo sorpresa
     */
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    /**
     * precio máximo que puede tener un huevo sorpresa
     */
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    

    /**
     * Constructor por defecto
     */
public HuevoSorpresaPabloYuukiShirakawa(){}


/**
 * Constructor por parámetros
 * @param unidades número de huevos que quedan 
 * @param precio precio actual de un huevo sorpresa
 * @param sorpresa nombre de la sorpresa que incluye huevo sorpresa
 * @param precio_max  precio máximo que puede tener un huevo sorpresa
 */
public HuevoSorpresaPabloYuukiShirakawa(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


/**
 * Método que devuelve el número de huevos sorpresa que tiene la tienda
 * @return número de huevos que quedan 
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * Método que devuelve el precio que tiene cada huevo sorpresa
 * @return  precio actual de un huevo sorpresa
 */
public double obtenerPrecio(){return this.getPrecio();}



/**
 * Método que permite modificar el número de huevos sorpresa que tiene la tienda
 * @param unidades  número de huevos que quedan 
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}


/**
 * Método que permite sacar huevos sopresa si se tiene suficiente dinero y hay 
 *   suficientes huevos sorpresas, este método se probará con JUnit
 * @param unidades número de huevos que quedan 
 * @param dinero cantidad de dinero que dispones
 * @param sorpresa nombre de la sorpresa que incluye huevo sorpresa
 * @throws Exception 
 */
public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


/**
 * Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual el aumento 
 *   que se indica siempre que no se sobrepase el precio máximo de venta, este método se probará con JUnit
 * @param aumento el nuevo precio a la que quieres aumentar
 * @throws Exception Devuelve una excepción si el nuevo precio es menor que el actuar o supera el maximo permitido
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}

    /**
     * @return Te devuelve la unidad
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades La unidad que quiere establecer
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio El precio que quieres establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return  sorpresa  Devuelve la sorpresa que contiene
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa La sorpresa que quieres establecer
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return the precio_max Te devuelve el precio maximo establecido
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max El precio maximo que quieres establecer
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
}