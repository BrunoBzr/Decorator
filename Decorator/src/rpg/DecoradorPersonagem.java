package rpg;

public abstract class DecoradorPersonagem implements Personagem{
    public Personagem personagem;

    public DecoradorPersonagem(Personagem personagem){
        this.personagem = personagem;
    }

    @Override
    public String atacar() {
        return personagem.atacar();
    }
}
