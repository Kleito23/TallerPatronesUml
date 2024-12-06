/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public abstract class Empleado {
    public Empleado nextEmpleado;
    
    public void setNext(Empleado nextEmpleado){
        this.nextEmpleado=nextEmpleado;
    }
    public abstract void realizarAccion(Solicitud request);
}



