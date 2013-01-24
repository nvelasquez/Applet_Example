/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.util;

/**
 *
 * @author Nestor_Velasquez
 */
public class Util {
    private static int id;
    
    public static int setId(){
        id++;
        return id;
    }
    
    public static boolean numeroValido(String number){
        try{
        int numero = Integer.parseInt(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
