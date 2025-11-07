package classeVetor;
import java.util.Scanner;

public class Exemplo {
        public static Scanner input = new Scanner(System.in);
    public static final int QTD = 2;
    public static void main(String[]args){
        Aluno[] estudante = new Aluno[QTD];

        
        for(int i=0; i<estudante.length; i++){
            System.out.println("Digite os dados do "+(i+1)+"° Aluno(a)");
            estudante[i] = new Aluno();
            receber(estudante[i]);
        }
        
        for(int j=0; j<estudante.length; j++){
            imprimir(estudante[j]);
        }          
    }    

    public static void receber(Aluno l){
        System.out.println("digite seu nome");
        l.nome = input.nextLine();        
        System.out.println("digite sua idade");
        l.idade = input.nextInt();
        System.out.println("digite seu ano do colegio");
        l.semestre = input.nextInt();
        input.nextLine();          
    }

    public static void imprimir(Aluno q){
        System.out.println(q.nome);
        System.out.println(q.idade);
        System.out.println(q.semestre);
        System.out.println("");        
    }
}