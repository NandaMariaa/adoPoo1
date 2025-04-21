public class InimigoVladmir extends Inimigo {

    public InimigoVladmir() {
        super("Vladmir", 500, 60, new Escudo(0.25f) );
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