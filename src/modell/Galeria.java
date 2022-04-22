package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Galeria {
    private ArrayList<KiallitasiTargy> galeria = new ArrayList<>();

    public Galeria() {
    }
    
    public KiallitasiTargy ujKiallitasiTargy(KiallitasiTargy targy){
        galeria.add(targy);
        return targy;
    }
    
    public void keszitoRendez(){
        System.out.println("Galéria rendezése készítő szerint");
        Collections.sort(galeria);
        for (KiallitasiTargy targy : galeria) {
            System.out.println(targy);
        }
        System.out.println("");
    }
    
    public void cimRendez(){
        System.out.println("Galéria rendezése cím szerint");
        Comparator<KiallitasiTargy> targyCim = Comparator.comparing(KiallitasiTargy::getCim);
        Collections.sort(galeria, targyCim);
        for (KiallitasiTargy targy : galeria) {
            System.out.println(targy);
        }
        System.out.println("");
    }
}
