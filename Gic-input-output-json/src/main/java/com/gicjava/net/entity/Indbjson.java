package com.gicjava.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "inoutjson")
@Data
public class Indbjson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name = "jsondata" , nullable=false)
	public String jsondata;
	
	public Indbjson() {
		
	}

	public Indbjson(String jsondata) {
		super();
		this.jsondata = jsondata;
	}
	
	

}
