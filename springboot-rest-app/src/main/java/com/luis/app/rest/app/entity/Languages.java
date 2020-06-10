package com.luis.app.rest.app.entity;

public class Languages {
	
	private String iso1;
	private String iso2;
	private String name;
	private String nativeName;
	
	
	public String getIso1() {
		return iso1;
	}
	public void setIso1(String iso1) {
		this.iso1 = iso1;
	}
	public String getIso2() {
		return iso2;
	}
	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	@Override
	public String toString() {
		return "Languages [iso1=" + iso1 + ", iso2=" + iso2 + ", name=" + name + ", nativeName=" + nativeName + "]";
	}
	
	
	

}
