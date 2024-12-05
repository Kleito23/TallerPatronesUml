package ec.edu.espol;

public class Cliente {

    public static void main(String[] args) {
        Contexto logistica = new Contexto();

        logistica.setStrategy(new Strat_Automovil());
        logistica.distribuir();

        logistica.setStrategy(new Strat_Ciclista());
        logistica.distribuir();


        logistica.setStrategy(new Strat_Ferrea());
        logistica.distribuir();

        logistica.setStrategy(new Strat_Aerea());
        logistica.distribuir();

        
        logistica.setStrategy(new Strat_Fluvial());
        logistica.distribuir();
    }
}


