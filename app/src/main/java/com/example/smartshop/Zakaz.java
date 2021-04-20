package com.example.smartshop;

public class Zakaz {

    String soni;
    String nomi;

    public Zakaz() {
    }

    public Zakaz(String soni, String nomi) {
        this.soni = soni;
        this.nomi = nomi;
    }

    public String getSoni() {
        return soni;
    }

    public void setSoni(String soni) {
        this.soni = soni;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }
}
