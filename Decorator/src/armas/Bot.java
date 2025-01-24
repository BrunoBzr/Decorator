package armas;
public class Bot {
    public int vida;

    public Bot(int vida){
        this.vida = vida;
    }

    public void tirarVida(int dano){
        vida = vida - dano;
    }
}
