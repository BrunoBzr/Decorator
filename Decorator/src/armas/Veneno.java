package armas;

public class Veneno extends ArmaDecorator{
    public Arma arma;

    public Veneno(Arma arma){
        this.arma = arma;
    }

    @Override
    public String getTipoDano() {
        return this.arma.getTipoDano() + ", de veneno";
    }

    @Override
    public int dano() {
        return this.arma.dano() + 2;
    }
}
