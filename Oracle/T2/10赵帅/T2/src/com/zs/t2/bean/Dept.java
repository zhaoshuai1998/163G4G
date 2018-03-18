package com.zs.t2.bean;

public class Dept {

	private int did;
	private String name;
	private int manager;
	private String tel;
	private int master;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int did, String name, int manager, String tel, int master) {
		super();
		this.did = did;
		this.name = name;
		this.manager = manager;
		this.tel = tel;
		this.master = master;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getMaster() {
		return master;
	}
	public void setMaster(int master) {
		this.master = master;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.did+"-"+this.name+"-"+this.master+"-"+this.tel+"-"+this.master;
	}
}
