
package ifsc.edu.br.exer1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args){
        
        Set<Integer> inteiros;
        inteiros = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int num;        
        
        while(true){
            
            System.out.println("Digite um numero ou Digite 0 para sair");
            num = sc.nextInt();
            
            if (num == 0){
                break;
            }
            
            inteiros.add(num);
            
        }
        
        // Imprimindo a Lista normal - em array
        System.out.println(inteiros);
        
        // Usando Iterator
        Iterator<Integer> iterator = inteiros.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }
        
    }
    
}
