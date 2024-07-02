package edu.uptc.graph.logic;


//Clase Arista
public class Edge {
	private  int  	idEdge;
	private  String nameEdge;
	private int distance;
	
	public Edge() {
		
	}
	
	public Edge(int idEdge, String nameEdge, int distance) {
		super();
		this.idEdge = idEdge;
		this.nameEdge = nameEdge;
		this.distance = distance;
	}
	public int getIdEdge() {
		return idEdge;
	}
	public void setIdEdge(int idEdge) {
		this.idEdge = idEdge;
	}
	public String getNameEdge() {
		return nameEdge;
	}
	public void setNameEdge(String nameEdge) {
		this.nameEdge = nameEdge;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	


}
