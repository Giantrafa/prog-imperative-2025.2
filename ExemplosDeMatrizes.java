import java.util.Scanner;

public class ExemplosDeMatrizes {
    public static Scanner input = new Scanner(System.in);    
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][2];
           /* 
              0,1              
            0{A,B} 
            1{C,D}
            2{E,F}
          */
        int opcao;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1 - Preencher matriz");
            System.out.println("2 - Buscar número na matriz");
            System.out.println("3 - Somar valores por linha");
            System.out.println("4 - Imprimir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    receber(matriz1);
                    break;
                case 2:
                    System.out.print("Digite o número que deseja buscar: ");
                    int x = input.nextInt();
                    busca(matriz1, x);
                    break;
                case 3:
                    soma(matriz1);
                    break;
                case 4:
                    imprimir(matriz1);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);
    }

    
    // Receber todos os numeros da matriz
    public static void receber(int[][] M) {    
        for (int L = 0; L < M.length; L++) {
            for (int C = 0; C < M[L].length; C++) {
                System.out.println("Digite a matriz ["+(L+1)+"] ["+(C+1)+"]");
                M[L][C] = input.nextInt(); 
            }
        }
    }
    
    // procura em todas as linhas e colunas o Numero X
    public static void busca(int[][]M, int x){
        for (int L = 0; L < M.length; L++) {
            for (int C = 0; C < M[L].length; C++) {
                if(M[L][C] == x){
                    System.out.printf("Achou na Linha %d, Coluna %d \n",L+1,C+1);
                    return;
                }
            }
        }
        System.out.println("nao achou");
    }

    // somar os numeros da mesma linha
    public static void soma(int[][]M){
        for (int L = 0; L < M.length; L++) {
            int soma = 0;
            for (int C = 0; C < M[L].length; C++) {                
                    soma = soma + M[L][C];                
            }
            System.out.printf("Soma da linha %d: %d\n", L + 1, soma);
        }        
    }

    //imprimir os numeros das linhas e colunas 
    public static void imprimir(int[][] M) {           
        for (int L = 0; L < M.length; L++) {
            System.out.print("{ "+M[L][0]);             
            for (int C = 1; C < M[L].length; C++) {
                System.out.print(", "+M[L][C]);                
            }
            System.out.println(" }");             
        }        
    }

}