package com.atlwork.app;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

    public Main() {

	// 1. Create the frame.
	JFrame frame = new JFrame("AppDemo");

	// 2. Optional: What happens when the frame closes?
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// 3. Create components and put them in the frame.
	JTextField text = new JTextField("Test");
	frame.getContentPane().add(text, BorderLayout.CENTER);

	// 4. Size the frame.
	frame.pack();

	// 5. Show it.
	frame.setVisible(true);
    }

    public static void main(String[] args) {
	new Main();
    }
}
