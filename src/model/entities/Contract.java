package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installment = new ArrayList<>();
	
	public Contract() {
	}
	
	public Contract(Integer number, Date date, Double totalValeu) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValeu;
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
		return totalValue;
	}

	public void setTotalValeu(Double totalValeu) {
		this.totalValue = totalValeu;
	}

	public List<Installment> getInstallment() {
		return installment;
	}
	
	public void addInstallment(Installment installment) {
		this.installment.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		this.installment.remove(installment);
	}
}
