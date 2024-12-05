package ec.edu.espol.Classes;

public class Producto {
    private String nombre;
    private String estado;

    Producto(String nombre, String estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    public String getNombre(){
        return nombre;
    }
}
