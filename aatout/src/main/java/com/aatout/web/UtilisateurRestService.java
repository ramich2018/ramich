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

import com.aatout.dao.UtilisateurRepository;
import com.aatout.model.Utilisateur;

@RestController
@CrossOrigin("*")
public class UtilisateurRestService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> getUtilisateurs(){
		return utilisateurRepository.findAll();
	}
	
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Utilisateur getUtilisateur(@PathVariable Long id){
		return utilisateurRepository.findOne(id);
	}
	
	@RequestMapping(value="/chercherUtilisateurs",method=RequestMethod.GET)
	public Page<Utilisateur> chercherUts(
			@RequestParam(name="mc",defaultValue="")String mc,
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return utilisateurRepository.chercher("%"+mc+"%", new PageRequest(page, size));
	}
	
	@RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur c){
		return utilisateurRepository.save(c);
	}
	
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.PUT)
	public Utilisateur saveUtilisateur(@PathVariable Long id,@RequestBody Utilisateur c){
		c.setId(id);
		return utilisateurRepository.save(c);
	}

}
