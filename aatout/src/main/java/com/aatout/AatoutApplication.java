package com.aatout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aatout.dao.UtilisateurRepository;
import com.aatout.model.Administrateur;
import com.aatout.model.Autorisateur;
import com.aatout.model.Bien;
import com.aatout.model.Membre;
import com.aatout.model.Partenaire;
import com.aatout.model.Produit;
import com.aatout.model.Utilisateur;

@SpringBootApplication
public class AatoutApplication implements CommandLineRunner {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	public static void main(String[] args) {
		SpringApplication.run(AatoutApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
			Bien ut =null;
			/*		 ut = new Produit("Infinix note4", "Portable", "Bossran.png",70000,60);
		utilisateurRepository.save(ut);
		
			utilisateurRepository.save(new Autorisateur("Ramich", "Rachid", df.parse("12/01/1998"), "ramichpro@gmail.com", 97543734, "hassan.png"));
				utilisateurRepository.save(new Utilisateur("Ibrahimi", "Khalid", df.parse("12/01/1990"), "Khalid@gmail.com", 97303777, "Khalid.png"));
		utilisateurRepository.save(new Utilisateur("Lairaichi", "Kawtar", df.parse("25/11/1980"), "Kawtar@gmail.com", 94803747, "Kawtar.png"));
		utilisateurRepository.findAll().forEach(c->{System.out.println(c);});  */
	}
}
