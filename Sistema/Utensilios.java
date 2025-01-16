public class Utensilios implements Itens{
    String nome;
    String descricao;
    String material;

    public Utensilios (String nome, String descricao, String material){

        this.nome = nome;
        this.descricao = descricao;
        this.material = material;

    }

    public String arquivoString(){

        return nome + "," + descricao + "," + material;

    }


    public String toString(){
        String name = "Objeto: " + nome;
        String desc = "Descrição: " + descricao;
        String mat = "Material: " + material;
        return name + " , " + desc + " , " + mat;
    }

    public String retornaNome(){
        return this.nome;
    }
}