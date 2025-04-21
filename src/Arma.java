import java.util.Random;

public class Arma {
    
    private String nome;
    private int dano;
    private int risco;
    private int municao;
    private boolean usaMunicao;

    public Arma(String nome, int dano, int risco) {
        this.nome = nome;
        this.dano = dano;
        this.risco = risco;
    }

    public Arma(String nome, int dano, int risco, int municao) {
        this.nome = nome;
        this.dano = dano;
        this.risco = risco;
        this.municao = municao;
        this.usaMunicao = true;
    }
    
    public String mensagem(){
        if(usaMunicao) {
            return String.format(
               "%s, dano=%d, risco=%d, munição=%d",
               nome,
               dano,
               risco,
               municao
            );
        }

        return String.format(
            "%s, dano=%d, risco=%d",
            nome,
            dano,
            risco
        );
    }
    
    public int getDano(){
        if(usaMunicao && municao <= 0) {
            System.out.printf("%s está sem munição\n", nome);
            return 0;
        }
        if( this.risco == 0 ){
            System.out.println("Acertou!");
            return this.dano;
        }

        if(usaMunicao) {
            municao--;
        }
        
        Random rd = new Random();
        int sorteio = rd.nextInt(0,100);
        if(sorteio < this.risco){
            System.out.println("Ataque Falhou! Errou a mira!");
            return 0;
        } else {
            System.out.println("Acertou!");
            return this.dano;
        }
    }
    
}