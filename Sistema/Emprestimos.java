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

        return retirada + "," + devolucao + "," + devolucaoEfetiva + "," + email;

    }
    
}