/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EsferaDePandora
 */
public class Paciente {
    //ATRIBUTOS
    private String nombre;
    private String padecimiento;
    private String prioridad;
    
    //CONSTRUCTORES
    public Paciente(String nombre, String padecimiento, String prioridad) {
	this.nombre=nombre;
        this.padecimiento=padecimiento;
        this.prioridad=prioridad;
    }
    public Paciente() {
	nombre="";
        padecimiento="";
        prioridad="";
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getPadecimiento(){
        return padecimiento;
    }
    public String getPrioridad(){
        return prioridad;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPadecimiento(String padecimiento){
        this.padecimiento=padecimiento;
    }
    public void setPrioridad(String prioridad){
        this.prioridad=prioridad;
    }
    
}
