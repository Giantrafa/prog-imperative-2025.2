import java.util.Scanner;

//nao sei como ele quer
public class provaSementrePassadoMarcio {
    public static Scanner input = new Scanner (System.in);
    public static final int QTD = 5;
    public static void main(String[]args){
        int [] vetor1 = new int[QTD] ;
        int [] vetor2 = new int[QTD] ;
        int [] vetorResult = new int[QTD] ;        
        int data;
        
        do {            
            System.out.println("Digite o numero 1 para: digitar 100 numeros inteiros para 2 vetores  ");                          
            System.out.println("Digite o numero 2 para: mostra os 100 numeros inteiros ");            
            System.out.println("Digite o numero 3 para: saber se tem um numero expecifico ");
            System.out.println("Digite o numero 4 para: mostra os 100 numeros começando do Fim ");    
            System.out.println("Digite o numero 5 para: somar  os 2 vetores");
            System.out.println("Digite o numero 6 para: pegar os numeros par do primeiro vetor e impares do segundo vetor");
            System.out.println("Digite o numero 0 para fechar o programa");            
        
            data = input.nextInt();

            switch(data){
                case 1: 
                armazena(vetor1);                
                break;
                
                case 2: 
                impressao(vetor1);                
                break;
                
                case 3:
                System.out.println("qual o numero encontrar");
                int busca = input.nextInt();
                int posicao = buscabinaria(vetor1,busca);
                System.out.println("na posiçao "+(posicao+1));                
                break;

                case 4:
                inverso(vetor1,vetor2);
                impressao(vetor2);
                break;

                case 5:            
                soma(vetor1,vetor2,vetorResult);
                break;
                    //pesquizar
                case 6:
                filtro(vetor1,vetor2,vetorResult);                
                break;

                case 0 :
                System.out.println("Encerrando");
                break;

                default:
                System.out.println("Opçao invalida tente de novo");
            }
        }
        while(data != 0);            
    }        
    
    
    
    public static void armazena(int[]V){
        for(int i = 0 ;i<V.length;i++){
            System.out.println("Digite o "+(i+1)+"° do vetor");
            V[i]= input.nextInt();
        }
    }

    public static void impressao(int[]V){
        System.out.print("{");
        if (V.length>0){
            System.out.print(" "+V[0]);
            for(int i=1; i<V.length; i++){
                System.out.print(", "+V[i]);                
            }
            System.out.println(" }");
        }        
    }
    
    public static int buscabinaria(int[]V,int alvo){        
        int inicio = 0;
        int fim = V.length -1;

        while(inicio<=fim){
            int meio = (inicio + fim)/2;
            if (V[meio]== alvo){
                return meio;
            }else if (V[meio]< alvo){
                inicio = meio + 1; 
            }else{
                fim = meio - 1;
            }
        }
        return -1;        
    }

    public static void inverso(int[]V,int[]N){
        for(int i=0;i<V.length;i++){
            N[i] = V[V.length - i - 1];
        }        
    }

    public static void soma(int[]V, int[]N, int[]M){
        for(int i = 0; i<V.length; i++){
            M[i] = V[i]+ N[N.length-i-1];
        }
          System.out.print("{");
        if (M.length>0){
            System.out.print(" "+V[0]);
            for(int i=1; i<M.length; i++){
                System.out.print(", "+M[i]);                
            }
            System.out.println(" }");
        }
    }

    public static void filtro(int[]V,int[]N,int[]M){
        int index = 0; 
        for (int i=0;i<V.length;i++){
            if (V[i]%2 == 0){
                M[index] = V[i];
                index++;
            }
        }

         for (int i=0;i<N.length;i++){
            if (N[i]%2 == 1){
                M[index] = N[i];
                index++;
            }
        }

        System.out.print("{");
        if (M.length>0){
            System.out.print(" "+M[0]);
            for(int i=1; i<M.length; i++){
                System.out.print(", "+M[i]);                
            }
            System.out.println(" }");
        }
    }

}