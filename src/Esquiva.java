import java.util.Random;

public class Esquiva extends ReducaoDano {

    private int chance;
    
    Esquiva(int chance){
        this.chance = chance;
    }
    
    @Override
    public int danoReduzido(int dano){
        Random rd = new Random();
        
        int sorteio = rd.nextInt(100);
        
        if( sorteio < this.chance ){
            System.out.println("Dano falhou!");
            return 0;
        } else {
            return dano;
        }
    }
    
}
