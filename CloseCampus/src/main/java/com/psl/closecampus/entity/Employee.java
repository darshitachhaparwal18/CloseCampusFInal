package com.psl.closecampus.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Employee {
	private String mac_addr;
	private String owner_name;
	private String vehicle_no;
	private String mob_no;

	@Override
	public String toString() {
		return "Employee [mac_addr=" + mac_addr + ", owner_name=" + owner_name
				+ ", vehicle_no=" + vehicle_no + ", mob_no=" + mob_no + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String mac_addr, String owner_name, String vehicle_no, String mob_no) {
		super();
		this.mac_addr = mac_addr;
		this.owner_name = owner_name;
		this.vehicle_no = vehicle_no;
		this.mob_no = mob_no;
	}

	public String getMac_addr() {
		return mac_addr;
	}

	public void setMac_addr(String mac_addr) {
		this.mac_addr = mac_addr;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

}
