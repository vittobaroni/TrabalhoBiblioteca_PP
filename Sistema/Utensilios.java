public class Utensilios implements Itens{
    String nome;
    String descricao;
    String material;

    public Utensilios (String nome, String descricao, String material){

        this.nome = nome;
        this.descricao = descricao;
        this.material = material;

    }

    public String toString(){

        return "2" + "," + nome + "," + descricao + "," + material;

    }
}