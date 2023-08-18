package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class pah_2 {
	@GetMapping("/hg")
	
	public List<Address> getAddress()
	{
		return Arrays.asList(new Address("Varshaa",45,"Maven Street",641786,"Pores Garden","Coimbatore","TamilNadu","India"));
	}
	

}
