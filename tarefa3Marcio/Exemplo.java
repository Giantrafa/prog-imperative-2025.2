package tarefa3Marcio;

import java.util.Scanner;

public class Exemplo {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 3;

    public static void main(String[] args){
        Produto[] produto = new Produto[QTD];
        int escolha;
        int tam = 0;

        do{
            System.out.println("MENU");
            System.out.println("1 cadastrar novo produto");
            System.out.println("2 listar os produtos");
            System.out.println("3 Filtrar por categoria");
            System.out.println("4 Ordenar");
            System.out.println("5 Remover Elemento");
            System.out.println("6 Atualizar preço");
            System.out.println("7 Listagem com subtotal do valor em estoque por categoria ");
            System.out.println("0 Sair");
            System.out.println("Digite Sua Opção");        
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    tam = cadastrar(produto, tam);
                    break;
                case 2:
                    for(int i = 0; i<tam; i++){    
                    imprimir(produto[i]);
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Qual categoria");
                    String modelo = input.nextLine();
                    filtro(produto, tam, modelo);
                    break;
                case 4:    
                    ordernar(produto,tam);
                    break;
                case 5:
                    input.nextLine();
                    tam = remover(produto, tam);
                    break;
                case 6:
                    input.nextLine();
                    atualizarPreco(produto, tam);      
                    break;
                case 7:
                    input.nextLine();
                    listagem(produto, tam);            
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("tente outro numero");
                    break;
            }
        } while(escolha != 0);        
    }

    public static int cadastrar(Produto[] produtos, int tam){
        if(tam >= produtos.length){
            System.out.println("vetor cheio");
            return tam;
        }    

        Produto produto = new Produto();

        input.nextLine();
        System.out.println("Nome do Produto");
        produto.nome = input.nextLine();
        System.out.println("Descrição do Produto");
        produto.descricao = input.nextLine();
        System.out.println("Categoria do Produto");
        produto.categoria = input.nextLine();
        System.out.println("Quantidade no Estoque");
        produto.estoque = input.nextInt();        
        System.out.println("Quantidade Minima Que o Estoque Deve Ter");
        produto.qtdMinima = input.nextInt();    
        System.out.println("Preço do Produto");
        produto.preco = input.nextDouble();    
        input.nextLine();

        produtos[tam] = produto;
        return tam+1;
    }

    public static void imprimir(Produto produto){        
        System.out.println("Nome: "+produto.nome);
        System.out.println("Descrissão: "+produto.descricao);
        System.out.println("Categoria: "+produto.categoria);
        System.out.println("Quantidade em  Estoque: "+produto.estoque);            
        System.out.println("Preço do Produto: "+produto.preco);            
        
    }

    public static void filtro (Produto[]produto, int tam, String exemplo){
        for(int i = 0; i<tam; i++){
            if(produto[i].categoria.equalsIgnoreCase(exemplo)){
                imprimir(produto[i]);
            }
        }
    }

    public static void ordernar (Produto[]produto, int tam){ 
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (produto[j].categoria.compareToIgnoreCase(produto[j + 1].categoria) > 0) {
                    Produto aux = produto[j];
                    produto[j] = produto[j + 1];
                    produto[j + 1] = aux;
                }
            }
        }
    }
    
    
    public static int remover (Produto[]produto, int tam){       
        System.out.println("Digite o nome do produto que você quer remover:");
        String nomes = input.nextLine();

        for (int i = 0; i < tam; i++) {

            if (produto[i].nome.equalsIgnoreCase(nomes)) {            
                for (int j = i; j < tam - 1; j++) {
                    produto[j] = produto[j + 1];
                }
            produto[tam - 1] = null;
            System.out.println("Produto removido!");
            return tam -1;
            }
        }
        System.out.println("Produto não encontrado.");
        return tam;
    }
    
    
    public static void atualizarPreco (Produto[]produto, int tam){ //6
        System.out.println("Qual o produto que você irá trocar o preço?");
        String nome = input.nextLine();

        for (int i = 0; i < tam; i++) {
            if (produto[i].nome.equalsIgnoreCase(nome)) {
                System.out.println("Digite o novo preço:");
                double novoPreco = input.nextDouble();
                input.nextLine();
                produto[i].preco = novoPreco;
                System.out.println("Preço atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
    
    
    public static double listagem(Produto[] produto, int tam) {

    System.out.println("Digite a categoria:");
    String categoriaBuscada = input.nextLine();

    double subtotal = 0;
    boolean achou = false;

    for (int i = 0; i < tam; i++) {
        if (produto[i].categoria.equalsIgnoreCase(categoriaBuscada)) {

            System.out.println("Nome: " + produto[i].nome);
            System.out.println("Preço: " + produto[i].preco);
            System.out.println("Quantidade: " + produto[i].estoque);
            System.out.println("------------------------");

            subtotal += produto[i].preco * produto[i].estoque;
            achou = true;
        }
    }

    if (!achou) {
        System.out.println("Nenhum produto encontrado para esta categoria.");
        return 0;
    }

    System.out.println("Subtotal da categoria \"" + categoriaBuscada + "\": R$ " + subtotal);
    return subtotal;
    }    
}