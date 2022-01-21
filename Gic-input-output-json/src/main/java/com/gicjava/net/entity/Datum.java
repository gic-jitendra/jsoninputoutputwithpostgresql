package com.gicjava.net.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class Datum {
	public String taskName;
	public String taskId;
	public String taskBy;
	public int taskSerialNo;
	@JsonInclude(value = Include.NON_NULL)
	public TaskSpecs taskSpecs;
	@JsonInclude(value = Include.NON_NULL)
	public Result result;
}
