package com.tcs.fresco.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discount")
public class DiscountController {	
	
	@RequestMapping(value="/{amount}", method=RequestMethod.GET)	
	public Double getDiscount(@PathVariable("amount") Double amount) throws InterruptedException {
		Thread.sleep(2000);		
		if (amount >= 100) {
			return (amount*5/100);
		}
		return (double) 0;
	}

}
