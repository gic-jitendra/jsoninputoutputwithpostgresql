package com.gicjava.net.entity;

import lombok.Data;

@Data
public class DatumOutput {
	public String taskName;
	public String taskId;
	public String taskBy;
	public int taskSerialNo;
	public TaskSpecs taskSpecs;
	public Result result;
}

