import java.util.List;
import java.util.Scanner;

public class Jogador extends Criatura {

    private Scanner scan = new Scanner(System.in);
    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;

    private Arma[] armas = new Arma[]{ new ArmaLamina(), 
                                       new ArmaShuriken(),
                                       new ArmaPistola(),
                                       new ArmaEspada()      };
    
    public Jogador(String nome) {
        super(nome, 500);
    }
    
    public Jogador(String nome,int vida){
        super(nome, vida);
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Estou aqui para defender o bem!");
    }
    @Override
    public void fraseDeMorte() {
        System.out.println("Meus amigos vão vingar minha morte.");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        System.out.println("Ataque do " + getNome());
        
        System.out.println("Escolha sua arma:");
        int i = 0;
        for( Arma arma : this.armas ){
            i++;
            System.out.println( i + ") " + arma.mensagem() );
        }
        
        int escolha = scan.nextInt();
        
        int danoAtual = this.armas[escolha-1].getDano();
        criatura.tomaDano(danoAtual);
    }

    public void atacar(List<Criatura> inimigos) {
        System.out.println("quem você ataca agora?");

        for(int i = 0; i < inimigos.size(); i++) {
            System.out.printf("%d - %s (%d de vida)\n", i + 1, inimigos.get(i).getNome(), inimigos.get(i).getVida());
        }

        int idAlvo = Math.clamp(scan.nextInt(), 1, inimigos.size()) - 1;

        fazAtaque(inimigos.get(idAlvo));
    }
}
