public class InimigoShaco extends Inimigo {

    public InimigoShaco() {
        super("Shaco", 300, 50, new Escudo(0.05f) );
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Que tal um truque de mágica ?");
    }
    @Override
    public void fraseDeMorte() {
        System.out.println("Nãããããããããããããão");
    }
    
}
