import java.util.Scanner;

public class exemplosEmGeral {
 public static Scanner input = new Scanner(System.in);
    public static final int QTD = 30;

    public static void main(String[]args){
        int[] vetor1 = new int[QTD];
        int[] vetor2 = new int[QTD];
        int[] vetor3 = new int[QTD];

        int valor = input.nextInt();
        int tam = 0;
    }

    //Metodo de impressao de marcio
    public static void impressao(int[]V, int tam){
        System.out.print("{ ");
        if(tam>=0){
            System.out.print(V[0]);
        }
        for(int i =1; i<=tam; i++){
            System.out.print(", "+V[i]);            
        }
        System.out.print(" }");
    }

    // Inseri o todos os numeros no vetor de uma vez so e contar quantos foram 
    public static int receber(int[]V, int tam){
        for(int i = 0; i<V.length; i++){
            V[i] = input.nextInt();
        }
        return tam ++;
    }

    // Inseri um numero por vez  e voltar para o menu , do meu jeito 
    public static int receber2(int[]V, int tam){
        if (tam < V.length) {
            V[tam] = input.nextInt();
            return tam +1;
        } else {
            System.out.println("vetor esta cheio");
            return tam;
        }                        
    }

    // Somar 2 vetores para um 3 vetor , onde tam seria o tamanho preenchido dentro dos vetores
    public static void somar(int[]V, int[]N, int[]M, int tam){
        for(int i = 0; i<tam; i++){
            V[i] = N[i] + M[i];
        }
    }

    // Pega um vetor e inverte ele para outro 
    public static void inverso (int[]V, int[]N, int tam){
        for(int i = 0; i<tam; i++){
            V[i] =N[tam-i-1];
        }
    }    

    //Filtra os numeros do vetor e adiciona eles a V para mosra os pares de um vetor e impares do outro
    public static void impares(int[]N, int[]M, int[]V, int tam){
        int index = 0;

        for(int i=0; i<tam; i++){
            if(N[i]%2==0){
                V[index] = N[i];
                index++;
            }
        }

        for(int i=0; i<tam; i++){
            if(M[i]%2==1){
                V[index] = M[i];
                index++;
            }
        }                                
        impressao(V, tam);// me livro de escrever outra impressao e ainda fica da mesma maneira do outro
        } 

        //  Pego um valor e procuro dentro do vetor usando o meio q vai sempre dividir o array para achar ele ou nao 
        public static int buscaBinaria(int[]V, int x, int tam){
            int busca = x;

            int inicio = 0;
            int fim = tam -1;
            
            while( inicio <= fim){
                int meio = (inicio + fim)/2;
                if(V[meio]== busca){
                    return meio;
                } else if(V[meio] < busca){
                    inicio = meio +1;
                }else{
                    fim = meio -1;
                }
            }
            return -1;
        }


    // ou Ordenação por Inserção
    // Pega os numeros do vetor e organiza eles na ordem cresente
        public static void insertionSort(int []V, int tam){
            for(int i=1; i<tam; i++){
                int chave = V[i];
                int J = i-1;

                while(J>=0 && chave<V[J]){
                    V[J+1] = V[J];
                    J--;
                }
                V[J+1] = chave;
            }
        }

        // So funciona caso os numeros estejam organizados em ordem
        public static void repetido(int[]V,int tam){

            insertionSort(V,tam);

            int QTD = 1;
            for(int i=1; i<tam; i++){
                if(V[i]!=V[i-1]){
                    System.out.println(V[i-1]+" | "+QTD);
                    QTD = 1;
                }else{
                    QTD++;
                }
            }
            System.out.println(V[V.length-1]+" | "+QTD);
        }

        // Remove todas as ocorrências de um número x em um vetor ordenado
        // Utiliza busca binária para encontrar x e substitui por elementos posteriores
        // Após cada remoção, o vetor é atualizado e a busca recomeça
        public static int removerTodos(int[] V, int tam, int x) {
            int novoTam = tam;
            int pos = buscaBinaria(V, x, novoTam); // Busca posição de x no vetor ordenado

            while (pos != -1) { 
                for (int i = pos; i < novoTam - 1; i++) {// Desloca os elementos à direita de x uma posição para a esquerda
                    V[i] = V[i + 1];
                }
                novoTam--; // Reduz o tamanho lógico do vetor
                pos = buscaBinaria(V, x, novoTam); // Procura por outra ocorrência
            }
            return novoTam; // Retorna novo tamanho lógico do vetor sem o x
        }


            
        //versao marcio
        // Remove todas as ocorrências de x sem necessidade de ordenação
        // Mais eficiente que a anterior, pois percorre o vetor apenas uma vez
        public static int remover2(int[] V, int tam, int x) {
            int desl = 0; // Contador de quantos elementos foram "pulados" (removidos)
        
            for (int i = 0; i < tam; i++) {
                if (V[i] == x) {
                    desl++; // Elemento a ser removido
                } else {
                    V[i - desl] = V[i]; // Move o elemento para a esquerda, se necessário
                }
            }
            return tam - desl; // Novo tamanho do vetor
        }


        // Ordena o vetor usando o algoritmo de seleção (Selection Sort)
        public static void selectionSort(int[] V, int tam) {
            for (int i = 0; i <= tam - 2; i++) {
                int posMenor = i; // Assume que o menor é o atual

                for (int j = i + 1; j < tam; j++) {
                    if (V[j] < V[posMenor]) {
                        posMenor = j; // Atualiza a posição do menor valor
                    }
                }
                
                // Troca os elementos de posição
                if (i != posMenor) {                    
                    int aux = V[i];
                    V[i] = V[posMenor];
                    V[posMenor] = aux;
                }
            }
        }


}