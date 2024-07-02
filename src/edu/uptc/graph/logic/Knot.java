package edu.uptc.graph.logic;



//Clase Nodo 
public class Knot {
	
	 private Object fact;
	 private boolean visited = false;    
	 private int  left;

	   public Knot() {
		   this.fact = new Object(); 
		   left = 0;
		}
	       
	   

	 
	    public Knot(Object dato){
	        this.fact = dato;
	    }

	    public void setDato(Object dato){
	        this.fact = dato;
	    }
	    public Object getDato(){
	        return this.fact;
	    }

}
