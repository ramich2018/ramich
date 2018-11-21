package com.aatout.web;


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

import com.aatout.dao.BienRepository;
import com.aatout.model.Bien;






@RestController
@CrossOrigin("*")
public class BienRestService {
	@Autowired
	private BienRepository bienRepository;
	
	@RequestMapping(value="/biens",method=RequestMethod.GET)
	public List<Bien> getOperations(){
		return bienRepository.findAll();
	}
	
	@RequestMapping(value="/biens/{id}",method=RequestMethod.GET)
	public Bien getBien(@PathVariable Long id){
		return bienRepository.findOne(id);
	}
	
	@RequestMapping(value="/chercherBiens",method=RequestMethod.GET)
	public Page<Bien> chercherBiens(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return bienRepository.chercher("%"+mc+"%", new PageRequest(page, size));
	}
	
	@RequestMapping(value="/biens",method=RequestMethod.POST)
	public Bien saveBien(@RequestBody Bien c){
		return bienRepository.save(c);
	}
	
	@RequestMapping(value="/biens/{id}",method=RequestMethod.PUT)
	public Bien saveBien(@PathVariable Long id,@RequestBody Bien c){
		c.setId(id);
		return bienRepository.save(c);
	}

}
