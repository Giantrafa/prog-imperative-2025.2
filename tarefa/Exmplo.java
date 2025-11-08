package tarefa;
import java.util.Scanner;

public class Exmplo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Produto[] produto = new Produto[5];
        int escolha;
        int tam = 0;
        
        do{
            System.out.println("Ecolha");
            System.out.println("1-- coloque o produtos(maximo de 5)");
            System.out.println("2-- imprima os produtos ");
            System.out.println("3-- media dos preço dos produtos ");
            System.out.println("0-- para sair ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    // colocar 1 produto por vez 
                    receber(produto[tam],tam);
                    break;
                case 2:                
                    for(int i=0; i<5; i++){
                       mostrar(produto[i]);
                    }
                    break;
                case 3:
                    // media de preço
                    break;
                case 0 :
                    System.out.println("Saindo");
                    break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
            }         
        }   while (escolha !=0 );         
    }

    public static int receber (Produto al, int tam){
        //ajeitar
        if(tam >= Produto){
            System.out.println("vetor cheio");
            return tam;
        }                 
        System.out.println("Nome do Produto");
        al.titulo = input.nextLine();
        System.out.println("Descrissão");
        al.descricao = input.nextLine();
        System.out.println("Preço do produto");
        al.precoUnitario = input.nextDouble();
        System.out.println("Quanto tem no Estoque");
        al.qtdEstoque = input.nextInt();
        input.nextLine();
        return tam + 1;
    }

    public static void mostrar(Produto al){
        System.out.printf("O Produto %s, Que e %s, Custa %.2f, Tem %d no Estoque.%n", al.titulo , al.descricao, al.precoUnitario, al.qtdEstoque);
    }
}