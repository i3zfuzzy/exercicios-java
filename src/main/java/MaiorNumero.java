import java.util.Scanner;

public class MaiorNumero {

    void numero() {
        int num1, num2, maior;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        num1 = ler.nextInt();
        System.out.print("Digite um número inteiro: ");
        num2 = ler.nextInt();
        if(num1 > num2) {
            System.out.println("O maior número digitado foi: " + num1);
        }else{
            System.out.println("O maior número digitado foi: " + num2);
        }

    }

}

