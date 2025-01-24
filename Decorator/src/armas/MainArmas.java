package armas;

public class MainArmas {
    public static void main(String[] args) {

        //Dano só da arma
        Bot bot = new Bot(100);
        System.out.println("Vida do bot: " + bot.vida);
        Arma espada = new Espada();
        bot.tirarVida(espada.dano());
        System.out.println("Dano puro da espada: " + espada.dano() + ", Vida do BOT: " + bot.vida);

        //Espada com fogo
        bot.vida = 100;
        System.out.println("Vida do bot: " + bot.vida);
        espada = new Fogo(espada);
        bot.tirarVida(espada.dano());
        System.out.println("Dano puro da espada + dano de fogo: " + espada.dano() + ", Vida do BOT: " + bot.vida);


        bot.vida = 100;
        System.out.println("Vida do bot: " + bot.vida);
        espada = new Veneno(espada);
        bot.tirarVida(espada.dano());
        System.out.println("Dano puro da espada + dano de fogo: " + espada.dano() + ", Vida do BOT: " + bot.vida);

    }
}
