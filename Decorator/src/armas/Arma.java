package armas;

public abstract class Arma {

    public String tipoDano;

    public String getTipoDano()
    {
        return tipoDano;
    }

    public abstract int dano();

}
