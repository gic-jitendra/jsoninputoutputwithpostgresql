package com.gicjava.net.entity;

import java.util.ArrayList;

import lombok.Data;

@Data
public class RuleResult {
	public ArrayList<String> result;
	public boolean success;
	public String message;
	public int status;
}