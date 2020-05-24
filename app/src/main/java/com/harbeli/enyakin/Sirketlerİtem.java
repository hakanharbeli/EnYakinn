package com.harbeli.enyakin;

public class Sirketlerİtem {
    private String SirketAdi;
    private String SirketAdresiİl;
    private String SirketAdresİlce;
    private String SirketKampanya;
    private String SirketParapuan;

    public Sirketlerİtem() {
    }

    public Sirketlerİtem(String sirketAdi, String sirketAdresiİl, String sirketAdresİlce, String sirketKampanya, String sirketParapuan) {
        SirketAdi = sirketAdi;
        SirketAdresiİl = sirketAdresiİl;
        SirketAdresİlce = sirketAdresİlce;
        SirketKampanya = sirketKampanya;
        SirketParapuan = sirketParapuan;
    }

    public String getSirketAdi() {
        return SirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        SirketAdi = sirketAdi;
    }

    public String getSirketAdresiİl() {
        return SirketAdresiİl;
    }

    public void setSirketAdresiİl(String sirketAdresiİl) {
        SirketAdresiİl = sirketAdresiİl;
    }

    public String getSirketAdresİlce() {
        return SirketAdresİlce;
    }

    public void setSirketAdresİlce(String sirketAdresİlce) {
        SirketAdresİlce = sirketAdresİlce;
    }

    public String getSirketKampanya() {
        return SirketKampanya;
    }

    public void setSirketKampanya(String sirketKampanya) {
        SirketKampanya = sirketKampanya;
    }

    public String getSirketParapuan() {
        return SirketParapuan;
    }

    public void setSirketParapuan(String sirketParapuan) {
        SirketParapuan = sirketParapuan;
    }
}
