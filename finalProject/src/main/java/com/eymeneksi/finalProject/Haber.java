package com.eymeneksi.finalProject;

public class Haber {
	private int id;
    private static int sayac=0;
    public String haberIcerik;
    public Haber(String haberIcerik) {
    	super();
    	this.id=++sayac;
    	this.haberIcerik=haberIcerik;
    }
    public String gethaberIcerik() {
    	return haberIcerik;
    }
    public int getId() {
    	return id;
    }
}
