package com.associationoto.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.associationoto.demo.onetoone.entities.Licence;
import com.associationoto.demo.onetoone.entities.Person;
import com.associationoto.demo.onetoone.repository.LicenceRepo;

@SpringBootTest
class AssociatioOneToOneApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	LicenceRepo repo;
	
	@Test
	public void testCreate() {
		
		Licence licence = new Licence();
		licence.setType("Two Wheeler");
		licence.setValid_from(new Date());
		licence.setValid_to(new Date());
		
		Person person = new Person();
		person.setF_name("Poonam");
		person.setL_name("Kale");
		person.setAge(25);
		licence.setPerson(person);
		
		repo.save(licence);
	}

}
