package tarefa;
import java.util.Scanner;

public class Exmplo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Produto[] produto = new Produto[5];
        int escolha;        
        
        do{
            System.out.println("Ecolha");
            System.out.println("1-- coloque o produtos");
            System.out.println("2-- imprima os produtos ");
            System.out.println("3-- media dos preço dos produtos ");
            System.out.println("0-- para sair ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    for(int i=0; i < 5; i++){
                        produto[i] = new Produto();
                        receber(produto[i]);
                    }                     
                    break;
                case 2:                
                    for(int i=0; i < 5; i++){
                       mostrar(produto[i]);
                    }
                    break;
                case 3:                    
                    double media = mediapreco(produto);
                    System.out.println("Média dos preços: " + media);
                    break;                    
                case 0 :
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }         
        }   while (escolha !=0 );         
    }

    public static void receber(Produto produto){        
        System.out.println("Nome do Produto");                
        produto.titulo = input.nextLine();
        System.out.println("Descrição");
        produto.descricao = input.nextLine();
        System.out.println("Preço do produto");
        produto.precoUnitario = input.nextDouble();
        System.out.println("Quanto tem no Estoque");
        produto.qtdEstoque = input.nextInt();
        input.nextLine(); // para remover o ENTER da digitação do int referente a qtdEstoque
   }
    

    public static void mostrar(Produto produto){
        System.out.printf("O Produto %s, Que e %s, Custa %.2f, Tem %d no Estoque.%n", produto.titulo , produto.descricao, produto.precoUnitario, produto.qtdEstoque);
    }

    public static double mediapreco(Produto[] produto) {
        double soma = 0;
        for (int i = 0; i < produto.length; i++) {
            soma += produto[i].precoUnitario;            
        }        
        return soma / produto.length;
    }
}

    /* um por um
    public static int receber(Produto[] produtos, int tam){
        if(tam >= produtos.length){
            System.out.println("Vetor cheio");
            return tam;
        }
        Produto produto = new Produto();
        System.out.println("Nome do Produto");
        input.nextLine(); // evitar erro
        produto.titulo = input.nextLine();
        System.out.println("Descrição");
        produto.descricao = input.nextLine();
        System.out.println("Preço do produto");
        produto.precoUnitario = input.nextDouble();
        System.out.println("Quanto tem no Estoque");
        produto.qtdEstoque = input.nextInt();
        input.nextLine();// evitar erro

        produtos[tam] = produto;
        return tam + 1;
    } 
    */