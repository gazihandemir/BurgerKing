package com.gazihan;

public class BabaBurger extends Hamburger{
    public BabaBurger(){
        super("Baba Burger "," Beyaz ekmek ","kırmızı et ",14.99);
        super.ekleİlaveUrun1("patates kızartması ",3.30);
        super.ekleİlaveUrun2("kola ",2.00);
    }
    public void ekleİlaveUrun1(String ismi,double fiyati){
        System.err.println("Baba burgere ilave ürün eklenemez ");
    }
    public void ekleİlaveUrun2(String ismi,double fiyati){
        System.err.println("Baba Burgere ilave ürün eklenemez ");
    }
    @Override
    public void ekleİlaveUrun3(String ismi, double fiyati) {
        System.err.println("Baba Burgere ilave ürün eklenemez");
    }

    @Override
    public void ekleİlaveUrun4(String ismi, double fiyati) {
        System.err.println("Baba Burgere ilave ürün eklenemez");
    }

    @Override
    public double hamburgerBilgileri() {
        double toplamFiyat = super.hamburgerBilgileri();
        return toplamFiyat;
    }
}
