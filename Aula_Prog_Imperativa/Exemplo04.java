import java.util.Scanner;

public class Exemplo04 {
    public static final int QTD = 4;    
    public static Scanner input = new Scanner(System.in);
    
    int q []; // NÃO USE ESSA MERDA , SOBRE NEHUMA CIRCUNSTÂNCIA , VAI TIRA PONTO COM ISSO , USE SO O EXEMPLO DO V
    
    public static void main (String[] args){

        int[] numeros = new int[QTD];
        int soma = 0;
        double media;

        for(int i = 0; i < numeros.length; i += 1){
            System.out.printf("digite o %d° numero: ",i +1 );
            numeros[i] = input.nextInt();
            soma += numeros[i];
        }

        media = (double) soma / QTD;
        System.out.printf("A media destes %d números é %f\n" ,QTD ,media);

        System.out.println("Impressão de numeros maiores que a média");

        for(int i =0; i< numeros.length; i+=1){
            if(numeros[i]>media){
                System.out.printf("v[%d] = %d\n", i + 1, numeros[i]);
            }            
        }
    }        
}