package rpg;

public class PersonagemBase implements Personagem{

    public String ataque = "Ataque";

    @Override
    public String atacar() {
        return ataque;
    }
}
