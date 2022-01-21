package com.gicjava.net.entity;

import java.util.Date;

import lombok.Data;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */


@Data
public class Metadata {
	public String processName;
	public String processId;
	public String stageId;
	public String task;
	public String taskGroupId;
	public Date requestDate;
	public String requestId;
	public String version;
	public int attempt;
	public String multiTask;
	public String requestAuthToken;
	public String txLabel;
}



















