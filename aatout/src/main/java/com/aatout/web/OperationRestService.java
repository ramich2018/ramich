package com.aatout.web;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aatout.dao.OperationRepository;
import com.aatout.model.Operation;

@RestController
@CrossOrigin("*")
public class OperationRestService {
	@Autowired
	private OperationRepository operationRepository;
	
	@RequestMapping(value="/operations",method=RequestMethod.GET)
	public List<Operation> getOperations(){
		return operationRepository.findAll();
	}
	
	@RequestMapping(value="/operations/{id}",method=RequestMethod.GET)
	public Operation getOperation(@PathVariable Long id){
		return operationRepository.findOne(id);
	}
	
	@RequestMapping(value="/chercherOperationsDte",method=RequestMethod.GET)
	public Page<Operation> chercherOpDte(
			@RequestParam(name="mc",defaultValue="")Date mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return operationRepository.chercherDate(mc, new PageRequest(page, size));
	}
	
/*	@RequestMapping(value="/chercherOperationsMnt",method=RequestMethod.GET)
	public Page<Operation> chercherOpMnt(
			@RequestParam(name="mc",defaultValue="")Double mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return operationRepository.chercherMontant(mc, new PageRequest(page, size));
	} */
	
	@RequestMapping(value="/operations",method=RequestMethod.POST)
	public Operation saveOperation(@RequestBody Operation c){
		return operationRepository.save(c);
	}
	
	@RequestMapping(value="/operations/{id}",method=RequestMethod.PUT)
	public Operation saveOperation(@PathVariable Long id,@RequestBody Operation c){
		c.setId(id);
		return operationRepository.save(c);
	}

}
