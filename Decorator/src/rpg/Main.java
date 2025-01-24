package rpg;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new PersonagemBase();
        personagem = new AtaqueDeFogo(new AtaqueDeGelo(new AtaqueDeEletricidade(personagem)));

        System.out.println(personagem.atacar()); // Saída: atacar com fogo

    }
}
