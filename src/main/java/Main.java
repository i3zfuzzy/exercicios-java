import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Contato> contato = new ArrayList<Contato>();


        Agenda e7 = new Agenda();
        MaiorNumero var = new MaiorNumero();
        NumeroDecrescente e2 = new NumeroDecrescente();
        ParesImpares e3 = new ParesImpares();
        TrocaNumero e4 = new TrocaNumero();
        ComparaNumero e5 = new ComparaNumero();
        MediaAluno e6 = new MediaAluno();

//        var.numero();
//            e2.decrescente();
//        e3.paresImpares();
//            e4.trocaNumero();
//        e5.comparaNumero();
//        e6.mediaAluno();
        e7.novoContato(contato);
        System.out.println("informe o nome do contato: ");
        String name = ler.next();
        Contato contato1 = e7.buscaContato(contato, name);
        System.out.println(contato1.toString());
        System.out.println("Informe o contato para Exluir");
        String n = ler.next();
        e7.excluir(contato, n);


    }
}
