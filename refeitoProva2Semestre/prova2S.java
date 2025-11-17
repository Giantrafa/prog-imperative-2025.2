package refeitoProva2Semestre;
import java.util.Scanner;

public class prova2S {
   public static Scanner input = new Scanner(System.in);
    public static final int QTD = 5;
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[QTD];
        int qtd = 0;

        for (int i = 0; i < QTD; i++) {
            qtd = cadastraPessoa(pessoa, qtd);
        }
        
        imprimirPessoas(pessoa, QTD);
        
        int pos = maisVelhaIMCMagreza(pessoa, qtd);
        System.out.println("Mais velha com IMC < 18.5: " + pos);

        int velho = maisVelho(pessoa, qtd);
        System.out.println("Pessoa mais velha tem idade: " + velho);
    }    

    //1
    public static int cadastraPessoa (Pessoa[]v,int qtd){
        if(qtd >= v.length){
            return qtd;
        }

        v[qtd] = new Pessoa();

        System.out.println("digite seu nome");
        v[qtd].nome = input.nextLine();        
        comparar(v,qtd);
        System.out.println("digite sua idade");
        v[qtd].idade = input.nextInt();
        System.out.println("digite sua peso");
        v[qtd].peso = input.nextDouble();
        System.out.println("digite sua altura");
        v[qtd].altura = input.nextDouble();
        input.nextLine();        
        return ++ qtd ;
    }

    public static void  comparar(Pessoa[]v, int qtd){
        for (int i = 0; i < qtd; i++) {
            if (v[i].nome.equalsIgnoreCase(v[qtd].nome)) {
                System.out.println("Nome já cadastrado. Digite outro nome:");
                v[qtd].nome = input.nextLine();
                comparar(v, qtd); 
                return; 
            }
        }
    }

    //2
    public static void imprimirPessoas(Pessoa[] v, int qtd){
        for (int i = 0; i < qtd; i++) {
            System.out.println(v[i].nome);
            System.out.println(v[i].idade);
            System.out.printf("%.2f %n", v[i].peso);
            System.out.printf("%.2f %n", v[i].altura);
             System.out.printf("IMC da pessoa %.2f %n", imc(v[i]));
        }
    }
 
    public static double imc (Pessoa v){        
        return v.peso / (v.altura*v.altura);
    }

    //3
    public static int maisVelhaIMCMagreza(Pessoa[]v, int qtd){
        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < qtd; i++) {
            if(imc(v[i]) < 18.5 && v[i].idade > maior){
                maior = v[i].idade;
                posicao = i;
            }
        }
        if(maior == 0){
            return -1;
        }
        return posicao;
    }

    //4 X

    //5 quem seria o mais velho
    public static int maisVelho (Pessoa[]v, int qtd){
        int velho = 0;
        for (int i = 0; i < qtd; i++) {
            if(v[i].idade>velho){
                velho = v[i].idade;
            }
        }
        if (velho == 0){
            return -1;
        }
        return velho;        
    }
}
