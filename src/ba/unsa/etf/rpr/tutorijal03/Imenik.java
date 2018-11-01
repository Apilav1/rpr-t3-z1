package ba.unsa.etf.rpr.tutorijal03;

import java.util.Map;

public class Imenik {
    Map<String, TelefonskiBroj> mapa;
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
}
