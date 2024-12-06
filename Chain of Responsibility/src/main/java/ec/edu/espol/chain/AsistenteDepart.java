/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public class AsistenteDepart extends Empleado{
    public void realizarAccion(Solicitud solicitud){
        if(solicitud.isEnGarantia()){
            System.out.println("Asistente del departamento de atención: El producto se encuentra en periodo de garantía");
            if(nextEmpleado!=null)
                nextEmpleado.realizarAccion(solicitud);
        }else{
            System.out.println("Asistente del departamento de atención: El producto no está en garantía. No se realizó el cambio.");
        }
    }
}
