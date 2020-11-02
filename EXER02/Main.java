/**
 *
 * @author Welinton
 */

public class Main {
    
    public static void main(String[] args) {

        // Cria o objeto Baralho
        Baralho baralho = new Baralho();
        
        // Gera uma carta aleatória
        String carta = baralho.gerarCarta();
        
        // Obtem o número de cartas do baralho
        int numCartas = baralho.getNumCartas();
        
        // Exibe a carta gerada
        System.out.println(carta);
        
        if (numCartas != 0 ){
            System.out.println("O baralho tem " + numCartas + " Cartas");
        }else {
            System.out.print("Não foi possível gerar a carta!");
        }
        
        // Lista de todas as cartas do baralho
        baralho.ListarCartas(); // < - GOSTARIA DE UMA EXPLICAÇÃO EM AULA DO PORQUE ISSO NÃO FUNCIONOU... NÃO CONSEGUI ENTENDER...
        
    }
        
}
