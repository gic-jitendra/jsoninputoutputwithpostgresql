package com.gicjava.net.entity;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Root {
	public Metadata metadata;
	public ArrayList<Datum> data;
}
