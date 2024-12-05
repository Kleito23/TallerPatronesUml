package ec.edu.espol.Classes;

import java.util.ArrayList;
import java.util.Collection;

import ec.edu.espol.Interfaces.IIterable;
import ec.edu.espol.Interfaces.Iterator;

public class Bodega implements IIterable{
    private Collection<Producto> productos;

    public Bodega(ArrayList<Producto> productos){
        this.productos = productos;
    }

    @Override
    public Iterator createAProductsIterator() {
        return new BodegaIterator(this, "Disponible");
    }

    @Override
    public Iterator createAProductsTIterator() {
        return new BodegaIterator(this, "DisponibleT");
    }

    @Override
    public Iterator createFailureProductsIterator() {
        return new BodegaIterator(this,"Fallido");
    }

    @Override
    public Iterator createRepairProductsIterator() {
        return new BodegaIterator(this, "Reparacion");
    }

    public ArrayList<Producto> getDisponibles(){
    ArrayList<Producto> disponibles = new ArrayList<>();
        for(Producto producto : productos){
            if(producto.getEstado().equals("Disponible")){
                disponibles.add(producto);
            }
        }
        return disponibles;
    }

    public ArrayList<Producto> getDisponiblesT(){
        ArrayList<Producto> disponiblesT = new ArrayList<>();
        for(Producto producto : productos){
            if(producto.getEstado().equals("DisponibleT")){
                disponiblesT.add(producto);
            }
        }
        return disponiblesT;
    }

    public ArrayList<Producto> getFailure(){
        ArrayList<Producto> failure = new ArrayList<>();
        for(Producto producto : productos){
            if(producto.getEstado().equals("Fallido")){
                failure.add(producto);
            }
        }
        return failure;
    }

    public ArrayList<Producto> getRepair(){
        ArrayList<Producto> repair = new ArrayList<>();
        for(Producto producto : productos){
            if(producto.getEstado().equals("Reparacion")){
                repair.add(producto);
            }
        }
        return repair;
    }
}
