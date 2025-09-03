import java.util.Scanner;

public class Tarefa01 {
    public static Scanner input = new Scanner(System.in);        
    public static void main (String[]args){
        
        //vetor de capacidade 10
       int[] v = new int [10];
        
       // ira receber os 10 numeros
       for (int i = 1; i<=10 ; i++){
            System.out.println("Digite o "+i+"° "+"numero");
        }
       
        /* analizar esse com calma
        boolean temRepetido = false;

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    temRepetido = true;
                    break;
                }
            }
            if (temRepetido) break;
        }
         */

    
    }
}