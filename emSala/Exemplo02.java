public class Exemplo02{
    public static void main (String[]args){
        System.out.println("loop de 1 a 100");
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("Números impares");
        for(int i = 1; i <=100; i+=2){
            System.out.println(i);
        }

        System.out.println("Números pares");
        for(int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }

        System.out.println("Multiplos de 3");
        for(int i = 3; i <= 100; i+=3){
            System.out.println(i);
        }

        System.out.println("Multiplos de 3 e termina com 3");
        for(int i = 3; i <= 100; i++){
            if( i%3==0|| i%10==3)
            System.out.println(i);
        }
    }
}