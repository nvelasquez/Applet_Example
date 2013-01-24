/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.controller;

import com.pacientes.model.Paciente;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Nestor_Velasquez
 */
public class PacienteController {
    
    private static Map<Integer,Paciente> pacientes = new HashMap<>();

    public static void crearPaciente(String name, String lastName, String age)throws IsExistsException {
        
        Paciente paciente = new Paciente(name, lastName, Integer.parseInt(age));
        
        if(pacientes.containsValue(paciente)){
            throw new IsExistsException("Ya existe un paciente con estos criterios");
        }else{
            pacientes.put(paciente.getId(),paciente); 
        }
    }

    public static void actualizarPaciente(Paciente obj){
        pacientes.put(obj.getId(), obj);
    }
    
    public static void borrarPaciente(Paciente obj){
        pacientes.remove(obj.getId());
    }

    public static Map<Integer, Paciente> listar(){
        return pacientes;
    }
}
