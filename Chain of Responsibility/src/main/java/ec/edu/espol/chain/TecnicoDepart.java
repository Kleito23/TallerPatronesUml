/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public class TecnicoDepart extends Empleado{
    public void realizarAccion(Solicitud solicitud){
        if(solicitud.isFallaCubierta()){
            System.out.println("Miembro del departamento técnico: El tipo de fallo se encuentra dentro de lo cubierto por la garantía");
            if(nextEmpleado!=null)
                nextEmpleado.realizarAccion(solicitud);
        }else{
            System.out.println("Miembro del departamento técnico: El tipo de fallo no se encuentró dentro de lo cubierto por la garantía. No se realizó el cambio.");
        }
    }
}