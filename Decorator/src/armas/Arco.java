package armas;

public class Arco extends Arma{

    public Arco(){
        this.tipoDano = "Pefurante";
    }

    @Override
    public int dano() {
        return 6;
    }
}
