package com.gicjava.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

import org.apache.commons.io.IOUtils;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.gicjava.net.entity.Component;
import com.gicjava.net.entity.ComponentScoping;
import com.gicjava.net.entity.Input;
import com.gicjava.net.entity.Record;
import com.gicjava.net.entity.TaskSpecs;

public class JsonReaderMain {

	/*
	 * public static void main(String[] args) throws IOException { String s =
	 * loadJsonString("json","InputJson.json"); ObjectMapper objmap = new
	 * ObjectMapper(); Input ip= objmap.readValue(s, Input.class);
	 * //System.out.println(ip); //System.out.println(s);
	 * //ip.getData().stream().map(o->o.getTaskSpecs()).
	 * //map(o->o.getComponentScoping().stream().map(c->c.getComponents().map()))
	 * List<TaskSpecs> ts=ip.getData().stream().map(o->o.getTaskSpecs()).toList();
	 * for(TaskSpecs t:ts){
	 * 
	 * for(ComponentScoping cs: t.getComponentScoping()) { for(Component c:
	 * cs.getComponents()) { for(Record d: c.getRecords()) {
	 * if("Include".equalsIgnoreCase(d.getResult())) {
	 * System.out.println(d.getResult()); }
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * //Method of Load JSOn String public static String loadJsonString(String
	 * folder, String fileName) throws IOException { InputStream inputStream =
	 * JsonReaderMain.class.getClassLoader().getResourceAsStream(folder + "/" +
	 * fileName); StringWriter writer = new StringWriter();
	 * IOUtils.copy(inputStream, writer, "UTF-8"); return writer.toString(); }
	 */
}
