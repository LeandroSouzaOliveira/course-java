package model.entities;

import java.util.Date;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValeu;
	
	public Contract() {
	}
	
	public Contract(Integer number, Date date, Double totalValeu) {
		this.number = number;
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getTotalValeu() {
		return totalValeu;
	}

	public void setTotalValeu(Double totalValeu) {
		this.totalValeu = totalValeu;
	}
}
