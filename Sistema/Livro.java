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

    public String arquivoString(){

        return nome + "," + autor + "," + editora + "," + ano;

    }

    public String toString(){
        String name = "Livro: " + nome;
        String aut = "Autor: " + autor;
        String edt = "Editora: " + editora;
        String ano = "Ano de Lançamento: " + this.ano;
        return name + " , " + aut + " , " + edt + " , "  + ano;
    }

}