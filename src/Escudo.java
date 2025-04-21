public class Escudo {

    float reducaoDeDano; // 0.0 - 1.0

    public Escudo(float reducaoDeDano) {
        this.reducaoDeDano = reducaoDeDano;
    }

    public int danoReduzido(int dano){
        return (int)((float)dano * (1 - Math.clamp(reducaoDeDano, 0.f, 1.f)));
    }
    
}
