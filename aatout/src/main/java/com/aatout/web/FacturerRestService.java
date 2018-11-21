package com.aatout.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aatout.dao.FacturerRepository;
import com.aatout.model.Facturer;

@RestController
@CrossOrigin("*")
public class FacturerRestService {
	@Autowired
	private FacturerRepository facturerRepository;
	
	@RequestMapping(value="/facturers",method=RequestMethod.GET)
	public List<Facturer> getFacturers(){
		return facturerRepository.findAll();
	}
	
	@RequestMapping(value="/facturers",method=RequestMethod.POST)
	public Facturer saveFacturer(@RequestBody Facturer c){
		return facturerRepository.save(c);
	}
}
