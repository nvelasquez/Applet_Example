/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.ui;

import java.awt.Image;
import javax.swing.JApplet;

/**
 *
 * @author Nestor_Velasquez
 */
public class JAppletConFondo extends JApplet {
    
    private final JPanelConFondo contenedor = new JPanelConFondo();

    public JAppletConFondo() {
        setContentPane(contenedor);
    }

    public void setImagen(String nombreImagen) {
        contenedor.setImagen(nombreImagen);
    }

    public void setImagen(Image nuevaImagen) {
        contenedor.setImagen(nuevaImagen);
    }
}
