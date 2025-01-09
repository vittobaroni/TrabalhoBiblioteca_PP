import java.time.LocalDate;
import java.util.*;

public class Principal {

    public static void main(String[] args){

        Livro l1 = new Livro("O Monge e o Executivo","James Hunter","Sextante",2004);

        Utensilios u1 = new Utensilios("Panela de Ferro", "panela para cozinhar", "Ferro");

        Emprestimos a2 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",u1);
        Emprestimos a1 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",l1);
        List <Emprestimos> emprestados = new ArrayList();
        emprestados.add(a1);
        emprestados.add(a2);
        for (Emprestimos i : emprestados){
            System.out.println(i);

        }

    }
}