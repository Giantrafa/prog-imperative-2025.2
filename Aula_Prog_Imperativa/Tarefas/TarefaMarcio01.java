import java.util.Scanner;

public class TarefaMarcio01 {
    public static Scanner input = new Scanner(System.in);                
    public static void main (String[]args){

        int[] v = new int [10];

        preencherVetorDigitacaoSemRepeticao(v);
    }  
       
    public static void preencherVetorDigitacaoSemRepeticao(int[] v){
        for (int i = 0; i< v.length ; i+=1){
            System.out.println("Digite o "+(i+1)+"° numero do vetor");
            v[i] = input.nextInt();

// vai ver se buscaSequencial, vai receber o retorno |1| caso esteja repetindo o numero , entao aparecera uma mensagen , e ira permitir que o usuario repita
            if(buscaSequencial(v, i, v[i])!=-1){
                System.out.println("Numero repetido, troque ele");                
                i--;
            }
        }             
    }    
/* vai pegar o vetor , onde vai ver todas as posiçoes, sendo o limite |tam| que seria o atual,
   E compara ele com os outros valore, O |x = v[i]| pois esta recebendo os vavlores
        v = int [] v
        i = int tam
        v[i] = int x

 */
    public static int buscaSequencial(int[] v, int tam, int x) {
        for(int i = 0; i<tam; i+=1){
            if(v[i]==x){
                return i;
            }
        }
        return -1;
    }

}