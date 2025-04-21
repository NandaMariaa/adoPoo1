import java.util.ArrayList;
import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        
        Jogador jogador = new Jogador("Luiz",600);
        Batalha.setJogador(jogador);

        Batalha b = new Batalha(
            new ArrayList<>(Arrays.asList(
                new InimigoMichely(),
                new InimigoShaco()
            )),
            null
        );

        b.iniciarBatalha();
    }
}
