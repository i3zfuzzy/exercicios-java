import java.util.Scanner;

public class NumeroDecrescente {

    void decrescente(){
        int num;
        System.out.println("informe um numero: ");
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        for(int i=0; i <= num; num--){
            System.out.println(num);
        }
    }
}
