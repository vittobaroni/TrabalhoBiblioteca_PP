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

        String livroString = "Livro: " + this.nome;
        String autorString = "Autor: " + this.autor;
        String editoraString = "Editora: " + this.editora;
        String anoString = "Publicacao: " + this.ano;

        return livroString + "," + autorString + "," + editoraString + "," + anoString;

    }
}