package com.gazihan;

public class SaglıklıBurger extends  Hamburger {
    public String ilaveSaglikliUrunAdi1;
    public double ilaveSaglikliUrunFiyat1;

    public String ilaveSaglikliUrunAdi2;;
    public double ilaveSaglikliUrunFiyati2;;
    public void ekleSaglikliUrun1(String ismi,double fiyati){
        this.ilaveSaglikliUrunAdi1 = ismi;
        this.ilaveSaglikliUrunFiyat1 = fiyati;
    }
    public void ekleSaglikliUrun2(String ismi,double fiyati){
        this.ilaveSaglikliUrunAdi2 = ismi;
        this.ilaveSaglikliUrunFiyati2=fiyati;
    }



    public SaglıklıBurger(  String etCesiti, double fiyati) {
        super("SaglikliBurger ","Kepekli ekmek ", etCesiti, fiyati);

    }

    @Override
    public double hamburgerBilgileri() {
        double toplamFiyat = super.hamburgerBilgileri();
        if(ilaveSaglikliUrunAdi1 != null){
            toplamFiyat+=ilaveSaglikliUrunFiyat1;
            System.out.println("ilave ürün : "+this.ilaveSaglikliUrunAdi1+" fiyati : "+this.ilaveSaglikliUrunFiyat1);
        }
        if(ilaveSaglikliUrunAdi2 != null){
            toplamFiyat+=ilaveSaglikliUrunFiyati2;
            System.out.println("ilave ürün : "+this.ilaveSaglikliUrunAdi2+" fiyati : "+this.ilaveSaglikliUrunFiyati2);
        }


        return toplamFiyat;
    }
}
