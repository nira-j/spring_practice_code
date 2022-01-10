package org.autowiring.autowiringApp;

public class Flipkart {
	private Mobile mb;    //spring autowiring deals only with class type
	private Furniture fr;
	private Cosmetic cm;
	
	
	
	public Flipkart(Mobile mb, Furniture fr, Cosmetic cm) {
		super(); 
		this.mb = mb;
		this.fr = fr;
		this.cm = cm;
	}
	public Mobile getMb() {
		return mb;
	}
	public void setMb(Mobile mb) {
		this.mb = mb;
	}
	public Furniture getFr() {
		return fr;
	}
	public void setFr(Furniture fr) {
		this.fr = fr;
	}
	public Cosmetic getCm() {
		return cm;
	}
	public void setCm(Cosmetic cm) {
		this.cm = cm;
	}
	
	public void purchase() {
		System.out.println("Purchase confirmed by filpkart !!");
		mb.mobile();
		fr.sofa();
		cm.lipsteak();
	}
}
