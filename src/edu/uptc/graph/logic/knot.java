package edu.uptc.graph.logic;



//Clase Nodo 
public class knot {
	
	 private Object fact;
	 private boolean visited = false;    
	 private int  izquierda;

	   public knot() {
		   this.fact = new Object();
	        
	        izquierda = 0;
		}
	       
	   

	 
	    public knot(Object dato){
	        this.fact = dato;
	    }

	    public void setDato(Object dato){
	        this.fact = dato;
	    }
	    public Object getDato(){
	        return this.fact;
	    }

}
