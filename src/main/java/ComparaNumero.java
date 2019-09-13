import java.util.Scanner;

public class ComparaNumero {

    void comparaNumero() {
        int num1;
        int num2;

        Scanner ler = new Scanner(System.in);
        System.out.println("Infome o Numero A:  ");
        num1 = ler.nextInt();
        System.out.println("Informe o Numero B: ");
        num2 = ler.nextInt();
        if (num1 == num2) {
            System.out.println("o numero A e B sao iguais: ");
        } else {
            System.out.println("Os numeros nao sao iguais");
        }
        if (num1 != num2 && num1 > num2) {
            System.out.println("Numero A é maior que o numero B = " + num1 + "," + num2);
        } else if (num1 != num2) {
            System.out.println("Numero B é maior que o numero A = " + num2 + "," + num1);
        }

    }


}
