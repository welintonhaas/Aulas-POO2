package ifsc.edu.br.exer2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Map<String, Integer> nt = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
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
                case 1: {
                    System.out.println("Digite o nome da pessoa");
                    sc.nextLine();
                    nome = sc.nextLine();

                    System.out.println("Digite o telefone");
                    telefone = sc.nextInt();
                    
                    nt.put(nome,telefone);
                    System.out.println(nt);
                    break;
                }
                
                case 2: {
                    System.out.println("Digite o nome da pessoa que você deseja buscar");
                    sc.nextLine();
                    nome = sc.nextLine();
                    
                    if (nt.containsKey(nome)){
                        System.out.println(nt.get(nome));
                    }
                    break;
                }
                
                case 3: {
                    System.out.println("Digite uma parte do nome da pessoa que você deseja buscar");
                    sc.nextLine();
                    nome = sc.nextLine();
                    
                    for (String chave : nt.keySet()) {
                        if ( chave.startsWith(nome)){
                            System.out.println(String.format(chave));
                            System.out.println(nt.get(chave));
                        }
                    }
                    break;
                }
                
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
                
            } 
            
        }
                
    }
    
}
