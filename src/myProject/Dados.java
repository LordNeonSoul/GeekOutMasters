package myProject;

import java.util.Random;

public class Dados {
    private int caraDado;

    /**
     * 1 = Meeple
     * 2 = Cohete
     * 3 = Dragón
     * 4 = Supherhéroe
     * 5 = Corazón
     * 6 = 42
     **/

    public int getCaraDado(){
        Random aleatorio = new Random();
        caraDado = aleatorio.nextInt(6)+1;
        return caraDado;
    }
}
