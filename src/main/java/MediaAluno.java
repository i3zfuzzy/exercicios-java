import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAluno {

    void mediaAluno() {
        Scanner ler = new Scanner(System.in);
        List<Integer> notas = new ArrayList();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Informe uma nota de 0 a 100: ");
            int j = ler.nextInt();
            while (j < 0 || j > 100) {
                System.out.println("Valor Inválido, digite novamente");
                j = ler.nextInt();
            }
            notas.add(j);
        }
        System.out.println(notas);
        double media = 0;
        double valorTotal =0;
        for(int i=0;i<notas.size();i++){
             valorTotal += notas.get(i);
        }
        media = valorTotal / notas.size();

        System.out.println("media do aluno = "+media);
    }


}

