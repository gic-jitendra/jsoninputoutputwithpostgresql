package com.gicjava.net.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Component {
	@JsonProperty("CANDIDATE_DE_COMPLETED_DT")
	public String cANDIDATE_DE_COMPLETED_DT;
	@JsonProperty("PRODUCT")
	public String pRODUCT;
	@JsonProperty("Component name")
	public String componentName;
	public boolean dbComponent;
	@JsonProperty("Records")
	public ArrayList<Record> records;
}
