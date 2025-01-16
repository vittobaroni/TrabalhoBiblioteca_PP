import java.time.LocalDate;
import java.time.Period;

public class Pessoas {
    private String email;
    private LocalDate unban;

    public Pessoas(String email, LocalDate unbandDate){
        this.email = email;
        this.unban = unbandDate;
    }
    public String arquivoString(){
        return email + "," + unban;
    }
    
    public String toString(){
        return "Email: " + email + ", até: " + unban + "\n\n";
    }

    public boolean removeBan(){
        Period period = Period.between(this.unban, LocalDate.now());
        if(period.isNegative()==true || period.isZero()==true){
            return true;
        }else{
            return false;
        }
    }
}
