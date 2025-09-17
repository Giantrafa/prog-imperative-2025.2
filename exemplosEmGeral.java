import java.util.Scanner;

public class exemplosEmGeral {
      public static final int QTD = 5;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        int [] vetor1 = new int [QTD];
        int [] vetor2 = new int [QTD];
        int [] vetor3 = new int [QTD];
        
        int valor = input.nextInt(); //valor do busca binaria


    }

    //saida da maneira de marcio
    public static void impressao (int[]V){
        System.out.print("{");                    
        if(V.length>0){                
            System.out.println(" "+V[0]);        
            for(int i=1; i<=V.length; i++){
                System.out.print(", "+V[i]);
            }
        System.out.print(" }");
        }
    }

    //armazena os numeros dos vetor
    public static void armazena (int[]V){
        for(int i=0; i<=QTD; i++){
            System.out.println("digite o "+(i+1)+"° numero do vetor");
            V[i]= input.nextInt();
        }
    }

    // soma de vetores
    public static void soma(int[]N,int[]M,int[]T){
        for(int i=0; i<=QTD; i++){
            T[i]= N[i]+ M[i];
        } 
    }

    //pegar o vetor e inverter ele
    public static void inverso(int[]N,int[]V){
        for(int i=0; i<N.length; i++){
            V[i]= N[N.length-i-1];
        }
    }

    //filtra os numeros do vetor e adiciona eles a V
    public static void impares(int[]N,int[]M,int[]V){
        int index = 0;

        for(int i=0; i<N.length; i++){
            if(N[i]%2==0){
                V[index] = N[i];
                index++;
            }
        }

        for(int i=0; i<M.length; i++){
            if(M[i]%2==1){
                V[index] = M[i];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(V[i]+" ");
            //2,4,7,9
        }
        
        System.out.println("");

        for(int i=0;i<V.length;i++){
            System.out.print(V[i]+" ");
            //2,4,7,9,0
        }        
    }

    // Retorna o índice onde o valorBusca está localizado no vetor, ou -1 caso o valor não seja encontrado.
    public static int buscaBinaria(int[]V,int valorBusca){
        int inicio = 0;
        int fim = V.length -1;

        while(inicio <= fim){
            int meio = (inicio+fim)/2;
            if(V[meio] == valorBusca){
                return meio;
            } else if(V[meio] < valorBusca){
                inicio = meio +1; 
            }else{
            fim = meio -1;
            }
        }
        return -1;
    }    


    public static void insertionSort(int[]V){
        for(int i =1; i<V.length; i++){

        }
    }

    public static void repetidos(){

    }

}