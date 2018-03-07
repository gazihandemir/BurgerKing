package com.gazihan;

public class Main {

    public static void main(String[] args) {
       /* Burger king satış uygulaması
        Bu uygulamanın amacı işletmenin hamburger satış işlemlerini gerçekleştirmesini saglamaktır.
        uygulama hamburger bilgilerini ve satış bilgilerini tutacaktır.
        Magazada 3 çeşit hamburger bulunmaktadır

        1-)sade hamburger : Ekmek türü ve içindeki et çeşidi ve 4 tane extra bilgisi alınabilir.
        müsterinin istedigi extra seyelr(sos,domates,patates gibi) toplam fiyata dahil edilmeilidir

        2-)Saglıklı Burger : Bu burgerin ekmek türü kepeklidir . 6 taneye kadar ekstra ürün daha içerebilir

        3-)Baba Burger : Bu burger de patates kızartması ve içecek kendinden tanımlıdır.extra ürün içermez

        Fiyat listesi methodu :
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


        */
        Hamburger  hamburger1 = new Hamburger("Sade Hamburger ","Beyaz ekmek","kırmızı et ",9.99);
        hamburger1.fiyatListesi();
        hamburger1.ekleİlaveUrun1("patetes kızarması ",3.30);
        hamburger1.ekleİlaveUrun2("sogan halkaları : ",4.50);
        hamburger1.ekleİlaveUrun3("sos",1);
        hamburger1.ekleİlaveUrun4("sosisler  ",3.50);
        System.out.println("toplam tutar : "+hamburger1.hamburgerBilgileri());

        SaglıklıBurger saglıklıBurger1 =  new SaglıklıBurger("Kırmızı et",7.99);
        saglıklıBurger1.ekleİlaveUrun1("patates kızartmasi  ",3.30);
        saglıklıBurger1.ekleİlaveUrun2("su",1);
        saglıklıBurger1.ekleİlaveUrun3("pataptes kızartmasi ",3.30);
        saglıklıBurger1.ekleİlaveUrun4("sogan halkaları : ",4.20);
        saglıklıBurger1.ekleSaglikliUrun1("su",1);
        saglıklıBurger1.ekleSaglikliUrun2("domates",0.75);
        System.out.println("toplam tutar : "+saglıklıBurger1.hamburgerBilgileri());

        BabaBurger babaBurger1 = new BabaBurger();
        babaBurger1.ekleİlaveUrun1("patates kızartması ",12.00);
        babaBurger1.ekleİlaveUrun4("sogan halkaları ",20.00);
        System.out.println("toplam tutar : "+babaBurger1.hamburgerBilgileri());
    }
}
