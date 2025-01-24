package armas;

public class Gelo extends ArmaDecorator{

    public Arma arma;

    public Gelo(Arma arma){
        this.arma = arma;
    }

    @Override
    public String getTipoDano() {
        return this.arma.getTipoDano() + ", de gelo";
    }

    @Override
    public int dano() {
        return this.arma.dano() + 4;
    }
}
