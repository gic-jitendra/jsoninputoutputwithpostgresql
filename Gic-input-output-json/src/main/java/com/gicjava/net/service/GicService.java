package com.gicjava.net.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gicjava.net.entity.Component;
import com.gicjava.net.entity.ComponentScoping;
import com.gicjava.net.entity.Input;
import com.gicjava.net.entity.MultiEngineResults;
import com.gicjava.net.entity.Record;
import com.gicjava.net.entity.TaskSpecs;


@Service
public class GicService {

	public void convrtot(Input ip) {
		List<TaskSpecs> ts = ip.getData().stream().map(o -> o.getTaskSpecs()).toList();
		for (TaskSpecs t : ts) {
			for (ComponentScoping cs : t.getComponentScoping()) {
				for (Component c : cs.getComponents()) {
					for (Record d : c.getRecords()) {
						for( String r:d.getRuleResult().getResult())                
						   if ("Include".equalsIgnoreCase(r)) {
							  d.setMultiEngineResults(getmultiEngineResults());
							 System.out.println("got the reuslt as "+r);
						  }
					}
				}

			}

		}
	}
	
	
	public MultiEngineResults getmultiEngineResults()	{
		MultiEngineResults multiengineResults = new MultiEngineResults();
			multiengineResults.setCbvutvi4vResult("xyz");
		    multiengineResults.setSuspectResult("abc");
		    multiengineResults.setUniqueResult("ddd");
		    multiengineResults.setWellknownResult("gic");
			return multiengineResults;		
	    }
	
	
	
	
	
	

}

