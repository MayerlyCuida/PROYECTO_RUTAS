package edu.uptc.graph.logic;

//
public class Link {
	 private Edge edge;
	    private Node node;

	
	    public Link(){
	    	edge=new Edge();
	    	node= new Node();
	    }
	    public Link(Edge edge,Node node){
	   
	        this.edge = edge;
	        this.node = node;
	    }
		public Edge getEdge() {
			return edge;
		}
		public void setEdge(Edge edge) {
			this.edge = edge;
		}
		public Node getNode() {
			return node;
		}
		public void setNode(Node node) {
			this.node = node;
		}
	    
	    
}
