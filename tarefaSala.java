import java.util.Scanner;

public class tarefaSala {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 30;
    
    public static void main(String[] args){
        int [] conjuntoA =new int [QTD];
        int [] conjuntoB =new int [QTD];
        
        System.out.println("insira os numeros do 1° vetor");
        receber(conjuntoA);
        System.out.println("insira os numeros do 2° vetor");
        receber(conjuntoB);

        imprimir(conjuntoA);
        imprimir(conjuntoB);

    }
    // receber apenas 1 elemento por vez, estararia certo ????
    public static void receber (int[]V){        
        int limi = 0;
        while (limi<=QTD) {
            for(int i = 0;i<=V.length;i++){            
                V[i] = input.nextInt();
                limi++;
                // condiçao de saida if(V[i])
            }                    
        }
    }

    public static void imprimir(int[]V){
        System.out.print("{ ");
        if(V.length > 0){
            System.out.print("V[0]");
            for(int i=1; i<V.length; i++){
                System.out.print(", "+V[i]);
            }
            System.out.print(" }");
        }
    }

    public static int buscaBinaria (int[]V, int T){
        int inicio = 0;
        int fim = V.length-1;

        while (inicio < fim){
            int meio = (inicio + fim)/2;
            if(meio == T){
                return meio;

            }else if(V[meio] < T){
                inicio = meio + 1;
            }else{
                fim = meio -1;
            }
        }
    return-1;
    }


}




