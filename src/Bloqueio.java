public class Bloqueio extends ReducaoDano {

    private int reducao;

    public Bloqueio(int reducao) {
        this.reducao = reducao;
    }
    
    @Override
    public int danoReduzido(int dano){
        if( this.reducao > dano ){
            return 0;
        } else {
            return dano - this.reducao;
        }
    }
    
}
