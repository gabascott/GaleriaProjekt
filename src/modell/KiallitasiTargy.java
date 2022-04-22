package modell;

import java.time.LocalDate;

public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>{
    private LocalDate letrehozasDatum;
    private String keszito, cim;

    public KiallitasiTargy(String keszito, String cim) {
        this.keszito = keszito;
        this.cim = cim;
        letrehozasDatum = LocalDate.now();
    }

    public KiallitasiTargy(LocalDate letrehozasDatum, String keszito, String cim) {
        this.letrehozasDatum = letrehozasDatum;
        this.keszito = keszito;
        this.cim = cim;
    }

    public LocalDate getLetrehozasDatum() {
        return letrehozasDatum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }
    
    @Override
    public String toString() {
        return "KiallitasiTargy{" + "letrehozasDatum=" + letrehozasDatum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }

    @Override
    public int compareTo(KiallitasiTargy o) {
        return this.getKeszito().compareTo(o.getKeszito());
    }

    
}
