
package welinton.com.exer3b;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        //Map -> Stream -> Filter -> Map
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> contatos = new HashMap<>();

        int op;        
        String nome;
        int telefone;
        
        while(true){
            
            System.out.println("Menu de opções");
            System.out.println("1 - Adicionar um contato");
            System.out.println("2 - Encontrar um telefone a partir do nome (exato)");
            System.out.println("3 - Encontrar um telefone a partir do início do nome)");
            System.out.println("0 - SAIR");
            op = sc.nextInt();
            
            if(op == 0) break;
            
            switch (op) {
                case 1 ->  {
                    System.out.println("Digite o nome da pessoa");
                    sc.nextLine();
                    nome = sc.nextLine();

                    System.out.println("Digite o telefone");
                    telefone = sc.nextInt();
                    
                    contatos.put(nome,telefone);
                    System.out.println(contatos);
                }
                
                case 2 ->  {
                    System.out.println("Digite o nome da pessoa que você deseja buscar");
                    sc.nextLine();
                    final String nomeb = sc.nextLine();                    
                            
                    Map<String, Integer> filtrados = 
                        contatos.entrySet().stream()
                                .filter( x -> x.getKey().equals(nomeb))
                                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
                    System.out.println(filtrados);
                }
                
                case 3 ->  {
                    System.out.println("Digite uma parte do nome da pessoa que você deseja buscar");
                    sc.nextLine();
                    final String nomepb = sc.nextLine();
                    
                    Map<String, Integer> filtrados = 
                        contatos.entrySet().stream()
                                .filter( x -> x.getKey().contains(nomepb))
                                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
                    System.out.println(filtrados);
                }
                
                default ->  {
                    System.out.println("Opção inválida");
                }
                
            } 
            
        }
                
    }
}
