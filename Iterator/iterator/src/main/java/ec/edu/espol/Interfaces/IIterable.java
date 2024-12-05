package ec.edu.espol.Interfaces;

public interface IIterable {
    public Iterator createAProductsIterator();
    public Iterator createAProductsTIterator();
    public Iterator createFailureProductsIterator();
    public Iterator createRepairProductsIterator();
}
