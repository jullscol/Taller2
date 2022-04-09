package co.Taller2Polimorfismos;

   /**
    * Representa una clase Unmanned que se extiende de la clase craft 
    * @author julian.arbelaez
    *
    */

public class Manned3 extends Craft {

	/**
	 * Se crea un atributo privado boolean para representar que la nave esta en vuelo
	 */
	private boolean isflying;
	/**
	 * Se crea un constructr
	 * @param passegers
	 */
	public Manned3(int passegers) {
	    super(passegers);
	
	    this.isflying= false;
	    
	     
	    
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
	 public void c() {
		 
 		 this.capacity=150;
	    System.out.println("The cargo capacity of the craft is:" +capacity);

     }
	 /**
	  * Se crea un metodo para inicializar los pasajeros
	  */
 	 public void p() {
     	
     	 this.passengers =5;
     	System.out.println("The passengers of the craft are:" +passengers);
     }
 	 /**
      * Se crea un metodo para inicializar la potencia
      */
     public void po() {
     	
     	 this.power =3600;
     	System.out.println("The power of the craft is:" +power);
     }
     /**
      * Se crea un metodo para inicializar la velocidad
      */
     public void s() {
    	
    	 this.speed =1000;
    	System.out.println("The speed of the craft is:" +speed);
     }
	
     /**
      * Se sobre escribe el metodo para frenar
      */
	@Override
     public void stop() {
			speed =0;
			/*
			 * Se crea atributo para frenar
			 */
			this.isflying = false;
			
		}
     
	
     public boolean Isisflying() {
			return isflying;
		}

		    	  
	    	
	  public void acceleration() {	
	        this.speed = this.speed + 100;
	        System.out.println("The craft is accelerating to 100");	 
	        	
	        }
		
	

		
		

		
	
}

	

	

