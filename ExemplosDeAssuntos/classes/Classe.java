// ele esta dentro de 2 pastas , por isso que esta assim
package ExemplosDeAssuntos.classes;

// ele so presisa importa, caso o Aluno.java estivesse em outro lugar
//import ExemplosDeAssuntos.classes.Aluno;

import java.util.Scanner;

public class Classe {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 5; 
    public static void main(String[] args) {
        int tam = 0;

        //Declaro um novo aluno q vai ter as caracteristicas de Aluno a Classe
        Aluno aluno = new Aluno();

        // aluno2 vai apontar para o MESMO objeto que "aluno"
        Aluno aluno2 = aluno;    
                
        // Cria um vetor de alunos com capacidade QTD (inicialmente só tem espaços "vazios"
        Aluno[] alunog = new Aluno[QTD];
        
        //Em um menu, esse método aumentaria "tam" a cada novo cadastro
        tam = preEncher(alunog, tam);                                
    }

     //para usar ele com vetor e so criar um loop chamando ele    
    public static void imprimir(Aluno al){
        System.out.printf("(%s, %d anos, %.1f, %.1f)", al.nome, al.idade, al.nota1, al.nota2);     
    }

    //para usar ele com vetor e so criar um loop chamando ele    
    public static double calcularMedia (Aluno al){
        return (al.nota1*2 + al.nota2*3)/5;
    }
    

    public static int preEncher (Aluno[] al, int tam){        
        if(tam >= al.length){
            return tam;
        } 

        al[tam] = new Aluno();

        System.out.println("Digite seu nome");
        al[tam].nome = input.nextLine();
        
        System.out.println("Digite sua idade");
        al[tam].idade = input.nextInt();
        input.nextLine(); // limpar ENTER

        System.out.println("digite sua 1° nota");
        al[tam].nota1 = input.nextDouble();
        input.nextLine(); // limpar ENTER

        System.out.println("Digite sua 2° nota");
        al[tam].nota2 = input.nextDouble();
        input.nextLine(); // limpar ENTER
        return tam+1;
    }
    
    //usaria IsertinSort para organiza por nome dos alunos
    public static void insertionSort(Aluno[]v, int tam){
        for(int i=1; i<tam; i++){
            Aluno x = v[i];
            int j = i-1;
            while(j>= 0 && x.nome.compareTo(v[j].nome)<0){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = x;
        }
    }

    //BubleSort tambem organizando os alunos por nome
    public static void bubbleSortNome(Aluno[] v, int tam) {
        for (int i = 0; i <=tam - 1; i++) {                    
            for (int j = 0; j <tam-1-i; j++) {            
            
                if (v[j].nome.compareToIgnoreCase(v[j+1].nome)>0){                                
                    Aluno temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

}
