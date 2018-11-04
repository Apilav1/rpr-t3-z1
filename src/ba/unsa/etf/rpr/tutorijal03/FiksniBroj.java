package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String broj="";
    public enum Grad{SARAJEVO, TUZLA, ZENICA, MOSTAR};
    private Grad grad;
    FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        if(this.grad == Grad.SARAJEVO) return "033/"+this.broj;
        if(this.grad == Grad.TUZLA) return "035/"+this.broj;
        if(this.grad == Grad.ZENICA) return "032/"+this.broj;
        if(this.grad == Grad.MOSTAR) return "036/"+this.broj;
        return null;
    }
    @Override
    public int hashCode(){
        return 0;
    }

    public String dajBroj(){
        return broj;
    }

    public Grad dajGrad(){ return grad; }
}
