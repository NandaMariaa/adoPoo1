public class Teste {

    public static void main(String[] args) {
        
        Criatura jogador = new Jogador("Luiz",600);
        Criatura inimigo = new InimigoShaco();
        
        System.out.println("Bem vindos a grande batalha!");
        jogador.fraseDeApresentacao();
        inimigo.fraseDeApresentacao();
        while(true){
            jogador.fazAtaque(inimigo);
            if(inimigo.estaVivo()){
                inimigo.fazAtaque(jogador);
            }
            
            jogador.mostraVida();
            inimigo.mostraVida();
            
            if(!jogador.estaVivo()){
                jogador.fraseDeMorte();
                System.out.println(inimigo.getNome() + " venceu!");
                break;
            }
            
            if(!inimigo.estaVivo()){
                inimigo.fraseDeMorte();
                System.out.println(jogador.getNome() + " venceu!");
                break;
            }
        }
        
        
    }
}
