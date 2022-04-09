package co.Taller2Polimorfismos;

import java.util.Scanner;

/**
 * Representa la clase principal para crear Naves espaciales
 * @author julian.arbelaez
 *
 */

public class Spacecraft {
	
	
	/**
	 * SE crea el scanner para poder escribir la seleccion de numero
	 */
	 static Scanner sc = new Scanner(System.in);
	 /**
	  * Se crea un array donde se van a guardar las naves
	  */
	    static Craft craft[]= new Craft[4];
	    /**
	     * Se crean las varibles
	     */
	    static int option = 0;
	    static int indiceArreglo = 0;
	   

	public static void main(String[] args) {
		
		
			/**
			 *  Se crea una ejecucion do while para poder salir del programa cuando el usuario lo desee	
			 */
		do{
			
		/**
		 *  Se muestra el menu 
		 */
			showMenu();
		      	
        	while(ask_for_option() == false);
        	
      /**
       *  Se crea el swtch para seleccionar la opcines
       */
			switch(option)
        	{
			/*
			 * Opcion 1 nave tipo vehiculo de lanzadera
			 */
        	case 1:
        		Shuttle_vehicle();
        		break;
        		/**
        		 * Opcion 2 nave tipo No tripulada
        		 */
        	case 2:
        		Manned3();
        		break;
        		/**
        		 * Opcion 3 nave tipo tripulada
        		 */
        	case 3:
        		Manned();
        		break;
        		/**
        		 * Opcion 4 nave tipo tripulada1
        		 */
        	case 4:
        		Manned1();
        		break;
        		/**
        		 * Opcion 5 Para salir del sistema
        		 */
        	
        	case 5:
        		System.out.println("END OF THE PROGRAM");
        	}	
       }while(option != 5);

	    }
	   
	  			
              /*
               * Se crea metodo para imprmir el menu de opciones
               */
			static void showMenu()
		    {
		    	System.out.println("\n");
		    	System.out.println(" 1 - Create Shuttle Vehicle");
		        System.out.println(" 2 - Create Unmanned  Vehicle");
		        System.out.println(" 3 - Create Manned Veicle");
		        System.out.println(" 4 - Create Manned Veicle1");
		        System.out.println(" 5 - Get out of the system\n");
		    }
		   
			
			/**
			 * SE crea un metodo boolean
			 * @return error cuando el usuario quiera colocar una opcion incorrecta
			 */
		    static boolean ask_for_option()
		    
		    {
		    	/**
		    	 * SE crea la condicion para par recorrer la opciones de 1 al 5
		    	 */
		    	try
		    	{
		    		/**
		    		 * Se muestra para seleccionar la opcion
		    		 */
		    		System.out.print("\nEnter option: ");
		    		option = sc.nextInt(); sc.nextLine();
		    		if (option >= 1 && option <= 5)
		    			return true; 		
		    		else
		    		{
		    			/**
		    			 * Se muestra el error
		    			 */
		    			System.out.println("Error. Only value between 1 and 5 is allowed.");
		    			return false;
		    			}
		    	}
		    	catch(Exception e)
		    	{
		    		sc.nextLine();
		    		/**
		    		 *  Se muestra el error
		    		 */
		    		System.out.println("Error. Enter only numbers, between 1 and 5.");
		    		return false;
		    	}
		    	
		    	
		    	
		    }

		    /**
		 	 * Se crea un metodo estatico para crear una nave de tipo vehiculo de lanzadera
		 	 */
		static void Shuttle_vehicle(){
			 /**
	          * Se imprime en pantalla
	          */
		   
		   System.out.println("You have just created a launch craft type Saturn");
		   System.out.println("The craft has the following characteristics:");
		     /**
			  * Se crea una nave de  tipo de vehiculo de lanzadera
			  */
		    Craft Saturn = new Shuttle_vehicle();
		    /**
			    * Se muestran las caracteristicas del tipo de nave vehiculo de lanzadera
			    */
		    Saturn.acceleration();		
		    Saturn.c();
		    Saturn.p();
		    Saturn.po();
		    Saturn.s();
	   	}
			 
		 	/**
		 	 * Se crea un un método estatico para crear una nave de tipo Tripulada
		 	 */
		static void Manned() {
	         /**
	          * Se imprime en pantalla
	          */
			System.out.println("You have just created a launch craft type Sovietic");
			System.out.println("The craft has the following characteristics:");
			/**
			 * Se crea una nave de  tipo tripulda
			 */
			  Craft Sovietic = new Manned();
		    /**
		    * Se muestran las caracteristicas del tipo de nave Tripulada
		    */
			  Sovietic.acceleration();		
			  Sovietic.c();
			  Sovietic.p();
			  Sovietic.po();
			  Sovietic.s();
				
	    }
	        /**
	         * Se crea un metodo estatico para crear una nave de tipo Tripulada1
	         */
			
		static void Manned1() {
			 /**
	          * Se imprime en pantalla
	          */
			System.out.println("You have just created a launch craft type Jupiter");	 
			System.out.println("The craft has the following characteristics:");
			 /**
			  * Se crea una nave de  tipo Tripulada 1
			  */
			  Craft Jupiter = new Manned1();
			 /**
			  * Se muestran las caracteristicas del tipo de nave Tripulada1
			  */
			  Jupiter.acceleration();		
			  Jupiter.c();
			  Jupiter.p();
			  Jupiter.po();
			  Jupiter.s();
						
		}
             /**
              * Se crea un metodo estatico para crear una nave de tipo Tripulada3
              */
		static void Manned3() {
			 /**
	          * Se imprime en pantalla
	          */
			System.out.println("You have just created a launch craft type Skylab");
			System.out.println("The craft has the following characteristics:");
			/**
			 * Se crea una nave de  tipo No tripulada3
			 */
			  Craft  Skylab = new Manned3(1);
			  /**
			    * Se muestran las caracteristicas del tipo de nave tripulada3
			    */
		
			  Skylab.acceleration();		
			  Skylab.c();
			  Skylab.p();
			  Skylab.po();
			  Skylab.s();
			
		}
			
		
		
				

	}



	
