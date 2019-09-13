import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Agenda {


    public void novoContato(List<Contato> contato){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do contato: ");
        String nome = ler.next();
        System.out.println("Informe o email do contato: ");
        String email = ler.next();
        Contato nContato = new Contato(nome, email);
        contato.add(nContato);


    }
    public Contato buscaContato(List<Contato> contato, String nome){
        AtomicReference<Contato> contatoEncontrado = new AtomicReference<>();
        contato.forEach(c -> {
            if(c.getNome().equals(nome)) {
                contatoEncontrado.set(c);
            }
        });
        return contatoEncontrado.get();
    }
    public void excluir(List<Contato> contato, String nome){
        AtomicReference<Contato> contatoEncontrado = new AtomicReference<>();
        contato.forEach(c -> {
            if(c.getNome().equals(nome)) {
                contatoEncontrado.set(c);
            }
        });
        contato.remove(contatoEncontrado);
        System.out.println();

    }
}
