/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.model;

import com.pacientes.util.Util;

/**
 *
 * @author Nestor_Velasquez
 */
public class Paciente {
    
    /********Class Variables*******/
    private int id;
    private String name;
    private String lastName;
    private int age;
    /*****************************/
        
    /*Default Constructor*/
    public Paciente(String nombre, String apellido) {
    
    }

    public Paciente( String name, String lastName, int age) {
        this.id = Util.setId();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Paciente){
            Paciente paciente = (Paciente) o;
            if((name.equalsIgnoreCase(paciente.getName()))&&(lastName.equalsIgnoreCase(paciente.getLastName()))){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    
}
