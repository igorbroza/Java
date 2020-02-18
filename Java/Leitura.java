import java.util.Scanner; //inclusao de biblioteca

public class Leitura{    

    public static void main(String[] args){

        int num;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        System.out.printf("Você Digitou: %d\n", num);

    }

}   