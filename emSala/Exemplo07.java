import java.util.Scanner;

public class Exemplo07 {
    public static final int QTD = 5;
    public static Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        int[] vetor1 = new int[QTD];
        int[] vetor2 = new int[QTD];
        int[] somaVetor = new int [QTD];
        /* 
        boolean numeros1Preenchido = false;
        boolean numeros2Preenchido = false;
        boolean vetorSomaPreenchido = false; 
        ele usa apenas o *numeros1Preenchido* para saber se imprimir o *vetor1* e valido
        depois saber melhor de BOOLEAN
        */
        int tam2 = 0;
        int opcao ;

        do{
                System.out.println("MENU");
                System.out.println("1 - Preencher o vetor 1");
                System.out.println("2 - Imprimir o vetor 1");
                System.out.println("3 - Inserir 1 número no vetor 2");
                System.out.println("4 - Imprimir o vetor 2");
                System.out.println("5 - Gerar o vetor soma");
                System.out.println("6 - Imprimir o vetor soma");
                System.out.println("Digite sua opção (0 p/ finalizar): ");
                opcao= input.nextInt();

                switch(opcao){
                    case 1:
                        preencherTudo(vetor1);
                        //numeros1Preenchido = true;
                        break;

                    case 2:
                        // if (numeros1Preenchido)
                        imprimir(vetor1,vetor1.length);
                        break;

                    case 3:
                        tam2 = preencher(vetor2, tam2);
                        break;
                    
                    case 4:
                        imprimir(vetor2,tam2);
                        break;
                    
                    case 5:
                        soma(vetor1,vetor2,somaVetor);
                        break;
                    case 6:
                        imprimir(somaVetor, somaVetor.length);
                        break;
                    
                    default:
                        if(opcao!=0){
                            System.out.println("digite outra opção");
                        }
                }
        } while(opcao!=0);
    }
    
    public static void preencherTudo (int []V){
        for(int i=0; i<V.length;i++){
             System.out.print("Digite o " + (i + 1) + "º valor: "); // obrigatorio ?
            V[i]= input.nextInt();
        }
    }


    public static void imprimir(int[]V, int tam){
        System.out.println("{ ");
        if(tam>=0){
            System.out.println(V[0]);
        }
        for(int i = 1; i<tam; i++){
            System.out.println(", "+V[i]);
        }
        System.out.println(" }");
    }        

    public static int preencher(int[]V, int tam){
        if(tam > V.length){
            System.out.println("vetor cheio");
            return tam;
        }
        System.out.print("Digite o " + (tam + 1) + "º valor: "); // obrigatorio ?
        V[tam]= input.nextInt();
        return tam+1;
    }

    public static void soma (int[]V, int[]N, int[]M){
        if (V.length != N.length || V.length != M.length) { 
            System.out.println("Impossível realizar esta soma, todos os vetores devem ser do mesmo tamanho!");
            return;
        }                
        for(int i =0; i<V.length; i++){
            M[i] = V[i] + N[i];
        }
    }
}

