package com.Tns.adminservice;

public class admin {
    private Integer id;
    private String admin_name;
    private String mall_name;
    private String mall_location;
    private Integer admin_number;
    private String admin_designation;
    
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public admin(Integer id, String admin_name, String mall_name, String mall_location, Integer admin_number,
			String admin_designation) {
		super();
		this.id = id;
		this.admin_name = admin_name;
		this.mall_name = mall_name;
		this.mall_location = mall_location;
		this.admin_number = admin_number;
		this.admin_designation = admin_designation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getMall_name() {
		return mall_name;
	}

	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}

	public String getMall_location() {
		return mall_location;
	}

	public void setMall_location(String mall_location) {
		this.mall_location = mall_location;
	}

	public Integer getAdmin_number() {
		return admin_number;
	}

	public void setAdmin_number(Integer admin_number) {
		this.admin_number = admin_number;
	}

	public String getAdmin_designation() {
		return admin_designation;
	}

	public void setAdmin_designation(String admin_designation) {
		this.admin_designation = admin_designation;
	}

	@Override
	public String toString() {
		return "admin [id=" + id + ", admin_name=" + admin_name + ", mall_name=" + mall_name + ", mall_location="
				+ mall_location + ", admin_number=" + admin_number + ", admin_designation=" + admin_designation + "]";
	}

}
