package co.Taller2Polimorfismos;

/**
 * Representa una clase Unmanned que se extiende de la clase craft 
 * @author julian.arbelaez
 *
 */

public class Shuttle_vehicle extends Craft {
	
	/**
	 * Se crea un atributo privado boolean para representar que la nave esta en vuelo
	 */
	
	private boolean isflying;
	/**
	 * Se crea un constructor
	 */
	public Shuttle_vehicle() {
	    super(2);
		
			
		this.isflying= false;
		
								
        }
	    /**
          * Se crea un metodo para inicializar la capacidad de cargo
          */
	 	 public void c() {
		 
	 		 this.capacity=118;
		    System.out.println("The cargo capacity of the craft is:" +capacity);
	
	     }
	 	/**
	      * Se crea un metodo para inicializar los pasajeros
	      */
	 	 public void p() {
	     	
	     	 this.passengers =2;
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
	    	
	    	 this.speed =100;
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
	        this.speed = this.speed + 10;
	        
	        System.out.println("The craft is accelerating to 10");
	        	 
	        	
	        }
	     /**
	      * Se crea un metodo para inicializar la capacidad de cargo
	      */
		 @Override
		public void stop() {
			speed =0;
			this.isflying = false;
			  System.out.println("The craft has stopped");
		}
		 /**
		  * Se crea un metodo para inicializar la capacidad de cargo
		  */
		public boolean isflying() {
			return isflying;
		}

		
				

		


		
	
}


