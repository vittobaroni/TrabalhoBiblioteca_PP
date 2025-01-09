import java.time.LocalDate;

public class Emprestimos {
    LocalDate retirada;
    LocalDate devolucao;
    LocalDate devolucaoEfetiva;
    String email;
    Itens emprestado;

    public Emprestimos(LocalDate retirada, LocalDate devolucao, LocalDate devolucaoEfetiva, String email, Itens emprestado){
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.devolucaoEfetiva = devolucaoEfetiva;
        this.email = email;
        this.emprestado = emprestado;
    }

    public String toString(){

        String retidaString = "A retirada foi em: " + this.retirada;
        String devolucString = ", com a data de devolucao: " + this.devolucao;
        String devolucaoEfetivaString = ". Data de entrega: " + this.devolucaoEfetiva;
        String email = ", Email para contato: " + this.email;

        return emprestado + "\n" + retidaString + devolucString + devolucaoEfetivaString + email + "\n\n";
    }
}