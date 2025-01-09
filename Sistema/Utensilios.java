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
        
        String nomeString = "Utensilio: " + this.nome;
        String descricaoString = "Descricao: " + this.descricao;
        String materialString = "Material: " + this.material;

        return nomeString + "," + descricaoString + "," + materialString;

    }
}