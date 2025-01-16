import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
//import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Principal {


    public static void main(String[] args){


        List <String> leituras = Arquivo.ler("Text.txt");
        List <Emprestimos> emprestados = Arquivo.processarDados(leituras);
        Livro a = new Livro("Joao e as Travessuras de Joana", "Pacheco", "Pacheco.co", 2025);
        Emprestimos b = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(50),LocalDate.now().plusDays(100),"romilsonbj@gmail.com", a);
        emprestados.add(b);
        Arquivo.salvar(emprestados, "Text.txt");

    }

}