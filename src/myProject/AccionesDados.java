package myProject;

public class AccionesDados {
    private Dados dado1,dado2,dado3,dado4,dado5,dado6,dado7,dado8,dado9,dado10;
    private int accionDado,flag;
    private boolean validezAccionDado;
    private int[] carasDadosActivos, carasDadosInactivos, carasDadosUtilizados;

    public AccionesDados() {
        dado1 = new Dados();
        dado2 = new Dados();
        dado3 = new Dados();
        dado4 = new Dados();
        dado5 = new Dados();
        dado6 = new Dados();
        dado7 = new Dados();
        dado8 = new Dados();
        dado9 = new Dados();
        dado10 = new Dados();
        carasDadosActivos = new int[7];
        carasDadosInactivos = new int[10];
        carasDadosUtilizados = new int[10];
        flag = 0;
    }

    public void determinarDados(){
        carasDadosActivos[0] = dado1.getCaraDado();
        carasDadosActivos[1] = dado2.getCaraDado();
        carasDadosActivos[2] = dado3.getCaraDado();
        carasDadosActivos[3] = dado4.getCaraDado();
        carasDadosActivos[4] = dado5.getCaraDado();
        carasDadosActivos[5] = dado6.getCaraDado();
        carasDadosActivos[6] = dado7.getCaraDado();
        carasDadosInactivos[0] = dado8.getCaraDado();
        carasDadosInactivos[1] = dado9.getCaraDado();
        carasDadosInactivos[2] = dado10.getCaraDado();
    }
}
