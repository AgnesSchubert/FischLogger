package com.example.agnes.fischlogger;

/**
 * Created by Agnes on 12.06.2017.
 */

public class Fish {
    private String art;
    private double laenge;
    private Seite bpa;
    private Seite sv;
    private boolean haematom;
    private String heamatom_stelle;
    private boolean schuerfung;
    private String schuerfung_stelle;
    private boolean schuerfung_verpilzt;
    private boolean ow;
    private String ow_stelle;
    private boolean ow_verpilzt;
    private boolean ta;
    private String ta_stelle;
    private boolean totaldurchtrennung;
    private boolean verpilzung;
    private String bemerkung;
    private double datum;
    private long id;


    public Fish(
            String art,
            double laenge,
            Seite bpa,
            Seite sv,
            boolean haematom,
            String heamatom_stelle,
            boolean schuerfung,
            String schuerfung_stelle,
            boolean schuerfung_verpilzt,
            boolean ow,
            String ow_stelle,
            boolean ow_verpilzt,
            boolean ta,
            String ta_stelle,
            boolean totaldurchtrennung,
            boolean verpilzung,
            String bemerkung,
            double datum,
            long id
    ) {
        this.art = art;
        this.laenge = laenge;
        this.bpa = bpa;
        this.sv = sv;
        this.haematom = haematom;
        this.heamatom_stelle = heamatom_stelle;
        this.schuerfung = schuerfung;
        this.schuerfung_stelle = schuerfung_stelle;
        this.schuerfung_verpilzt = schuerfung_verpilzt;
        this.ow = ow;
        this.ow_stelle = ow_stelle;
        this.ow_verpilzt = ow_verpilzt;
        this.ta = ta;
        this.ta_stelle = ta_stelle;
        this.totaldurchtrennung = totaldurchtrennung;
        this.verpilzung = verpilzung;
        this.bemerkung = bemerkung;
        this.datum = datum;
        this.id = id;
    }

    // Getter & Setter
    public String getArt() {return art;}
    public void setArt(String art) {this.art = art;}
    public double getLaenge() {return laenge;}
    public void setLaenge(double laenge) {this.laenge = laenge;}
    public Seite getBpa() {return bpa;}
    public void setBpa(Seite bpa) {this.bpa = bpa;}
    public Seite getSv() {return sv;}
    public void setSv(Seite sv) {this.sv = sv;}
    public boolean getHaematom() {return haematom;}
    public void setHaematom(boolean haematom) {this.haematom = haematom;}
    public String getHaematomStelle() {return heamatom_stelle;}
    public void setHaematomStelle(String heamatom_stelle) {this.heamatom_stelle = heamatom_stelle;}
    public boolean getSchuerfung() {return schuerfung;}
    public void setSchuerfung(boolean schuerfung) {this.schuerfung = schuerfung;}
    public String getSchuerfungStelle() {return schuerfung_stelle;}
    public void setSchuerfungStelle(String schuerfung_stelle) {this.schuerfung_stelle = schuerfung_stelle;}
    public boolean getSchuerfungVerpilzt() {return schuerfung_verpilzt;}
    public void setSchuerfungVerpilzt(boolean schuerfung_verpilzt) {this.schuerfung_verpilzt = schuerfung_verpilzt;}
    public boolean getOw() {return ow;}
    public void setOw(boolean ow) {this.ow = ow;}
    public String getOwStelle() {return ow_stelle;}
    public void setOwStelle(String ow_stelle) {this.ow_stelle = ow_stelle;}
    public boolean getOwVerpilzt() {return ow_verpilzt;}
    public void setOwVerpilzt(boolean ow_verpilzt) {this.ow_verpilzt = ow_verpilzt;}
    public boolean getTa() {return ta;}
    public void setTa(boolean ta) {this.ta = ta;}
    public String getTaStelle() {return ta_stelle;}
    public void setTaStelle(String ta_stelle) {this.ta_stelle = ta_stelle;}
    public boolean getTotaldurchtrennung() {return totaldurchtrennung;}
    public void setTotaldurchtrennung(boolean totaldurchtrennung) {this.totaldurchtrennung = totaldurchtrennung;}
    public boolean getVerpilzung() {return verpilzung;}
    public void setVerpilzung(String bemerkung) {this.verpilzung = verpilzung;}
    public String getBemerkung() {return bemerkung;}
    public void setBemerkung(String bemerkung) {this.bemerkung = bemerkung;}
    public double getDatum() {return datum;}
    public void setDatum(double datum) {this.datum = datum;}
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    @Override
    public String toString() {
        String output = art + " : " + laenge;
        return output;
    }

}
