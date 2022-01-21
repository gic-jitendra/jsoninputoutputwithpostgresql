package com.gicjava.net.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Output {
	
	Metadata metadata;
	List<Datum>  data;
}
