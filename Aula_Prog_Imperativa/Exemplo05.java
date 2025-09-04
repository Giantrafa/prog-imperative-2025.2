import java.util.Scanner;

public class Exemplo05 {
    //define o vetor publico
    public static final int QTD = 4;    
    public static Scanner input = new Scanner(System.in);
    
    int q []; // NÃO coloque o simbolo de array/vetor apos o nome, so coloque antes
    
    public static void main (String[] args){

        int[] numeros = new int[QTD];
        int soma = 0;
        double media;

        for(int i = 0; i < numeros.length; i += 1){
            System.out.printf("digite o" + (i+1) + "° numero:");
            numeros[i] = input.nextInt();
//vai pegar os valores de |int[]| numeros, e vai somar eles se tornando |soma| , ja que estao detro do |for|
            soma += numeros[i];
        }
// vai pegar a soma dos valores transforma em double e |QTd| vai ser a quantidade de espassos do vetor
        media = (double) soma / QTD;
        System.out.printf("A media destes %d números é %f\n" ,QTD ,media);

        

        System.out.println("Impressão de numeros maiores que a média");        
        for(int i =0; i< numeros.length; i+=1){
// vai pegar a media de compara com os valores do vetor e dizer quem esta maior que a media
            if(numeros[i]>media){
                System.out.printf("v[%d] = %d\n", i + 1, numeros[i]);
            }            
        }
    }        
}