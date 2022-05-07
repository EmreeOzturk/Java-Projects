package com.project.connection1;

public class Personel implements IEntity{
    private int personalID;
    private String adi;
    private String soyadi;
    private int dogumYili;
    private String personelNo;

    public Personel() {
    }

    public Personel(int personalID, String adi, String soyadi, int dogumYili, String personelNo) {
        this.personalID = personalID;
        this.adi = adi;
        this.soyadi = soyadi;
        this.dogumYili = dogumYili;
        this.personelNo = personelNo;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personalID=" + personalID +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", dogumYili=" + dogumYili +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }
}
