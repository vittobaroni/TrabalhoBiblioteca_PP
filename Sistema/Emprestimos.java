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

    public String arquivoString(){

        return retirada + "," + devolucao + "," + devolucaoEfetiva + "," + email;

    }

    public String toString(){
        String retir = "A retirada foi feita: " + retirada;
        String dev = "com a data de devolução para: " + devolucao;
        String devEfetiva = "Foi devolvido em: " + devolucaoEfetiva;
        String email = "Por: " + this.email;
        return emprestado + "\n" + retir + " , " + dev + " . " + devEfetiva + " . " + email + "\n";

    }
    
}