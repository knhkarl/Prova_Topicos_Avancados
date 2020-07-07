package com.univas.ENTITIES;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delivery {
	
	private static final long serialVersionUID = 7876988844153860663L;

	@Id
	@Column(name="ORDERCODE")
	private float ordercode;
	
	private String cpf;
	private Date delivery_date;
	private String cep;
	private String delivery_status;
	
	public Delivery() {
	}

	public Delivery(Float ordercode, String cpf, Date delivery_date, String cep, String delivery_status) {
		super();
		this.ordercode = ordercode;
		this.cpf = cpf;
		this.delivery_date = delivery_date;
		this.cep = cep;
		this.delivery_status = delivery_status;
		
	}

	public float getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(float ordercode) {
		this.ordercode = ordercode;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}

}
