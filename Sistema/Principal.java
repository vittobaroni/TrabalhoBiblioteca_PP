import java.time.LocalDate;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {

    public static void main(String[] args){

        Livro l1 = new Livro("O Monge e o Executivo","James Hunter","Sextante",2004);

        Utensilios u1 = new Utensilios("Panela de Ferro", "panela para cozinhar", "Ferro");

        Emprestimos a2 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",u1);
        Emprestimos a1 = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(15),LocalDate.now().plusDays(20),"joaozinho@gmil.com",l1);
        List <Emprestimos> emprestados = new ArrayList();
        emprestados.add(a1);
        emprestados.add(a2);

        //GRAVAR CONTEUDO NO ARQUIVO
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./Text.txt"))){
            for (Emprestimos i : emprestados){
                writer.write(i.emprestado.toString());
                writer.newLine();
                writer.write(i.toString());
                writer.newLine();
                System.out.println("Conteudo Gravado!!");
                System.out.println(i.emprestado);
            }    
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}