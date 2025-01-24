package armas;

public class Martelo extends Arma{

    public Martelo(){
        this.tipoDano = "Consussão";
    }

    @Override
    public int dano() {
        return 10;
    }
}
