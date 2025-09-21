import java.util.Scanner;

public class tarefaSala {
    public static Scanner input = new Scanner(System.in);
    public static final int QTD = 30;

    public static void main(String[] args){
        int[] conjuntoA = new int[QTD];
        int[] conjuntoB = new int[QTD];
        int[] conjuntoC = new int[QTD];

        int limi1 = 0; 
        int limi2 = 0; 
        int limi3 = 0; 

        int data;

        do {
            System.out.println("Digite:");
            System.out.println("1 - Inserir número no conjunto A");
            System.out.println("2 - Inserir número no conjunto B");
            System.out.println("3 - Imprimir conjuntos A e B");
            System.out.println("4 - União de A e B");
            System.out.println("5 - Interseção de A e B");
            System.out.println("6 - Diferença A - B");
            System.out.println("7 - Diferença B - A");
            System.out.println("0 - Sair");

            data = input.nextInt();

            switch(data) {
                case 1:
                    limi1 = receber(conjuntoA, limi1);
                    break;

                case 2:
                    limi2 = receber(conjuntoB, limi2);
                    break;

                case 3:
                    System.out.println("Conjunto A:");
                    imprimir(conjuntoA, limi1);
                    System.out.println("Conjunto B:");
                    imprimir(conjuntoB, limi2);
                    break;

                case 4:
                    limi3 = uniao(conjuntoA, limi1, conjuntoB, limi2, conjuntoC);
                    System.out.println("União de A e B:");
                    imprimir(conjuntoC, limi3);
                    break;

                case 5:
                    limi3 = interseccao(conjuntoA, limi1, conjuntoB, limi2, conjuntoC);
                    System.out.println("Interseção entre A e B:");
                    imprimir(conjuntoC, limi3);
                    break;

                case 6:
                    limi3 = diferenca(conjuntoA, limi1, conjuntoB, limi2, conjuntoC);
                    System.out.println("Diferença A - B:");
                    imprimir(conjuntoC, limi3);
                    break;

                case 7:
                    limi3 = diferenca(conjuntoB, limi2, conjuntoA, limi1, conjuntoC);
                    System.out.println("Diferença B - A:");
                    imprimir(conjuntoC, limi3);
                    break;

                case 0:
                    System.out.println("Encerrado");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (data != 0);
    }



    public static int receber(int[] V, int limi){
        if (limi < V.length) {
            System.out.println("Digite o número do vetor:");
            V[limi] = input.nextInt();
            return limi + 1;
        } else {
            System.out.println("Vetor está cheio.");
            return limi;
        }
    }

    public static void imprimir(int[] V, int tamanho) {
        System.out.print("{ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(V[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static int uniao(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;

        for (int i = 0; i < tamA; i++) {
            C[tamC++] = A[i];
        }

        for (int i = 0; i < tamB; i++) {
            boolean duplicado = false;
            for (int j = 0; j < tamA; j++) {
                if (B[i] == A[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                C[tamC++] = B[i];
            }
        }

        return tamC;
    }

    public static int interseccao(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;

        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tamB; j++) {
                if (A[i] == B[j]) {
                    boolean duplicado = false;
                    for (int k = 0; k < tamC; k++) {
                        if (C[k] == A[i]) {
                            duplicado = true;
                            break;
                        }
                    }

                    if (!duplicado) {
                        C[tamC++] = A[i];
                    }

                    break;
                }
            }
        }

        return tamC;
    }
    public static int diferenca(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;
        for (int i = 0; i < tamA; i++) {
            boolean encontrado = false;

            for (int j = 0; j < tamB; j++) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                boolean duplicado = false;
                for (int k = 0; k < tamC; k++) {
                    if (C[k] == A[i]) {
                        duplicado = true;
                        break;
                    }
                }
                if (!duplicado) {
                    C[tamC++] = A[i];
                }
            }
        }

        return tamC;
    }

}
