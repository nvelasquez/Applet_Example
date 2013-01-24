/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.ui;

import com.pacientes.util.Constant;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author Nestor_Velasquez
 */
public class Registro extends JApplet implements Constant{
    private JButton crearBtn;

    
    public  Registro(){
        crearBtn = new JButton();
        //this.add(crearBtn);
       ImageIcon img = new ImageIcon(RESOURCES_URL+"Background.jpg");
       //crearBtn.setIcon(img);
       //this.add(crearBtn);
        this.getGraphics().drawImage(img.getImage(), 0, 180, null);
    }

    @Override
    public void paint(Graphics grphcs) {
        this.getGraphics().drawImage(Toolkit.getDefaultToolkit().getImage(RESOURCES_URL+"Background.jpg"), 0, 180, null);
    }
    
}
