public class InimigoMichely extends Inimigo {

    public InimigoMichely() {
        super("Michely", 350, 40, new Escudo(0.1f) );
    }
    @Override
    public void fraseDeApresentacao() {
        System.out.println("Eu vou te matar muamuahuamuaha");
    }
    @Override
    public void fraseDeMorte() {
        System.out.println("Nãããããããããããããão");
    }
    
}
