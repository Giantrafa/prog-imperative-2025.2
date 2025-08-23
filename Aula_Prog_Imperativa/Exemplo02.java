public class Exemplo02{
    public static void main (String[]args){

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("");
        for(int i = 1; i <=100; i+=2){
            System.out.println(i);
        }

        System.out.println("");
        for(int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }

        System.out.println("");
        for(int i = 3; i <= 100; i+=3){
            System.out.println(i);
        }

        // i %3==0 || i %10==3
        for(int i = 3; i <= 100; i++){
            System.out.println(i);
        }
    }
}