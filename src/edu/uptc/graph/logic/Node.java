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
	 private int pathLength; //For use of the Disjktra class
     private Node nodeAncestorDisjktra; //For use of the Disjktra class
     private boolean flag;//For use by the Disjktra class

	   public Node() {
		   this.fact = new Object(); 
		   left = 0;
		}
	   
	   public Node(Object dato,Coordinates coordenada){
	        this.dato = dato;
	        listaNodoAdyacente = new ArrayList<Link>();
	        circulo = new Circle(coordenada);
	        circulo.setLeft(left);
			initializeForDisjktra();
	    }
		private void initializeForDisjktra(){
			pathLength = -1;
			nodeAncestorDisjktra = null;
			flag = false;
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

		public ArrayList<Link> getListaNodoAdyacente(){
        ArrayList<Link> listAristaAux = null;
        if(!listaNodoAdyacente.isEmpty()){
            listAristaAux = new ArrayList<Link>();
            for(Link enlace:listaNodoAdyacente){
                if(enlace.getEdge().isHabilitado()){
                    listAristaAux.add(enlace);
                }
            }
        }        
        return listAristaAux;
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

		public void addAdjacentNode(Link edge){
			listaNodoAdyacente.add(edge);
		}
		
		public void addAdjacentNode(Edge via,Node node){
			this.addNodoAdyacente(new Link(via, node));
		}

		public void setVisited(boolean visited){
 		this.visited = visited;
	    }
		
		public boolean isVisited(){
			return visited;
		}

		public Circle getCircle() {
			return circulo;
		}

		public void setCircle(Circle circle) {
			this.circulo = circle;
		}

		public int getPathLength() {
			return pathLength;
		}
 
		public void setPathLength(int pathLength) {
			this.pathLength = pathLength;
		}
		
		public Node getDisjktraAncestorNode() {
			 return nodeAncestorDisjktra;
			}
	
		public void setDisjktraAncestorNode(Node nodoAntecesorDisjktra) {
		 this.nodeAncestorDisjktra = nodoAntecesorDisjktra;
		}
		}




