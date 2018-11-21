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

import com.aatout.dao.CompteRepository;
import com.aatout.model.Compte;






@RestController
@CrossOrigin("*")
public class CompteRestService {
	@Autowired
	private CompteRepository compteRepository;
	
	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	public List<Compte> getComptes(){
		return compteRepository.findAll();
	}
	
	@RequestMapping(value="/comptes/{numCompte}",method=RequestMethod.GET)
	public Compte getCompte(@PathVariable String numCompte){
		return compteRepository.findOne(numCompte);
	}
	
	@RequestMapping(value="/chercherComptesDte",method=RequestMethod.GET)
	public Page<Compte> chercherCptDte(
			@RequestParam(name="mc",defaultValue="")Date mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return compteRepository.chercherDate(mc, new PageRequest(page, size));
	}
	
	@RequestMapping(value="/comptes",method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte c){
		return compteRepository.save(c);
	}
	
	@RequestMapping(value="/comptes/{numCompte}",method=RequestMethod.PUT)
	public Compte saveCompte(@PathVariable String numCompte,@RequestBody Compte c){
		c.setNumCompte(numCompte);
		return compteRepository.save(c);
	}
	
	
	

}
