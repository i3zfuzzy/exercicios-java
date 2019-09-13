import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class TrocaNumero {

    void trocaNumero() {
        int NumA;
        int NumB;
        List<Integer> troca = new ArrayList();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Numero A: ");
        NumA = ler.nextInt();
        troca.add(NumA);
        System.out.println("Informe o Numero B :");
        NumB = ler.nextInt();
        troca.add(NumB);
        Collections.reverse(troca);

        System.out.println(troca);

    }
}
