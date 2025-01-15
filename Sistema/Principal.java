import java.time.LocalDate;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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

        /*List <String> leituras = Arquivo.ler("Text.txt");
        List <Emprestimos> emprestados = Arquivo.processarDados(leituras);
        Livro a = new Livro("Joao e as Travessuras de Joana", "Pacheco", "Pacheco.co", 2025);
        Emprestimos b = new Emprestimos(LocalDate.now(),LocalDate.now().plusDays(50),LocalDate.now().plusDays(100),"romilsonbj@gmail.com", a);
        emprestados.add(b);
        Arquivo.salvar(emprestados, "Text.txt");*/
        // Criando a janela principal
        JFrame frame = new JFrame("Menu Simples");
        frame.setSize(1280, 720); // Tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Criando o painel principal com BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(46,46,46));
 
        // Título na região NORTH
        JLabel titulo = new JLabel("Emprestimos", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 100)); // Fonte para o título
        titulo.setForeground(new Color(156,156,156));
        panel.add(titulo, BorderLayout.NORTH);
 
        // Painel central para os botões usando GridBagLayout
        JPanel botoesPanel = new JPanel(new GridBagLayout());
        botoesPanel.setBackground(new Color(46,46,46));
        GridBagConstraints gbc = new GridBagConstraints();
 
        // Criando os botões
        JButton button1 = new JButton("Livros");
        JButton button2 = new JButton("Utensilios");
        JButton button3 = new JButton("<Emprestados>");

        // Aumentando o tamanho dos botões
        Dimension tamanhoBotao = new Dimension(250, 65); // Largura 150px, Altura 50px
        button1.setPreferredSize(tamanhoBotao);
        button2.setPreferredSize(tamanhoBotao);
        button3.setPreferredSize(tamanhoBotao);

        // Aumentando o tamanho do texto nos botões
        Font fonteBotao = new Font("Arial", Font.BOLD, 16); // Fonte Arial, Negrito, Tamanho 16
        button1.setFont(fonteBotao);
        button2.setFont(fonteBotao);
        button3.setFont(fonteBotao);
 
        // Configurando os botões no GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0; // Primeira linha
        gbc.insets = new Insets(10, 0, 10, 0); // Espaçamento entre os botões
        botoesPanel.add(button1, gbc);
 
        gbc.gridy = 1; // Segunda linha
        botoesPanel.add(button2, gbc);
 
        gbc.gridy = 2; // Terceira linha
        botoesPanel.add(button3, gbc);
 
        // Adicionando o painel de botões ao painel principal (na região CENTER)
        panel.add(botoesPanel, BorderLayout.CENTER);
 
        // Adicionando o painel principal à janela
        frame.add(panel);
 
        // Tornando a janela visível
        frame.setVisible(true);
        
    }
}