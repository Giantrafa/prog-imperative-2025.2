//entendi 

import java.util.Scanner;

public class Exemplo04 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
     
        System.out.print("Digite o preço antigo: ");
        int precoAntigo = input.nextInt();
    
        System.out.print("Digite o preço novo: ");
        int precoNovo = input.nextInt();
    
        double aumento = calcularAumentoPrecoPercentual(precoAntigo, precoNovo);
        System.out.printf("O aumento foi de %.1f%%\n", aumento);
    }


    public static double calcularAumentoPrecoPercentual(double precoAntigo, double novoPreco){
        if (precoAntigo == 0) {
            return 0.0;
        }
        return 100.0 * (novoPreco - precoAntigo) / precoAntigo;
    }
}