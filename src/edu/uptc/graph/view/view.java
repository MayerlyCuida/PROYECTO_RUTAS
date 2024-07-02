package edu.uptc.graph.view;

import java.awt.BorderLayout;

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

        // Example: Adding a JLabel to jPanel1
        JLabel label = new JLabel("Hello, Swing!");
        jPanel1.add(label);

        // Set layouts for the panels if needed
        // jPanel1.setLayout(new FlowLayout());
        // jPanel2.setLayout(new GridLayout(2, 2));

        // Add jPanel1 and jPanel2 to the JFrame
        getContentPane().add(jPanel1, BorderLayout.NORTH);
        getContentPane().add(jPanel2, BorderLayout.CENTER);

        // Set JFrame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Application");
        pack(); // Automatically sizes JFrame based on contents
        setLocationRelativeTo(null); // Centers JFrame on screen
    }
	    public static void main(String[] args) {
	        // Create and display the JFrame
	        SwingUtilities.invokeLater(() -> {
	            view frame = new view();
	            frame.setVisible(true);
	        });
	    }
}
