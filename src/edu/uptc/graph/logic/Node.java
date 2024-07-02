package edu.uptc.graph.logic;

import java.util.ArrayList;

//Clase Nodo 
public class Node {
    private Object dato;
    private ArrayList<Link> listaNodoAdyacente;
	 private Object fact;
	 private boolean visited = false;  
	 private Circle circulo;
	 private int  left;

	   public Node() {
		   this.fact = new Object(); 
		   left = 0;
		}
	   
	   public Node(Object dato,Coordinates coordenada){
	        this.dato = dato;
	        listaNodoAdyacente = new ArrayList<Link>();
	        circulo = new Circle(coordenada);
	        circulo.setLeft(left);
	    }
	   public void addNodoAdyacente(Link arista){
	        listaNodoAdyacente.add(arista);
	    }
	    public void addNodoAdyacente(Edge via,Node nodo){
	        this.addNodoAdyacente(new Link(via,nodo));
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

		public ArrayList<Link> getListaNodoAdyacente() {
			return listaNodoAdyacente;
		}

		public void setListaNodoAdyacente(ArrayList<Link> listaNodoAdyacente) {
			this.listaNodoAdyacente = listaNodoAdyacente;
		}

		public Object getFact() {
			return fact;
		}

		public void setFact(Object fact) {
			this.fact = fact;
		}

		public boolean isVisited() {
			return visited;
		}

		public void setVisited(boolean visited) {
			this.visited = visited;
		}

		public Circle getCirculo() {
			return circulo;
		}

		public void setCirculo(Circle circulo) {
			this.circulo = circulo;
		}

		public int getLeft() {
			return left;
		}

		public void setLeft(int left) {
			this.left = left;
		}
	    
	    

}
