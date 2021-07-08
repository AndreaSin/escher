package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="PREZZO")
public class Prezzo {
	
	public Prezzo() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(
			nullable = false
	)
	private double price;
	
	private String url;
	
	@ManyToOne
	@JoinColumn(name="STAMPA_ID")
	private Stampa stampa;

	public Prezzo(Integer id, double price, String url, Stampa stampa) {
		this.id = id;
		this.price = price;
		this.url = url;
		this.stampa = stampa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Stampa getStampa() {
		return stampa;
	}

	public void setStampa(Stampa stampa) {
		this.stampa = stampa;
	}

}
