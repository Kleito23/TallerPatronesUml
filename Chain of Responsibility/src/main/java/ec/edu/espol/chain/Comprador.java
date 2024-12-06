/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.chain;

/**
 *
 */
public class Comprador {

    public static void main(String[] args) {
        Empleado asistente = new AsistenteDepart();
        Empleado miembro = new TecnicoDepart();
        Empleado jefe = new JefeInventario();
        Empleado gerente = new Gerente();
        
        asistente.setNext(miembro);
        miembro.setNext(jefe);
        jefe.setNext(gerente);
        
        System.out.println("Solicitud 1: Producto en garantía, falla cubierta, en inventario, precio 1200 USD");
        Solicitud solicitud = new Solicitud(true, true, true, 1200);
        asistente.realizarAccion(solicitud);
        
        System.out.println();
        System.out.println("Solicitud 2: Producto no está en garantía, falla cubierta, en inventario, precio 1200 USD");
        Solicitud solicitud2 = new Solicitud(false, true, true, 1200);
        asistente.realizarAccion(solicitud2);
        
        System.out.println();
        System.out.println("Solicitud 3: Producto en garantía, falla cubierta, pero no está en inventario, precio 500 USD");
        Solicitud solicitud3 = new Solicitud(true, true, false, 500);
        asistente.realizarAccion(solicitud3);
        
        System.out.println();
        System.out.println("Solicitud 3: Producto en garantía, falla cubierta,  en inventario, precio 500 USD");
        Solicitud solicitud4 = new Solicitud(true, true, true, 500);
        asistente.realizarAccion(solicitud4);


    }
}
