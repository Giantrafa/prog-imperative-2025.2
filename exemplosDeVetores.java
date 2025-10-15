import java.util.Scanner;

public class exemplosDeVetores {
    
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 30;

    public static void main(String[] args) {
        int[] vetor1 = new int[QTD];
        int[] vetor2 = new int[QTD];
        int[] vetor3 = new int[QTD];

        int tam1 = 0;
        int valor;

        // MENU SIMPLIFICADO, métodos estão abaixo
        do {
            System.out.println("=== MENU ===");
            System.out.println(" 1. Inserir valor no vetor1 (um por vez)");
            System.out.println(" 2. Inserir todos os valores no vetor2 (de uma vez)");
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
            System.out.println("13. Ordenar vetor1 (Selection Sort)");
            System.out.println(" 0. Sair");

            valor = input.nextInt(); 

            switch (valor) {
                case 1:
                    System.out.println("Digite o valor para vetor1:");
                    tam1 = receber(vetor1, tam1);
                    break;

                case 2:
                    receber2(vetor2);
                    break;

                case 3:
                    System.out.print("vetor1 = ");
                    impressao(vetor1, tam1);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("vetor2 = ");
                    impressao(vetor2, vetor2.length);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Soma (vetor3) = ");
                    somar(vetor3, vetor1, vetor2);
                    impressao(vetor3, vetor3.length);
                    System.out.println();
                    break;

                case 6:
                    inverso(vetor1, tam1);
                    impressao(vetor1, tam1);
                    System.out.println();
                    break;

                case 7:
                    ParesEImpares(vetor1, vetor2, vetor3, tam1);
                    impressao(vetor3, vetor3.length);
                    System.out.println();
                    break;

                case 8:
                    insertionSort(vetor1, tam1);
                    System.out.println("vetor1 ordenado.");
                    impressao(vetor1, tam1);
                    System.out.println();
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
                    break;

                case 11:
                    System.out.print("Digite o valor a ser removido: ");
                    int rem1 = input.nextInt();
                    tam1 = removerTodos(vetor1, tam1, rem1);
                    System.out.println("Elemento removido (com ordenação).");
                    impressao(vetor1, tam1);
                    System.out.println();
                    break;

                case 12:
                    System.out.print("Digite o valor a ser removido: ");
                    int rem2 = input.nextInt();
                    tam1 = remover2(vetor1, tam1, rem2);
                    System.out.println("Elemento removido (sem ordenação).");
                    impressao(vetor1, tam1);
                    System.out.println();
                    break;

                case 13:
                    Bullesort(vetor1, tam1);
                    System.out.println("vetor1 ordenado com Selection Sort.");
                    impressao(vetor1, tam1);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (valor != 0);
    }

    // Impressão do vetor, do jeito de Marcio
    public static void impressao(int[] V, int tam) {
        System.out.print("{ ");
        if (tam > 0) {
            System.out.print(V[0]);
            for (int i = 1; i < tam; i++) {
                System.out.print(", " + V[i]);
            }
        }
        System.out.print(" }");
    }

    // Inserir um número por vez no array
    public static int receber(int[] V, int tam) {
        if (tam >= V.length) {
            System.out.println("vetor cheio");
            return tam;
        }
        V[tam] = input.nextInt();
        return tam + 1;
    }

    // Inserir todos os números no vetor
    public static void receber2(int[] V) {
        for (int i = 0; i < V.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            V[i] = input.nextInt();
        }
    }

    // Somar 2 vetores para um 3º vetor
    public static void somar(int[] V, int[] N, int[] M) {
        for (int i = 0; i < V.length; i++) {
            V[i] = N[i] + M[i];
        }
    }

    // Inverter vetor
    public static void inverso(int[] V, int tam) {
        for (int i = 0; i < tam; i++) {        
            V[i] = V[tam - i - 1];            
        }
    }

    // Filtra pares de N e ímpares de M em V
    public static void ParesEImpares(int[] N, int[] M, int[] V, int tam) {
        int index = 0;

        for (int i = 0; i < tam; i++) {
            if (N[i] % 2 == 0) {
                V[index] = N[i];
                index++;
            }
        }
        for (int i = 0; i < tam; i++) {
            if (M[i] % 2 == 1) {
                V[index] = M[i];
                index++;
            }
        }                        
    }

    // Busca binária (vetor ordenado)
    public static int buscaBinaria(int[] V, int x, int tam) {
        int inicio = 0;
        int fim = tam - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (V[meio] == x) {
                return meio;
            } else if (V[meio] < x) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    // Pega os numeros do vetor e organiza eles na ordem cresente
    public static void insertionSort(int[] V, int tam) {
        for (int i = 1; i < tam; i++) {
            int chave = V[i];
            int j = i - 1;

            while (j >= 0 && chave < V[j]) {
                V[j + 1] = V[j];
                j--;
            }
            V[j + 1] = chave;
        }
    }

    // Mostrar repetidos (so funciona caso o vetor esteja  ordenado)
    public static void repetido(int[] V, int tam) {        

        insertionSort(V, tam);
       
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


    // Remove todas as ocorrências de x em vetor ordenado
    public static int removerTodos(int[] V, int tam, int x) {
        int novoTam = tam;
        int pos = buscaBinaria(V, x, novoTam);

        while (pos != -1) {
            for (int i = pos; i < novoTam - 1; i++) {
                V[i] = V[i + 1];
            }
            novoTam--;
            pos = buscaBinaria(V, x, novoTam);
        }
        return novoTam;
    }

    // Remove todas as ocorrências de x sem necessidade de ordenação
    public static int remover2(int[] V, int tam, int x) {
        int desl = 0;
        for (int i = 0; i < tam; i++) {
            if (V[i] == x) {
                desl++;
            } else {
                V[i - desl] = V[i];
            }
        }
        return tam - desl;
    }

    // Selection Sort (nome Bullesort está mantido para compatibilidade)
    public static void Bullesort(int[] V, int tam) {
        for (int i = 0; i <= tam - 2; i++) {
            int posMenor = i;

            for (int j = i + 1; j < tam; j++) {
                if (V[j] < V[posMenor]) {
                    posMenor = j;
                }
            }

            if (i != posMenor) {
                int aux = V[i];
                V[i] = V[posMenor];
                V[posMenor] = aux;
            }
        }
    }
    
}
