package edu.uptc.graph.logic;

import java.awt.*;

//Clase Circulo
public class circle {
	  

    private Color color;
    private int diameter;
    private String label;
    private Font fountain;
    private int left;
    private int edgeThickness;
    
 
public circle(){
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
   

}
