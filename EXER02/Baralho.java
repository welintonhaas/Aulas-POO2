import java.util.Random;

/**
 *
 * @author Welinton
 */

public class Baralho extends Carta{
    
    // Variáveis da Classe Baralho
    String[] numeros;
    String[] naipes;
    String cartaBaralho;
    
    // Contrutor da Classe baralho
    // Armazena todas as cartas disponíveis no baralho
    public Baralho() {
        
        // Números das Cartas do baralho
        this.numeros = new String[]{ 
            "Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei" 
        };
        
        // Naipes das Cartas do baralho
        this.naipes = new String[]{ 
            "Copas","Espadas","Ouro","Paus"
        }; 
        
    }
    
    
    // Método para gerar uma carta randomicamente
    public String gerarCarta(){
        
        String num = "";
        String np  = "";
        
        Random aleatorio = new Random();
        
        try{
            num = this.getNumero(aleatorio.nextInt(13));
        }catch (Exception e){
            System.err.print("Não foi possível gerar um número de carta aleatório");
            System.exit(0);
        }
        
        try{
            np = this.getNaipe(aleatorio.nextInt(4));
        }catch(Exception e){
            System.err.print("Não foi possível gerar um naipe de carta aleatório");
            System.exit(0);
        }
        
        try{
            this.cartaBaralho = "Carta Gerada: " + this.carta(num, np);
        }catch(Exception e){
            System.err.println("Não foi possível gerar a carta!");
            System.exit(0);
        }
        
        return this.cartaBaralho;
    }
    
    
    // Método para obeter o número da carta baseado na posição informada
    public String getNumero(int pos){
        
        String numero = "";
        
        try{
            numero = this.numeros[pos];
        }catch(Exception e){
            System.err.println("O número informado não existe no baralho!");
            System.exit(0);
        }
        
        return numero;
    }
    
    
    // Método para obeter o naipe da carta baseado na posição informada
    public String getNaipe(int pos){
        
        String naipe = "";
        
        try{
            naipe = this.naipes[pos];
        }catch(Exception e){
            System.err.println("O naipe não existe no baralho!");
            System.exit(0);
        }
        
        return naipe;
    }
    
    
    // Método para obeter o número de cartas do baralho
    public int getNumCartas(){
        
        int numCartas = 0;
        
        try{
            numCartas = this.numeros.length * this.naipes.length;
        }catch(Exception e){
            System.err.println("Não foi possível calcular o número de cartas do baralho!");
            System.exit(0);
        }
        
        return numCartas;
    }
    
    // Método para listar todas cartas do baralho
    public void ListarCartas(){
        
        for (int i = 0; i <= this.numeros.length; i++){
            for (int j = 0; j <= this.naipes.length; j++){        
                this.carta(this.getNumero(i), this.getNaipe(j));    
            }
        }
        
    }
    
}
