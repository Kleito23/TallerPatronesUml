package ec.edu.espol.Classes;

import java.util.ArrayList;

import ec.edu.espol.Interfaces.Iterator;

public class Empresa {
    
    public static void main(String[] args) {
        Producto producto1 = new Producto("Producto1", "Disponible");
        Producto producto2 = new Producto("Producto2", "Disponible");
        Producto producto3 = new Producto("Producto3", "Disponible");
        Producto producto4 = new Producto("Producto4", "Disponible");
        Producto producto5 = new Producto("Producto5", "DisponibleT");
        Producto producto6 = new Producto("Producto6", "DisponibleT");
        Producto producto7 = new Producto("Producto7", "Fallido");
        Producto producto8 = new Producto("Producto8", "Fallido");
        Producto producto9 = new Producto("Producto9", "Fallido");
        Producto producto10 = new Producto("Producto10", "Reparacion");
        Producto producto11 = new Producto("Producto11", "Reparacion");

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);
        productos.add(producto11);

        Bodega bodega = new Bodega(productos);

        Iterator iterator1 = bodega.createAProductsIterator();
        System.out.println("Productos Disponibles:");
        while(iterator1.hasNext()){
            Producto producto = (Producto)iterator1.next();
            System.out.println(producto.getNombre());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Productos Disponibles Tienda:");
        Iterator iterator2 = bodega.createAProductsTIterator();
        while(iterator2.hasNext()){
            Producto producto = (Producto)iterator2.next();
            System.out.println(producto.getNombre());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Productos Fallidos:");
        Iterator iterator3 = bodega.createFailureProductsIterator();
        while(iterator3.hasNext()){
            Producto producto = (Producto)iterator3.next();
            System.out.println(producto.getNombre());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Productos en Reparacion:");
        Iterator iterator4 = bodega.createRepairProductsIterator();
        while(iterator4.hasNext()){
            Producto producto = (Producto)iterator4.next();
            System.out.println(producto.getNombre());
        }
    }
    
}
