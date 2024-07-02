package edu.uptc.graph.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class view extends JFrame{
	 private JPanel jPanel1;
	 private JPanel jPanel2;
	    
	public view() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
	private void initComponents() {
        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafo Mapa"));
        // Example: Adding a JLabel to jPanel1
        JLabel label = new JLabel("Hello, Swing!");
        jPanel1.add(label);
        

        // Set layouts for the panels if needed
        // jPanel1.setLayout(new FlowLayout());
         //jPanel2.setLayout(new GridLayout(10, 20));

        // Add jPanel1 and jPanel2 to the JFrame
        getContentPane().add(jPanel1, BorderLayout.NORTH);
        getContentPane().add(jPanel2, BorderLayout.CENTER);

 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Application");
        pack();
        setLocationRelativeTo(null); 
    }
    public void dibujarGrafo(){
        jPanel1.paint(jPanel1.getGraphics());
        dibujarArista();
        dibujarNodos();
    }
    public void dibujarNodos(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
        }
    }
    public void dibujarArista(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                for(Enlace enlace:listaEnlace){
                    enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics());
                }
            }            
        }
    }
	    public static void main(String[] args) {
	        // Create and display the JFrame
	        SwingUtilities.invokeLater(() -> {
	            view frame = new view();	           
	            frame.setVisible(true);
	            
	        });
	    }
}
