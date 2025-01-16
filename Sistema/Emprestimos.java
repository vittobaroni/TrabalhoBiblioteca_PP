import java.time.LocalDate;
import java.time.Period;

public class Emprestimos {
    private LocalDate retirada;
    private LocalDate devolucao;
    private LocalDate devolucaoEfetiva;
    private String email;
    private Itens emprestado;

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
        String retir = "A retirada foi feita: " + this.retirada;
        String dev = "com a data de devolução para: " + this.devolucao;
        String devEfetiva = "Foi devolvido em: " + this.devolucaoEfetiva;
        String email = "Por: " + this.email;
        return emprestado.toString() + "\n" + retir + " , " + dev + " . " + devEfetiva + " . " + email + "\n";

    }

    public boolean verificarAtraso(){
        Period period = Period.between(this.devolucaoEfetiva, this.devolucao);
        if(period.isNegative()==true){
            return true;
        } else{
            return false;
        }
    }

    private String returnaNome(){
        return emprestado.retornaNome();
    }

    public boolean verificarIgual(String nome){
        String nomeOrigin = returnaNome();
        if(nome.equals(nomeOrigin)==true){
            return true;
        }else{
            return false;
        }
    }

    public void registrar(LocalDate aDate){
        this.devolucaoEfetiva = aDate;
    }

    public Pessoas aPessoas(){
        Pessoas a = new Pessoas(email, devolucaoEfetiva.plusDays(7));
        return a;
    }

    public Itens returnItem(){
        return this.emprestado;
    }
    

    
}