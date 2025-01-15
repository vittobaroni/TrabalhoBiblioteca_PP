import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileReader;
import java.util.*;

public class Arquivo {

    
    
    public static void salvar(List <Emprestimos> emprestados, String nomeDoArquivo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeDoArquivo))){
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



    public static List<String> ler (String nomeDoArquivo){
        List <String> leituras = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))){
            String linha;
            while((linha = reader.readLine()) != null){
                leituras.add(linha);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return leituras;
    }

    public static List <Emprestimos> processarDados(List <String> leituras){
        List <Emprestimos> emprestados = new ArrayList<>();
        for(int i=0; i< leituras.size();i++){
            String linha1 = leituras.get(i);
            String linha2 = leituras.get(i+1);
            String[] partes1 = linha1.split(",");
            String[] partes2 = linha2.split(",");
            Itens a;
            if(partes1.length == 4){
                int ano = Integer.parseInt(partes1[3].trim());
                a = new Livro(partes1[0].trim(), partes1[1].trim(), partes1[2].trim(), ano);
            }else{
                a = new Utensilios(partes1[0].trim(), partes1[1].trim(), partes1[2].trim());
            }
            Emprestimos b = new Emprestimos(LocalDate.parse(partes2[0].trim()), LocalDate.parse(partes2[1].trim()), LocalDate.parse(partes2[2].trim()), partes2[3].trim(), a);
            emprestados.add(b);
            i++;
        }
        return emprestados;
    }


}
