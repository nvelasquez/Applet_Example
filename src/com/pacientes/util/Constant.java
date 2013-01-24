/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.util;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Nestor_Velasquez
 */
public interface Constant {
    public String RESOURCES_URL = "/com/pacientes/resources/";
    public String[] PACIENTES_TABLE_COLUMS = {"Id","Nombre","Apellido","Edad"};
    
    public Font TITLE_FONT = new Font("Title Font", Font.BOLD, 20);
    public Color FONT_COLOR = Color.CYAN;
    public Color BACKGROUND = new Color(0,0,153);
}
