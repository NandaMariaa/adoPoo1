import java.util.ArrayList;
import java.util.List;

public class Batalha {
    private static Jogador jogador;
    private Arma recompensa;

    List<Criatura> inimigos;

    public Batalha(List<Criatura> inimigos, Arma recompensa) {
        this.inimigos = inimigos;
        this.recompensa = recompensa;
    }

    public static void setJogador(Jogador jogador) {
        Batalha.jogador = jogador;
    }

    public boolean iniciarBatalha() {
        jogador.curarVida();

        while(jogador.getVida() > 0 && inimigos.size() > 0) {
            ArrayList<Criatura> inimigosParaRemover = new ArrayList<Criatura>();

            jogador.atacar(inimigos);

            for(Criatura c : inimigos) {
                if(c.getVida() > 0) {
                    c.fazAtaque(jogador);
                }
                else {
                    inimigosParaRemover.add(c);
                }
            }

            for(Criatura c : inimigosParaRemover) {
                inimigos.remove(c);
            }

            jogador.mostraVida();
            for(Criatura c : inimigos) {
                c.mostraVida();
            }


        }

        return jogador.getVida() > 0;
    }
}
