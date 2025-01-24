package rpg;

public class AtaqueDeGelo extends DecoradorPersonagem{
    public AtaqueDeGelo(Personagem personagem) {
        super(personagem);
    }

    public String atacar() {
        return personagem.atacar() + ", com gelo";
    }
}
