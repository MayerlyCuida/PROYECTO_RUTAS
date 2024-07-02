package edu.uptc.graph.logic;



//Clase Nodo 
public class Node {
	
	 private Object fact;
	 private boolean visited = false;    
	 private int  left;

	   public Node() {
		   this.fact = new Object(); 
		   left = 0;
		}
	
	       
	   

	 
	    public Node(Object dato){
	        this.fact = dato;
	    }

	    public void setDato(Object dato){
	        this.fact = dato;
	    }
	    public Object getDato(){
	        return this.fact;
	    }

}
