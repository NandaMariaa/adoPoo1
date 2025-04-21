import java.util.Scanner;

public class Jogador extends Criatura {

    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;
    private Arma[] armas = new Arma[]{ new Faca(), 
                                       new ArcoEFlecha(),
                                       new Pistola(),
                                       new Espada()      };
    
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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha sua arma:");
        int i = 0;
        for( Arma arma : this.armas ){
            i++;
            System.out.println( i + ") " + arma.mensagem() );
        }
        
        int escolha = sc.nextInt();
        
        int danoAtual = this.armas[escolha-1].getDano();
        criatura.tomaDano(danoAtual);
    }

}
