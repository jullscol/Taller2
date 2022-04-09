package co.Taller2Polimorfismos;



public class Manned extends Craft {
	/**
	 * Se crea un atributo privado boolean para representar que la nave esta en vuelo
	 */
	private boolean isflying;
	/**
	 * Se crea un constructor
	 */
	public Manned() {
		super(6);
		
		
						
		this.isflying= false;
		
			
    }
	/**
     * Se crea un metodo para inicializar la capacidad de cargo
     */
     public void c() {
		 
 		 this.capacity=150;
	    System.out.println("The cargo capacity of the craft is:" +capacity);

     }
     /**
      * Se crea un metodo para inicializar los pasajeros
      */
 	 public void p() {
     	
     	 this.passengers =6;
     	System.out.println("The passengers of the craft are:" +passengers);
     }
 	 /**
      * Se crea un metodo para inicializar la potencia
      */
     public void po() {
     	
     	 this.power =3500;
     	System.out.println("The power of the craft is:" +power);
     }
     /**
      * Se crea un metodo para inicializar la velocidad
      */
     public void s() {
    	
    	 this.speed =1500;
    	System.out.println("The speed of the craft is:" +speed);
     }
	
     /**
      * Se crea metodo para inicializar el comportamiento que la nave esta volando
      */
	 public void Vuelo() {
		isflying = true;
		
		
	}
	    	 
	 /**
	  * Se crea un metodo para inicializar la capacidad de cargo
	  */  	
	  public void acceleration() {	
	        this.speed = this.speed + 500;
	        System.out.println("The craft is accelerating to 1000"); 	 
	        	
	        }
	  /**
	   * Se crea un metodo para inicializar la capacidad de cargo
	   */
	  public void stop() {
			speed =0;
			this.isflying = false;
			
		}
	  /**
	   * Se crea un metodo para inicializar la capacidad de cargo
	   */
	  public boolean isflying() {
			return isflying;
		}

	
		

		
		
			
	
	
}

