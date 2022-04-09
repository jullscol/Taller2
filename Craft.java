package co.Taller2Polimorfismos;

/**
 * Representa una clase abstracta
 * @author julian.arbelaez
 */

public abstract class Craft {
	
   /*Atributos*/
   /**
    * Pasajeros en la Nave
   */
	public int passengers ;
	/**
	 * Capacidad de carga de la nave
	 */
    public float capacity;
    /**
     * Potencia de la Nave
     */
    public int power;
    /**
     * Velocidad de la Nave
     */
    public int speed;
    
    /**
     * Se crea un constructor principal pasajeros.
     * @param passegers
     */
    public Craft(int passegers) {
    	/**
    	 * Se inicilizan los atributos adentro del constructor
    	 */
    	this.passengers=0;
    	this.capacity =0;
    	this.power =0;
    	this.speed =0;    	
    }
    
   /**
    * Se crea un comportamiento abstracto
    */
    public abstract void acceleration();
    
    /**
     * Se crea un metodo para inicializar la capacidad de cargo
     */
    public void c() {
    	
    	this.capacity =0;
    }
    
    /**
     * Se crea un metodo para inicializar los pasajeros
     */
    public void p() {
    	
    	this.passengers =0;
    }
    /**
     * Se crea un metodo para inicializar la potencia
     */
    public void po() {
    	
    	this.power =0;
    }
    /**
     * Se crea un metodo para inicializar la velocidad
     */
    public void s() {
   	
   	    this.speed =0;
    }
   
    /**
     * Se crea un metodo para inicializar la parada 
     */
     public void stop () {
    	
    	this.speed =0;
    }
	
    	
	 
	
}
