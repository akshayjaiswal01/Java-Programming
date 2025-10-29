package com.demo.beans;

import java.util.Objects;

public class Item 
{
	private int iid;
	private String iname;
	private int iqty;
	private double iprice;
	
	
	public Item() {
		super();
	}


	public Item(int iid, String iname, int iqty, double iprice) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iqty = iqty;
		this.iprice = iprice;
	}
	
	


	@Override
	public int hashCode() {
		return this.iid;
	}


	@Override
	public boolean equals(Object obj) {
		return this.iid == ((Item)obj).iid;
	}


	public int getIid() {
		return iid;
	}


	public void setIid(int iid) {
		this.iid = iid;
	}


	public String getIname() {
		return iname;
	}


	public void setIname(String iname) {
		this.iname = iname;
	}


	public int getIqty() {
		return iqty;
	}


	public void setIqty(int iqty) {
		this.iqty = iqty;
	}


	public double getIprice() {
		return iprice;
	}


	public void setIprice(double iprice) {
		this.iprice = iprice;
	}


	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", iqty=" + iqty + ", iprice=" + iprice + "]";
	}
	
	
	
}
