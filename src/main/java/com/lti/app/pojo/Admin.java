package com.lti.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allflight01")
public class Admin {
	
	@Id
	@Column(name="flightno")
	private String flightno;
	@Column(name="flightname")
	private String flightname;
	@Column(name="fromdept")
	private String fromdept;
	@Column(name="toarrive")
	private String toarrive;
	@Column(name="depart")
	private String depart;
	@Column(name="arrival")
	private String arrival;
	@Column(name="flightecoprice")
	private String flightecoprice;
	@Column(name="flightbusprice")
	private String flightbusprice ;
	@Column(name="duration")
	private String duration;
	@Column(name="cabin")
	private String cabin;
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getFromdept() {
		return fromdept;
	}
	public void setFromdept(String fromdept) {
		this.fromdept = fromdept;
	}
	public String getToarrive() {
		return toarrive;
	}
	public void setToarrive(String toarrive) {
		this.toarrive = toarrive;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getFlightecoprice() {
		return flightecoprice;
	}
	public void setFlightecoprice(String flightecoprice) {
		this.flightecoprice = flightecoprice;
	}
	public String getFlightbusprice() {
		return flightbusprice;
	}
	public void setFlightbusprice(String flightbusprice) {
		this.flightbusprice = flightbusprice;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	@Override
	public String toString() {
		return "Admin [flightno=" + flightno + ", flightname=" + flightname + ", fromdept=" + fromdept + ", toarrive="
				+ toarrive + ", depart=" + depart + ", arrival=" + arrival + ", flightecoprice=" + flightecoprice
				+ ", flightbusprice=" + flightbusprice + ", duration=" + duration + ", cabin=" + cabin + "]";
	}
	public Admin(String flightno, String flightname, String fromdept, String toarrive, String depart,
			String arrival, String flightecoprice, String flightbusprice, String duration, String cabin) {
		super();
		this.flightno = flightno;
		this.flightname = flightname;
		this.fromdept = fromdept;
		this.toarrive = toarrive;
		this.depart = depart;
		this.arrival = arrival;
		this.flightecoprice = flightecoprice;
		this.flightbusprice = flightbusprice;
		this.duration = duration;
		this.cabin = cabin;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
