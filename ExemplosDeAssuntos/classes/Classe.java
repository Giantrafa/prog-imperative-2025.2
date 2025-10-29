// ele esta dentro de 2 pastas , por isso que esta assim
package ExemplosDeAssuntos.classes;
// ele esta imortando os dados da classe na outra pasta
import ExemplosDeAssuntos.classes.Aluno;
import java.util.Scanner;

public class Classe {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Declaro um novo aluno q vai ter as caracteristicas de Aluno
        Aluno aluno = new Aluno();
        // aluno2 vai apontar para o MESMO objeto que 'aluno'
        Aluno aluno2 = aluno;    
        // aluno3 ira ter as mesmas caracteristicas mas não tera os mesmos dados
        Aluno aluno3 = new Aluno();    

        receber(aluno);
        imprimir(aluno);
        
        double media = calcularMedia(aluno);
        System.out.println("A média do aluno é "+ media);
    }

    public static void receber(Aluno al){
        System.out.println("Digite seu nome");
        al.nome = input.nextLine();
        System.out.println("Digite sua idade");
        al.idade = input.nextInt();
        System.out.println("digite sua 1° nota");
        al.nota1 = input.nextDouble();
        System.out.println("Digite sua 2° nota");
        al.nota2 = input.nextDouble();
    }

    public static void imprimir(Aluno al){
        System.out.printf("(%s, %d anos, %.1f, %.1f)", al.nome, al.idade, al.nota1, al.nota2);     
    }


    public static double calcularMedia (Aluno al){
        return (al.nota1*2 + al.nota2*3)/5;
    }

}
