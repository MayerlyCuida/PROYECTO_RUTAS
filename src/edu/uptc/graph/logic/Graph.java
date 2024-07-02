package edu.uptc.graph.logic;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Node> nodeList;

    public Graph() {
    	nodeList = new ArrayList<Node>();
	}
    
    public boolean adjuntarNodo(Node node){
        Node nodoTemp = buscarNodo(node.getDato());
        if(nodoTemp == null){
        	nodeList.add(node);
            return true;
        }else{
            return false;
        }
    }
    
    public Node buscarNodo(Object dato){
        Node temp = null;        
        if(dato != null){
            for(Node nodo:nodeList){
                if(dato.equals(nodo.getDato())){
                    temp = nodo;              
                }
            }
        }
        return temp;
    }
    public void crearEnlacesDirigido(Node padre,Node adyacente,Edge arista){
        if(padre != null && adyacente != null){
            padre.addNodoAdyacente(arista,adyacente);
        }
    }

	public ArrayList<Node> getNodeList() {
		return nodeList;
	}

	public void setNodeList(ArrayList<Node> nodeList) {
		this.nodeList = nodeList;
	}
    
}
