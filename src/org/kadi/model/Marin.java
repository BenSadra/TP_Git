package org.kadi.model;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name="marin", namespace="http://www.kadi.org/tp-jaxb")
@XmlAccessorType(XmlAccessType.FIELD)

public class Marin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="id")
	private long id;
	
	private String nom;
	
	private String prenom;
	
	private int age;

	public Marin() {
	}
	   
	public Marin(String nom, String prenom, int age) {
		this.nom = nom ;
		this.prenom = prenom ;
		this.age = age ;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Marin [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + "]";
	}
	
}
