public class Livro implements Itens{
    String nome;
    String autor;
    String editora;
    int ano;


    public Livro(String titulo, String autor, String editora, int ano){

        this.nome = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;

    }

    public String toString(){

        return "1" + "," + nome + "," + autor + "," + editora + "," + ano;

    }

}