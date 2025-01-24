package armas;

public class MainArmas {
    public static void main(String[] args) {

        //Dano só da arma
        Bot bot = new Bot(200);
        Arma espada = new Espada();
        bot.tirarVida(espada.dano());
        System.out.println("Dano puro da espada: " + espada.dano() + ", Vida do BOT: " + bot.vida);

        //Espada com fogo
        espada = new Fogo(espada);
        bot.tirarVida(espada.dano());
        System.out.println("Dano puro da espada + dano de fogo: " + espada.dano() + ", Vida do BOT: " + bot.vida);

    }
}
