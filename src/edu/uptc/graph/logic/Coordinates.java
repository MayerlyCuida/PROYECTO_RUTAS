package edu.uptc.graph.logic;

import java.util.ArrayList;

// Clase Coordenadas
public class Coordinates extends ArrayList<int[]> {
	private int xMaxima;
	private int yMaxima;

	public Coordinates() {
		this(0, 0);
	}

	public Coordinates(int xMaxima, int yMaxima) {
		super();
		this.xMaxima = xMaxima;
		this.yMaxima = yMaxima;
	}

	public Coordinates(int xMaxima, int yMaxima, int x, int y) {
		super();
		this.xMaxima = xMaxima;
		this.yMaxima = yMaxima;
		addCoordenada(x, y);
	}

	public void setXMaxima(int xMaxima) {
		this.xMaxima = xMaxima;
	}

	public void setYMaxima(int yMaxima) {
		this.yMaxima = yMaxima;
	}

	public void addCoordenada(int x, int y) {
		if (x >= 0 && x <= xMaxima && y >= 0 && y <= yMaxima) {
			int[] parXY = { x, y };
			add(parXY);
		}
	}

	public int getxMaxima() {
		return xMaxima;
	}

	public int getyMaxima() {
		return yMaxima;
	}

}
