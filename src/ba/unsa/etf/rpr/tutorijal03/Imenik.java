package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    HashMap<String, TelefonskiBroj> mapa = new HashMap<>();
    void dodaj(String ime, TelefonskiBroj broj){

        mapa.put(ime, broj);
    }
    String dajBroj(String ime){
        for (Map.Entry<String, TelefonskiBroj>o: mapa.entrySet()) {
            if(o.getKey().equals(ime)){
                return o.getValue().ispisi();
            }
        }
        return null;
    }
    String dajIme(TelefonskiBroj broj){
        for (Map.Entry<String, TelefonskiBroj>o: mapa.entrySet()) {
            if(o.getValue().equals(broj)){
                return o.getKey();
            }
        }
        return null;
    }
    String naSlovo(char s){
        int i=1;
        for (Map.Entry<String, TelefonskiBroj>o: mapa.entrySet()) {
            if(o.getKey().charAt(0)=='s'){
                String.format("%d . %s - %s", i, o.getKey(), o.getValue());
            }
        }
        return null;
    }
    public Set<String> izGrada(FiksniBroj.Grad g){
            TreeSet<String> imena = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj>o: mapa.entrySet()) {
            if(o.getValue() instanceof TelefonskiBroj){
                FiksniBroj temp = (FiksniBroj) o.getValue();
                if(temp.dajGrad().equals(g))
                    imena.add(o.getKey());
            }
        }
        return imena;
    }
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        TreeSet<TelefonskiBroj> brojevi = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj>o: mapa.entrySet()) {
            if(o.getValue() instanceof TelefonskiBroj){
                FiksniBroj temp = (FiksniBroj) o.getValue();
                if(temp.dajGrad().equals(g)){
                    brojevi.add(o.getValue());
                }
            }
        }
        return brojevi;
    }
}
