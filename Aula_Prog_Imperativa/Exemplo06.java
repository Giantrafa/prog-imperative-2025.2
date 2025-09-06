import java.util.Scanner;

public class Exemplo06 {
    public static Scanner input = new Scanner(System.in);
    // deixar o usuario definir o limite
    public static final  int valorMaximo = 5;
        public static void main(String [] args){

            int [] A = new int[valorMaximo];
            int [] B = new int[valorMaximo];
            int [] C = new int[valorMaximo];
            
            
            preencherDigitacao(A,B);
            somar(A, B, C);
        }
        //  imrpimir;             
        //  somar

    public static void preencherDigitacao (int[] A, int[] B){
        
        for(int i = 0; i<A.length; i++){
            System.out.println("digite o "+(i+1)+"° numero");
            A[i] = input.nextInt();
        }       
        
        for(int i =0 ; i<B.length; i++){
            System.out.println("digite o "+(i+6)+"° numero");
            B[i] = input.nextInt();
        }
    } 

    public static void somar (int[]A, int[]B ,int[] C ){
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println();
            System.out.println(C[i]);
        }
            

    
    }




}

