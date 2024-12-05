package ec.edu.espol;

public class Contexto {
    private Ilogistica strategy;


    public void setStrategy(Ilogistica strategy){
        this.strategy = strategy;
    }

    public void distribuir(){
        if (strategy != null) {
            strategy.distribuir();
        } else {
            System.out.println("No se ha seleccionado una estrategia de distribución.");
        }

    }

}
