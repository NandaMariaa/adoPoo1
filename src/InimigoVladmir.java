public class InimigoVladmir extends Inimigo {

    public InimigoVladmir() {
        super("Vladmir", 500, 60, new Bloqueio(15) );
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