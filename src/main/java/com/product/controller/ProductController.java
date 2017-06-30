package com.product.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@CrossOrigin(origins = "*")
public class ProductController {

	public ProductController() {
	}

	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public @ResponseBody List<String> getFromCacheList(){
		List<String> value = new ArrayList<String>();
		value.add("Mohan");
		value.add("HariPriya");
		value.add("Vadiraja");
		return value;
	}	
}
