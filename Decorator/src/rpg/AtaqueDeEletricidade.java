package rpg;

public class AtaqueDeEletricidade extends DecoradorPersonagem{
    public AtaqueDeEletricidade(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String atacar() {
        return super.atacar() + " com eletricidade";
    }
}
