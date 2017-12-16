package com.qhit.lh.g4.lmy.t2.bean;



public class emp {
	private Integer oid;
	private String empname;
	private String empsex;
	private String birthday;
	private String deptid;
	
	public emp(Integer oid, String empname, String empsex, String birthday,
			String deptid) {
		super();
		this.oid = oid;
		this.empname = empname;
		this.empsex = empsex;
		this.birthday = birthday;
		this.deptid = deptid;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpsex() {
		return empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	
	
	

}
