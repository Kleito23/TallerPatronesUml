package ec.edu.espol.Classes;

import java.util.ArrayList;

import ec.edu.espol.Interfaces.Iterator;

public class BodegaIterator implements Iterator{
    private Bodega bodega;
    private String tipo;
    private int position = 0;
    private ArrayList<Producto> productos;

    public BodegaIterator(Bodega bodega, String tipo){
        this.bodega = bodega;
        this.tipo = tipo;
    }

    public void setProductos(){
        if(tipo == "Disponible"){
            productos = bodega.getDisponibles();
        }
        else if(tipo == "DisponibleT"){
            productos = bodega.getDisponiblesT();
        }
        else if(tipo == "Fallido"){
            productos = bodega.getFailure();
        }
        else if(tipo == "Reparacion"){
            productos = bodega.getRepair();
        }
    }

    public boolean hasNext(){
        return position < productos.size();
    }

    public Producto next(){
        if(hasNext()){
            Producto producto = productos.get(position);
            position++;
            return producto;
        }
        return null;
    }
}
