/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chain;

/**
 *
 */
public class Solicitud {
    private boolean enGarantia;
    private boolean fallaCubierta;
    private boolean existe;
    private double precio;

    public Solicitud(boolean enGarantia, boolean fallaCubierta, boolean existe, double precio) {
        this.enGarantia = enGarantia;
        this.fallaCubierta = fallaCubierta;
        this.existe = existe;
        this.precio = precio;
    }

    public boolean isEnGarantia() {
        return enGarantia;
    }

    public boolean isFallaCubierta() {
        return fallaCubierta;
    }

    public boolean isExiste() {
        return existe;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
