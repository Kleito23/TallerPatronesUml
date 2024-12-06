/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public class JefeInventario extends Empleado{
    public void realizarAccion(Solicitud solicitud){
        if(solicitud.isExiste()){
            System.out.println("Jefe de inventario: El producto existe en la bodega");
            if(nextEmpleado!=null)
                nextEmpleado.realizarAccion(solicitud);
        }else{
            System.out.println("Jefe de inventario: El producto no existe en la bodega. No se realizó el cambio.");
        }
    }
}
