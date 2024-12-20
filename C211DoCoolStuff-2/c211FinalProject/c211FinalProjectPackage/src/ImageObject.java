/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.c211docoolstuff.c211finalproject2; 

/**
 *
 * @author AMBER
 */

import javax.swing.*; 
import java.awt.*; 
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO; 

public class ImageObject {
    private String imagePath;
    private ImageIcon imageIcon;
    
    
    // Constructor to initialize image path
    public ImageObject(String imagePath) {
        this.imagePath = imagePath;
        loadImage();
    }

    // Method to load the image based on the current file path
    private void loadImage() {
        try {
            File imgFile = new File(imagePath);
            Image img = ImageIO.read(imgFile);
            imageIcon = new ImageIcon(img);
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }

    // Method to change the image path after the object is created
    public void setImagePath(String newPath) {
        this.imagePath = newPath;
        loadImage(); // Reload the image
    }

    // Method to get the ImageIcon for displaying
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    // Method to display the image in a JFrame
    public void displayImage(JInternalFrame frame) {

        // Create a label to display the image
        JLabel label = new JLabel(getImageIcon());
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}

