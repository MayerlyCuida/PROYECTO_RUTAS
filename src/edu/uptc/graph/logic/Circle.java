package edu.uptc.graph.logic;

import java.awt.*;

//Clase Circulo
public class Circle {
	  
	private Coordinates coordinates;
    private Color color;
    private int diameter;
    private String label;
    private Font fountain;
    private int left;
    private int edgeThickness;
    
 
public Circle(Coordinates coordinates){
    	this.coordinates = coordinates;
        color = Color.yellow;
        diameter = 10;
        label = "";
        fountain = null;
        left = 0;
        edgeThickness = 2;
    }
public Color getColor() {
	return color;
}


public void setColor(Color color) {
	this.color = color;
}


public int getDiameter() {
	return diameter;
}


public void setDiameter(int diameter) {
	this.diameter = diameter;
}


public String getLabel() {
	return label;
}


public void setLabel(String label) {
	this.label = label;
}


public Font getFountain() {
	return fountain;
}


public void setFountain(Font fountain) {
	this.fountain = fountain;
}


public int getLeft() {
	return left;
}


public void setLeft(int left) {
	this.left = left;
}


public int getEdgeThickness() {
	return edgeThickness;
}


public void setEdgeThickness(int edgeThickness) {
	this.edgeThickness = edgeThickness;
}

public void dibujarCirculo(Graphics g){
    if(coordinates.size() > 0){
        ((Graphics2D)g).setColor(color);

        ((Graphics2D)g).setStroke(new BasicStroke(getEdgeThickness()));

        ((Graphics2D)g).fillOval(coordinates.get(0)[0],coordinates.get(0)[1],diameter,diameter);
        ((Graphics2D)g).setColor(Color.black);
        ((Graphics2D)g).drawOval(coordinates.get(0)[0],coordinates.get(0)[1],diameter,diameter);
        if(!"".equals(label)){
            if(fountain != null){
                g.setFont(fountain);
            }

                ((Graphics2D)g).drawString(label,coordinates.get(0)[0] - (left),coordinates.get(0)[1]);


            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        }
    }else{
        System.out.println("No hay coordenadas para el circulo");
    }
}

public int getX(){
    if(coordinates.size() > 0){
        return coordinates.get(0)[0];
    }else{
        return -1;
    }
}
public int getY(){
    if(coordinates.size() > 0){
        return coordinates.get(0)[1];
    }else{
        return -1;
    }
}
   

}
