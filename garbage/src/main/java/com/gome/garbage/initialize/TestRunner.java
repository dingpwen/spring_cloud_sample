package com.gome.garbage.initialize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.gome.garbage.service.HistoryService;

@Component
@Order(1)
public class TestRunner implements CommandLineRunner{
	@Autowired
	private HistoryService historyService;
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(historyService == null) {
			System.out.println("HistoryService initialize fail...");
		} else {
			System.out.println("HistoryService initialize success...");
		}
	}

}
