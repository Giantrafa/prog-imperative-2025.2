//entendi , e limpei o codigo
import java.util.Scanner;

public class Exemplo03 {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int min, max;

    System.out.print("Digite o mínimo do intervalo: ");
    min = input.nextInt();

    do {
      System.out.print("Digite o máximo do intervalo: ");
      max = input.nextInt();
      if (max < min) {
        System.out.println("Digitação inválida! Máximo deve ser maior ou igual a " + min);
      }
    } 
  
    while (max < min);
    impressao(min, max);
    System.out.println("==================================");
  }

  public static void impressao(int min, int max) {
    // compara novamente se min e menor que max e caso nao for altera eles
    if (min > max) {
      int aux = min;
      min = max;
      max = aux;
    }

    //como elesta dentro de |impressao| ele roda junto, e depois vem o ========
    System.out.printf("TODOS OS NÚMEROS ENTRE %d E %d\n", min, max);
    for (int i = min; i <= max; i += 1) {
      System.out.print(i);
      if (i != max) {
        System.out.print(", ");
      }
    }
    // garante que ========, fique na linha de baixo
    System.out.println();
  }
}
