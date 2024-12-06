/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public class Gerente extends Empleado{
    public void realizarAccion(Solicitud solicitud){
        if(solicitud.getPrecio()>1000){
            System.out.println("Gerente: Se aprobó el cambio.");
        }else{
            System.out.println("No es necesario la aprobación del gerente. Se realizó el cambio.");
        }
    }
}
