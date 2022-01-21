package com.gicjava.net.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaskSpecs {
	@JsonProperty("ComponentScoping")
	public ArrayList<ComponentScoping> componentScoping;
}
