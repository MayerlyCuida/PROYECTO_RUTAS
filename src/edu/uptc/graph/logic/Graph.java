package edu.uptc.graph.logic;
import java.awt.Color;
import java.util.ArrayList;
import edu.uptc.graph.logic.*;
//Grafo
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
    public Node buscarNodo(int x, int y){
        Node nodoAuxiliar = null;
        for(int i = 0; i < nodeList.size(); i++){
            int xNodo = nodeList.get(i).getCircle().getX();
            int yNodo = nodeList.get(i).getCircle().getY();
            if(x > xNodo && x < (xNodo + nodeList.get(i).getCircle().getDiameter())){
                if(y > yNodo && y < (yNodo + nodeList.get(i).getCircle().getDiameter())){
                    nodoAuxiliar = nodeList.get(i);
                    break;
                }
            }
        }
        return nodoAuxiliar;
    }
    
    public ArrayList<Node> getAdyacentes(Object dato){
        ArrayList<Node> lista = null;
        Node principal = buscarNodo(dato);
        ArrayList<Link> aristas = principal.getListaNodoAdyacente();
        if(aristas != null){
            for(int i = 0; i < aristas.size();i++){
                lista.add(aristas.get(i).getNode());
            }
        }
        return lista;
    }
    public ArrayList<Node> getListaNodos(){
        return nodeList;
    }
    public boolean isAdyacente(Node n1,Node n2){
        boolean aux = false;
        ArrayList<Link> listaAristas = n1.getListaNodoAdyacente();
        if(listaAristas != null){
            for(int i = 0;i < listaAristas.size();i++){
                if(listaAristas.get(i).getNode() == n2){
                    aux = true;
                }
            }
        }
        return aux;
    }
    public boolean isAdyacente(Object datoNodoInicio,Object datoNodoDestino){
        boolean aux = false;
        Node n1 = buscarNodo(datoNodoInicio);
        Node n2 = buscarNodo(datoNodoDestino);
        ArrayList<Link> listaAristas = n1.getListaNodoAdyacente();
        if(listaAristas != null){
            for(int i = 0;i < listaAristas.size();i++){
                if(listaAristas.get(i).getNode() == n2){
                    aux = true;
                }
            }
        }
        return aux;
    }
    public Edge getArista(Object datoNodo1,Object datoNodo2){
        return getArista(buscarNodo(datoNodo1),buscarNodo(datoNodo2));
    }
    public Edge getArista(String nombreVia){
        Edge aux = null;
        if(nombreVia != null){
            ArrayList<Node> listaN = nodeList;
            for(Node nd:listaN){
                ArrayList<Link> lA = nd.getListaNodoAdyacente();
                for(Link enlace:lA){
                    if(enlace.getEdge().getNameEdge().equals(nombreVia)){
                        aux = enlace.getEdge();
                    }
                }
            }
        }
        return aux;
    }
    public Edge getArista(Node n1,Node n2){
        Edge aux = null;
        if(isAdyacente(n1, n2)){
            ArrayList<Link> listaAristas = n1.getListaNodoAdyacente();
            for(int i = 0;i < listaAristas.size();i++){
                if(listaAristas.get(i).getNode() == n2){
                    aux = listaAristas.get(i).getEdge();
                }
            }
        }else if(isAdyacente(n2, n1)){
            aux = getArista(n2, n1);
        }
        return aux;
    }
    public Link getEnlace(Object datoNodo1,Object datoNodo2){
        Link aux = null;
        if(isAdyacente(datoNodo1, datoNodo2)){
            Node n1 = buscarNodo(datoNodo1);
            Node n2 = buscarNodo(datoNodo2);
            ArrayList<Link> listaAristas = n1.getListaNodoAdyacente();
            for(int i = 0;i < listaAristas.size();i++){
                if(listaAristas.get(i).getNode() == n2){
                    aux = listaAristas.get(i);
                }
            }
        }
        else if(isAdyacente(datoNodo2, datoNodo1)){
            aux = getEnlace(datoNodo2, datoNodo1);
        }
        return aux;
    }
    public void reiniciarGrafoParaDisjktra(){
        for(Node n:nodeList){
            n.setFact(false);
            n.setDisjktraAncestorNode(null);
            n.setPathLength(-1);
        }
    }

    public boolean eliminarNodo(Node nodo){
        boolean retornado = false;
        if(nodo !=null){
            retornado = nodeList.remove(nodo);
        }
        return retornado;
    }
    
    public void reiniciarColores() {
        if(nodeList != null){
            for(Node nodo: nodeList){
                nodo.getCircle().setColor(Color.yellow);
            ArrayList<Link> la = nodo.getListaNodoAdyacente();
                if(la != null){
                    for(Link enlace:la){
                        if(enlace.getEdge().isEnabled()){
                            enlace.getEdge().getBrokenLine().setColor(Color.black);
                            enlace.getEdge().getBrokenLine().setGrosorLinea(1);
                        }
                    }
                }
            }
        }        
    }
    public ArrayList<Edge> aristasEntrante(Node nodo){
        ArrayList<Edge> listaArista = null;
        for(Node n:nodeList){
            ArrayList<Link> enlaces = n.getListaNodoAdyacente();
            if(enlaces != null){
                listaArista = new ArrayList<Edge>();
                for(Link e:enlaces){
                    if(e.getNode()==nodo){
                        listaArista.add(e.getEdge());
                    }
                }
            }
        }
        return listaArista;
    }
    public ArrayList<Edge> aristasSaliente(Node nodo){
        ArrayList<Edge> listaArista = null;
        if(nodo != null){
            if(nodeList.contains(nodo)){                
                ArrayList<Link> listaEnlace = nodo.getListaNodoAdyacente();
                if(listaArista != null){
                    listaArista = new ArrayList<Edge>();
                    for(Link e:listaEnlace){
                        listaArista.add(e.getEdge());
                    }
                }
            }
        }
        return listaArista;
    }
    
    private void eliminarAristas(Node nodo){
        ArrayList<Edge> aristas = aristasSaliente(nodo);        
        for(Edge a:aristas){
            a = null;
        }
    }
    public void eliminarAristasSalientes(Node nodo){
        ArrayList<Edge> aristas = aristasSaliente(nodo);        
        eliminarAristas(nodo);
    }
    public void eliminarAristasEntrante(Node nodo){
        ArrayList<Edge> aristas = aristasEntrante(nodo)        ;
        eliminarAristas(nodo);
    }
    
}
