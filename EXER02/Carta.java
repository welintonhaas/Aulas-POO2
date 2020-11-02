/**
 *
 * @author Welinton
 */

public class Carta {
    
    // Variáveis da Classe Carta
    private String numero;
    private String naipe;
    
    // Método para criar uma carta
    public String carta(String numero,String naipe){
        
        String carta = "";
        
        try {
            this.numero = numero;
            this.naipe = naipe;
            carta = this.numero + " de " + this.naipe;
            
        }catch(Exception e){
            System.err.println("Parâmetros inválidos! " + e.getMessage());
            System.exit(0);
        }
        
        return carta;
    }
    
}
