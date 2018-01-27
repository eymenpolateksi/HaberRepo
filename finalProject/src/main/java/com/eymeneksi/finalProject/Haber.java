package com.eymeneksi.finalProject;
/**
 * Bu sınıfta bir haber nesnesinin bilgileri tutulur.
 * @author Eymen Polat Ekşi 
 */
public class Haber {
	private int id;
    private static int sayac=0;
    public String haberIcerik;
	/**
     * Bu fonksiyon sınıfımızın constructor'ı.
     * Haber nesnesi bu fonksiyondan yapılır.
     * @param haberIcerik haber metnini tutan deger.
     */
    public Haber(String haberIcerik) {
    	super();
    	this.id=++sayac;
    	this.haberIcerik=haberIcerik;
    }
	/**
     * Başka bir sınıfta private metodların
     * kullanılabilmesi için Getter
     * @return haberIcerik
     */
    public String gethaberIcerik() {
    	return haberIcerik;
    }
	/**
     * Başka bir sınıfta private degiskenlerin
     * kullanılabilmesi için Getter
     * @return id
     */
    public int getId() {
    	return id;
    }
}
