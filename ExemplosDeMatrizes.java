import java.util.Scanner;

public class ExemplosDeMatrizes {
    public static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            int[][] matriz1 = new int[3][2];
			int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            /* 
                      0|1|2                            
                    0{A|B|C} 
                    1{D|E|F}
                    2{G|H|I}      
            */
            int opcao;

            do {
                System.out.println("--- MENU ---");
                System.out.println("1 - Preencher matriz");
                System.out.println("2 - Buscar número na matriz");
                System.out.println("3 - Somar valores por linha");
                System.out.println("4 - Imprimir");
                System.out.println("5 - Numero par na matriz1");
                System.out.println("6 - Numero impar na matriz1");
                System.out.println("7 - Transosta");
                System.out.println("8 - Transposta, com a matriz1 e saber e quadrado ou não");                
                System.out.println("9 - Transposta, com a matriz2 e saber e quadrado ou não");                
                System.out.println("10 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        receber(matriz1);
                        break;
                    case 2:
                        System.out.print("Digite o número que deseja buscar: ");
                        int x = input.nextInt();
                        busca(matriz1, x);
                        break;
                    case 3:
                        soma(matriz1);
                        break;
                    case 4:
                        imprimir(matriz1);
                        break;
                     case 5:                        
                        int pares = qtdPares(matriz1);
                        System.out.printf("Quantidade de números pares na matriz1: %d\n", pares);
                        break;
                    case 6:                        
                        int impares = qtdImpares(matriz1);
                        System.out.printf("Quantidade de números ímpares na matriz1: %d\n", impares);
                        break;
                    case 7:                        
                        int[][] transposta = quanMatrizTransposta(matriz1);
                        System.out.println("Matriz transposta de matriz1:");
                        imprimir(transposta);
                        break;
                    case 8:                        
                        transpor2(matriz1);                                                
                        break;
                    case 9:                        
                        transpor2(matriz2);                                                
                        System.out.println("Matriz transposta de matriz2:");
                        imprimir(matriz2);
                        break;
                    case 10:
                    System.out.println("Saindo....");
                    break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } while (opcao != 10);
        }

        
        // Receber todos os numeros da matriz
        public static void receber(int[][] m) {    
            for (int l = 0; l < m.length; l++) {
                for (int c = 0; c < m[l].length; c++) {
                    System.out.println("Digite a matriz ["+(l+1)+"] ["+(c+1)+"]");
                    m[l][c] = input.nextInt(); 
                }
            }
        }
        
        // procura em todas as linhas e colunas o Numero X
        public static void busca(int[][]m, int x){
            for (int l = 0; l < m.length; l++) {
                for (int c = 0; c < m[l].length; c++) {
                    if(m[l][c] == x){
                        System.out.printf("Achou na Linha %d, Coluna %d \n",l+1,c+1);
                        return;
                    }
                }
            }
            System.out.println("nao achou");
        }

        // somar os numeros da mesma linha
        public static void soma(int[][]M){
            for (int l = 0; l < M.length; l++) {
                int soma = 0;
                for (int c = 0; c < M[l].length; c++) {                
                        soma = soma + M[l][c];                
                }
                System.out.printf("Soma da linha %d: %d\n", l + 1, soma);
            }        
        }

        //imprimir os numeros das linhas e colunas, coloquei muitos detales , pode der menos
        public static void imprimir(int[][] M) { 
			System.out.println("int[][]M = {");          
            for (int l = 0; l < M.length; l++) {				
                System.out.print(l+" { "+M[l][0]);   

                for (int c = 1; c < M[0].length; c++) {
                    System.out.print("|"+M[l][c]);                
                }

                System.out.println(" }");             
            }        
			System.out.println(" };");
        }

		//Achar Pares na Matriz
    	public static int qtdPares (int m[][]){
	    	int cont = 0;
    		for(int i=0; i<m.length; i++){
		    	for(int j=0; j<m[0].length; j++){
			    	if(m[i][j]%2==0){
				    	cont+=1;
			    	}
		    	}
	    	}
	    	return cont;
    	}


    	// Achar Impares , como achamos os pares, podemos dizer que os outros são impares
    	// entao pegamps a quantidade todal de elementos e subtraimos pela quantidade de pares  
    	public static int qtdImpares(int m[][]){
	    	return m.length * m[0].length - qtdPares(m);
    	}


    	// Matriz Transposta, troca o numero de coluna e linhas para uma nova matriz    
    	public static int[][] quanMatrizTransposta(int m[][]){
        	int[][] mt = new int[m[0].length][m.length];
	    	for(int i=0; i<m.length; i++){
		    	for(int j=0; j<m[0].length; j++){
			    	mt[j][i] = m[i][j];
		    	}
	    	}
	    	return mt;
    	}

    	// essa faz a mesma coisa de (quanMatrizTransposta), mas agora ela troca nela mesmo
    	public static void transpor(int m[][]){
	    	int aux;
	    	for(int i=0; i<m.length; i++){
		    	for(int j=0; j<m[0].length; j++){
			    	if(i<j){
				    	aux = m[i][j];
				    	m[i][j] = m[j][i];
				    	m[j][i] = aux;
			    	}
		    	}
	    	}
    	}

    	// tiramos o if, onde o loop faria isso
    	// e conferimos se a matriz e quadrada 
    	public static void transpor2 (int m[][]){
	    	int aux;
	    	if( m.length == m[0].length ){
            	for(int i=0; i < m.length-1; i++){
			        for(int j=i+1; j<m[0].length; j++){
			        	aux = m[i][j];
			        	m[i][j] = m[j][i];
			        	m[j][i] = aux;
		        	}
	        	}
        	}
        	else{
            	System.out.println("A matriz Não e Quadrada");
        	}	    
    	}
    
   		/* caso presise compara se e quadrada em mais de uma
   		public static boolean quadrada(int m[][]){	    	    
			return m.length == m[0].length;   		                                        
		} 
   		*/
    }