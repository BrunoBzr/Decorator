package armas;
public class Fogo extends ArmaDecorator{

    public Arma arma;

    public Fogo(Arma arma){
        this.arma = arma;
    }

    @Override
    public String getTipoDano() {
        return this.arma.getTipoDano() + ", de fogo";
    }

    @Override
    public int dano() {
        return this.arma.dano() + 6;
    }
}
