
package welinton.com.exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while (true){
            int num;
            System.out.println("Digite um número ou 0 para sair");
            num = sc.nextInt();

            if (num == 0){
                break;
            }

            numeros.add(num);
        }        
        numeros.stream().forEach(n -> System.out.print(n.toString() + " "));
        int contagem = numeros.stream().reduce(0, (acum, e) -> acum + e);
        System.out.println("Contagem: "+ contagem);
    }
}
