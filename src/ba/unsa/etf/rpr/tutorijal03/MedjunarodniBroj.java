package ba.unsa.etf.rpr.tutorijal03;

public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    MedjunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return drzava+broj;
    }
    @Override
    public int hashCode(){
        return 0;
    }
}
