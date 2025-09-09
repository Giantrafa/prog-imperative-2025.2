import java.util.Scanner;

public class Exemplo06 {
    public static Scanner input = new Scanner(System.in);
    // deixar o usuario definir o limite ?
    public static final  int valorMaximo = 5;
        public static void main(String [] args){

            int [] A = new int[valorMaximo];
            int [] B = new int[valorMaximo];
            int [] C = new int[valorMaximo];
            
            
            System.out.println("Digite os numeros do 1° vetor");
            preencherDigitacao(A);
            
            System.out.println();
            System.out.println("Digite os numeros do 2° vetor");
            preencherDigitacao(B);
            
            somar(A, B, C);
            
            System.out.println("Numeros do 1° vetor");
            impressao(A);

            System.out.println();
            System.out.println("Numeros do 2° vetor");
            impressao(B);
            
            System.out.println();
            System.out.println("Soma dos 2 vetores");
            impressao(C);
        }


    public static void preencherDigitacao (int[] V){
        for(int i = 0; i<V.length; i++){
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            V[i] = input.nextInt();
        }       
    } 


    public static void somar (int[]A, int[]B ,int[] C ){
        for (int i = 0; i < C.length; i++) {
            C[i]= A[i] + B[i];
        }
    }       

    public static void impressao (int[] V){
        if (V.length > 0){
            System.out.print(" "+V[0]);
        }
        for ( int i =1;  i< V.length; i++ ){
            System.out.print(", " + V[i]);
        }
    }
    
}