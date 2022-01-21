package com.gicjava.net.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gicjava.net.entity.ComponentScoping;
import com.gicjava.net.entity.Input;
import com.gicjava.net.entity.Result;
import com.gicjava.net.service.GicService;

@RestController
@RequestMapping("/api/v1/")
public class GicController {
	
	@Autowired
	GicService gicService;
	
	
		@PostMapping("/save")
		public Input inputJson(@RequestBody Input json)	{
			System.out.println(json);
			gicService.convrtot(json);	
			ArrayList<ComponentScoping> cs=json.getData().get(0).getTaskSpecs().getComponentScoping();
			Result rs = new Result();
			rs.setComponentScoping(cs);
			json.getData().get(0).setResult(rs);
			json.getData().get(0).setTaskSpecs(null);
			return json;		
			}
		
		
		
	
	
}
