import java.util.Scanner;

public class exemplosEmGeral {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 30;

    public static void main(String[] args) {
        int[] vetor1 = new int[QTD];
        int[] vetor2 = new int[QTD];
        int[] vetor3 = new int[QTD];

        int tam1 = 0;
        //int tam2 = 0;
        //int tam3 = 0;

        int valor;

        // Exemplo de MENU , o Methodos estao la em baixo
        do {
            System.out.println("=== MENU ===");
            System.out.println(" 1. Inserir valores no vetor1 , de um por um ");
            System.out.println(" 2. Inserir todos os valores no vetor2");
            System.out.println(" 3. Mostrar vetor1");
            System.out.println(" 4. Mostrar vetor2");
            System.out.println(" 5. Somar vetor1 e vetor2 em vetor3");
            System.out.println(" 6. Inverter ordem do vetor1");
            System.out.println(" 7. Filtrar pares de vetor1 e ímpares de vetor2 em vetor3");
            System.out.println(" 8. Ordenar vetor1 (Insertion Sort)");
            System.out.println(" 9. Buscar elemento em vetor1 (Busca Binária)");
            System.out.println("10. Mostrar repetidos em vetor1");
            System.out.println("11. Remover elemento de vetor1 (Ordenado)");
            System.out.println("12. Remover elemento de vetor1 (Desordenado)");
            System.out.println("13. Ordenar vetor1 (bublesort)");
            System.out.println(" 0. Sair");            

            valor = input.nextInt(); // Escolha

            switch (valor) {
                case 1:                                        
                    System.out.println("Digite o valor:");                    
                        tam1 = receber(vetor1, tam1);                    
                    break;

                case 2:                                                                                
                    receber2(vetor2);                    
                    break;

                case 3:
                    System.out.print("vetor1 = ");
                    impressao(vetor1, tam1);                    
                    break;

                case 4:
                    System.out.print("vetor2 = ");
                    impressao(vetor2, vetor2.length);                    
                    break;

                case 5:                    
                    System.out.print("Soma (vetor3) = ");
                    somar(vetor3, vetor1, vetor2);
                    impressao(vetor3, vetor3.length);                    
                    break;

                case 6:
                    inverso(vetor1, tam1);
                    impressao(vetor1, tam1);
                    break;

                case 7:
                    impares(vetor1, vetor2, vetor3,tam1);
                    impressao(vetor3, vetor3.length);
                    break;

                case 8:
                    insertionSort(vetor1, tam1);
                    System.out.println("vetor1 ordenado.");
                    impressao(vetor1,tam1);
                    break;

                case 9:
                    System.out.print("Digite o valor a ser buscado: ");
                    int x = input.nextInt();
                    int pos = buscaBinaria(vetor1, x, tam1);
                    if (pos != -1) {
                        System.out.println("Encontrado na posição: " + pos);
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 10:
                    repetido(vetor1, tam1);
                    impressao(vetor1, tam1);
                    break;

                case 11:
                    System.out.print("Digite o valor a ser removido: ");
                    int rem1 = input.nextInt();
                    tam1 = removerTodos(vetor1, tam1, rem1);
                    System.out.println("Elemento removido (com ordenação).");
                    impressao(vetor1, tam1);
                    break;

                case 12:
                    System.out.print("Digite o valor a ser removido: ");
                    int rem2 = input.nextInt();
                    tam1 = remover2(vetor1, tam1, rem2);
                    System.out.println("Elemento removido (sem ordenação).");
                    impressao(vetor1, tam1);
                    break;

                case 13:
                    Bullesort(vetor1, tam1);
                    System.out.println("vetor1 ordenado com Selection Sort.");
                    impressao(vetor1, tam1);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (valor != 0);
    }

    //Metodo de impressao de marcio
    public static void impressao(int[]V, int tam){
        System.out.print("{ ");
        if(tam>=0){
            System.out.print(V[0]);
        }
        for(int i =1; i<tam; i++){
            System.out.print(", "+V[i]);            
        }
        System.out.print(" }");
    }

    // Inseri um numero pro vez no array
    public static int receber(int[]V, int tam){
        if(tam >= V.length){
            System.out.println("vetor cheio");
            return tam;
        }
        V[tam] = input.nextInt();        
        return tam+1 ;
    }

    // Inseri todos numeros dentro do vetor
    public static void receber2(int[]V){
        for(int i=0; i<V.length;i++){
             System.out.print("Digite o " + (i + 1) + "º valor: ");
            V[i]= input.nextInt();
        }            
    }

    // Somar 2 vetores para um 3 vetor
    public static void somar(int[]V, int[]N, int[]M){
        for(int i = 0; i<V.length; i++){
            V[i] = N[i] + M[i];
        }
    }

    // Pega um vetor e inverte ele 
    public static void inverso (int[]V, int tam){
        for(int i = 0; i<tam; i++){
            V[i] =V[tam-i-1];
        }
    }    

    //Filtra os numeros do vetor e adiciona eles a V, Os pares de N , E os inpares de M , No vetor V , onde tambem defino o tamanho
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
    } 

        //  Pego um valor e procuro dentro do vetor usando o meio q vai sempre dividir o array para achar ele ou nao 
        // mas so funciona em Array ordenado
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

    // Ou Ordenação por Inserção
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

        /* Remove todas as ocorrências de um número X em um vetor ordenado
         Utiliza busca binária para encontrar x e substitui por elementos posteriores
         Após cada remoção, o vetor é atualizado e a busca recomeça */
        public static int removerTodos(int[] V, int tam, int x) {
            int novoTam = tam;
            int pos = buscaBinaria(V, x, novoTam); // Busca posição de x no vetor ordenado

            while (pos != -1) { 
                for (int i = pos; i < novoTam - 1; i++) {// Desloca os elementos à direita de X uma posição para a esquerda
                    V[i] = V[i + 1];
                }
                novoTam--; // Reduz o tamanho lógico do vetor
                pos = buscaBinaria(V, x, novoTam); // Procura por outra ocorrência
            }
            return novoTam; // Retorna novo tamanho lógico do vetor sem o X
        }

            
        //versao marcio
        // Remove todas as ocorrências de X sem necessidade de ordenação
        // Mais eficiente que a *removerTodos*, pois percorre o vetor apenas uma vez
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


        // Ordena o vetor usando o algoritmo de seleção que nem (Selection Sort) so q mais eficiente        
        public static void Bullesort(int[] V, int tam) {
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