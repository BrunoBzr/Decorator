package rpg;

public class AtaqueDeFogo extends DecoradorPersonagem{
    public AtaqueDeFogo(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String atacar() {
        return personagem.atacar() + ", com fogo";
    }
}
