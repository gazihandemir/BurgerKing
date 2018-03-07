package com.gazihan;

public class Hamburger {
    private String ismi;
    private String ekmekCesiti;
    private String etCesiti;
    private  double fiyati;
    public String ilaveUrunAdi1;
    public double ilaveUrunFiyati1;

    public String ilaveUrunAdi2;
    public double ilaveUrunFiyati2;

    public String ilaveUrunAdi3;
    public double ilaveUrunFiyati3;

    public String ilaveUrunAdi4;
    public double ilaveUrunFiyati4;
    public void ekleİlaveUrun1(String ismi,double fiyati){
        this.ilaveUrunAdi1=ismi;
        this.ilaveUrunFiyati1=fiyati;
    }
    public void ekleİlaveUrun2(String ismi,double fiyati){
        this.ilaveUrunAdi2=ismi;
        this.ilaveUrunFiyati2=fiyati;
    }
    public void ekleİlaveUrun3(String ismi,double fiyati){
        this.ilaveUrunAdi3=ismi;
        this.ilaveUrunFiyati3=fiyati;
    }
    public void ekleİlaveUrun4(String ismi,double fiyati){
        this.ilaveUrunAdi4=ismi;
        this.ilaveUrunFiyati4=fiyati;
    }
    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekCesiti() {
        return ekmekCesiti;
    }

    public void setEkmekCesiti(String ekmekCesiti) {
        this.ekmekCesiti = ekmekCesiti;
    }

    public String getEtCesiti() {
        return etCesiti;
    }

    public void setEtCesiti(String etCesiti) {
        this.etCesiti = etCesiti;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        if(this.fiyati < 0){
            System.out.println("lütfen fiyatı dogru giriniz ");
        }else
            this.fiyati = fiyati;
    }
    public Hamburger(String ismi,String ekmekCesiti,String etCesiti,double fiyati){
        this.ismi=ismi;
        this.ekmekCesiti=ekmekCesiti;
        this.etCesiti=etCesiti;
        this.fiyati=fiyati;
       /*setIsmi(ismi);
       setEkmekCesiti(ekmekCesiti);
       setEtCesiti(etCesiti);
       setFiyati(fiyati);*/
    }
    public double hamburgerBilgileri(){
        System.out.println();
        double toplamFiyat =this.fiyati;
        System.out.println("HAMBURGER ADİ : "+ismi
                +" Ekmek çeşiti : "+ekmekCesiti
                +" Et çeşiti : "+etCesiti
                +" fiyati : "+fiyati);
        if(this.ilaveUrunAdi1!=null){
            toplamFiyat+=ilaveUrunFiyati1;
            System.out.println("ilave ürün : "+this.ilaveUrunAdi1+" fiyati : "+this.ilaveUrunFiyati1);
        }
        if(this.ilaveUrunAdi2 != null){
            toplamFiyat+=ilaveUrunFiyati2;
            System.out.println("ilave ürün : "+this.ilaveUrunAdi2+" fiyati : "+this.ilaveUrunFiyati2);
        }
        if(this.ilaveUrunAdi3 != null){
            toplamFiyat+=ilaveUrunFiyati3;
            System.out.println("ilave ürün : "+this.ilaveUrunAdi3+" fiyati : "+this.ilaveUrunFiyati3);
        }
        if(this.ilaveUrunAdi4 !=null){
            toplamFiyat+=ilaveUrunFiyati4;
            System.out.println("ilave ürün : "+this.ilaveUrunAdi4+" fiyati : "+this.ilaveUrunFiyati4);
        }

        return toplamFiyat;
    }
    public void fiyatListesi(){
        System.out.println("Sade hamburger :9.99");
        System.out.println("Saglıklı Burger  :7.99");
        System.out.println("Baba Burger : 14,99");
        System.out.println("patates kızartması : 3.30");
        System.out.println("sogan halkaları : 4.20");
        System.out.println("soslar : 1.00");
        System.out.println("su : 1.00");
        System.out.println("salata : 5.50");
        System.out.println("sosisler : 3.50");
        System.out.println("domates : 0.75");
        System.out.println("kola : 2.00");
    }





































}
