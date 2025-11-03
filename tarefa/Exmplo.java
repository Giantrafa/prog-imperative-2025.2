package tarefa;
import java.util.Scanner;

public class Exmplo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();

    System.out.println("Digite do Produto 1");
    receber(produto1); 

    System.out.println("");
    System.out.println("Digite do Produto 2");
    receber(produto2);

    mostrar(produto1);
    mostrar(produto2);
        
    
}

    public static void receber (Produto al){
        System.out.println("Nome do Produto");
        al.titulo = input.nextLine();
        System.out.println("Descrissão");
        al.descricao = input.nextLine();
        System.out.println("Preço do produto");
        al.precoUnitario = input.nextDouble();
        System.out.println("Quanto tem no Estoque");
        al.qtdEstoque = input.nextInt();
        input.nextLine();
    }

    public static void mostrar(Produto al){
        System.out.printf("O Produto %s, Que e %s, Custa %.2f, Tem %d no Estoque.%n", al.titulo , al.descricao, al.precoUnitario, al.qtdEstoque);
    }
}
