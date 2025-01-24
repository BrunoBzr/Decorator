package armas;

public class Espada extends Arma{

    public Espada(){
        this.tipoDano = "Cortante";
    }

    @Override
    public int dano() {
        return 8;
    }
}
