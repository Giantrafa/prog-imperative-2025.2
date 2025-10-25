package tarefa;

public class tarefa {
    public static void main(String[] args) {
        int [][] matriz1 = new int [4][4];
    

        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[0].length; j++){        
            int g = i*j;
            //impressao
            }          
        }                    
    }    
}



/* 01
      int [][] matriz1 = {{1,40,20},{4,6,19}};
        int maior = 0;

        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[0].length; j++){
                if(matriz1[i][j]>10){
                    maior++;
                }
            }
        }

        System.out.println("A matriz1 tem "+maior+" numeros maiores que 10");

    }               
 */


 /* 02
  int [][] matriz1 = {
        {1,0,0,0,0},
        {0,1,0,0,0},
        {0,0,1,0,0},
        {0,0,0,1,0},
        {0,0,0,0,1},
    };

    int [][] matriz2 = new int [5][5];
    
    for(int i=0; i<matriz2.length; i++){
        for(int j=0; j<matriz2[0].length; j++){
            if(i == j){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }            
        }
        System.out.println("");
    }    
  */