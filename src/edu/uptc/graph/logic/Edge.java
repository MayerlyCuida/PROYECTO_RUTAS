package edu.uptc.graph.logic;


//Clase Arista
public class Edge {
	private  int  	idEdge;
	private  String nameEdge;
	private int distance;
	private BrokenLine lineaQuebrada;//Ésta es la via representada graficamente    
    private boolean habilitado;
	
	public Edge() {
		
	}
	
	public Edge(int idEdge, String nameEdge, int distance) {
		super();
		this.idEdge = idEdge;
		this.nameEdge = nameEdge;
		this.distance = distance;
		lineaQuebrada = null;
        habilitado = true;
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
	public void setLineaQuebrada(BrokenLine lineaQuebrada){
        this.lineaQuebrada = lineaQuebrada;
        if(lineaQuebrada != null){
            this.lineaQuebrada.setLongitud(distance);
        }
    }
    public BrokenLine getLineaQuebrada(){
        return lineaQuebrada;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
	


}
