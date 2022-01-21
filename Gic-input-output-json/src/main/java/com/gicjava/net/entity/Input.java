package com.gicjava.net.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)


public class Input {
	
	Metadata metadata;
	List<Datum>  data;
}
