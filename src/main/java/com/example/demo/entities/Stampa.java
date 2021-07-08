package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="STAMPA")
public class Stampa {
	
	public Stampa(Integer id, String name, String url, List<Prezzo> prezzi) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.prezzi = prezzi;
	}	

	public Stampa() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(
			nullable = false,
			unique = true
	)
	private String name;
	
	private String url;
	
	@OneToMany(mappedBy= "stampa")
	private List<Prezzo> prezzi = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Prezzo> getPrezzi() {
		return prezzi;
	}

	public void setPrezzi(List<Prezzo> prezzi) {
		this.prezzi = prezzi;
	}

}