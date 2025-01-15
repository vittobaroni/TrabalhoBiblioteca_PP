import java.time.LocalDate;
import java.util.*;

public class Principal {

    public static void main(String[] args){

        /*Livro l1 = new Livro("O Monge e o Executivo","James Hunter","Sextante",2004);

        Utensilios u1 = new Utensilios("Panela de Ferro", "panela para cozinhar", "Ferro");

        Emprestimos a2 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",u1);
        Emprestimos a1 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",l1);
        List <Emprestimos> emprestados = new ArrayList();
        emprestados.add(a1);
        emprestados.add(a2);
        */

        List <String> leituras = Arquivo.ler("Text.txt");
        List <Emprestimos> emprestados = Arquivo.processarDados(leituras);
        Livro a = new Livro("Joao e as Travessuras de Joana", "Pacheco", "Pacheco.co", 2025);
        Emprestimos b = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(50),LocalDate.now().plusDays(100),"romilsonbj@gmail.com", a);
        emprestados.add(b);
        Arquivo.salvar(emprestados, "Texto.txt");

        
    }
}