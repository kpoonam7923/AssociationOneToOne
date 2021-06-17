package com.associationoto.demo.onetoone.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.*;

@Entity
public class Licence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	// I only want to save date not time
	@Temporal(TemporalType.DATE)
	private Date valid_from;
	@Temporal(TemporalType.DATE)
	private Date valid_to;
	
	// ********************* ONE TO ONE *************************
	//cascading effects on the person. If we save our license we want the person to be saved.
	//If we update the license and if the person information has changed then it should be automatically updated.
	//And if we delete a license the person information should also be gone.
	@OneToOne(cascade = CascadeType.ALL)
	//Join the table
	@JoinColumn(name = "person_id")
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getValid_from() {
		return valid_from;
	}
	public void setValid_from(Date valid_from) {
		this.valid_from = valid_from;
	}
	public Date getValid_to() {
		return valid_to;
	}
	public void setValid_to(Date valid_to) {
		this.valid_to = valid_to;
	}
	
	
	

}
