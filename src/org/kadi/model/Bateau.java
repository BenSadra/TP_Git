package org.kadi.model;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bateau")
@XmlAccessorType(XmlAccessType.FIELD)

  

public class Bateau implements Serializable {

		 

		 /**
	 * 
	 */
	private static final long serialVersionUID = -7473787322913073961L;


	   
	    @XmlAttribute
	     private long id;

		 
	    @XmlElement(name="nom")
		private String nom;
		 

	    @XmlElementWrapper(name="equipage")
	     @XmlElements(
	        @XmlElement(name="marin",     type=Marin.class))
	     private List<Marin> equipage=new ArrayList<Marin>();

		
		 

		 public Bateau() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Bateau(String nom) {
			super();
			this.nom = nom;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		 public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}
		public List<Marin> getEquipage() {
			return equipage;
		}

		public void setEquipage(List<Marin> equipage) {
			this.equipage = equipage;
		}
	
		public void addMarin(Marin m)
		{
			
			equipage.add(m);
		}

		@Override
		public String toString() {
			return "Bateau [nom=" + nom + "]";
		}
		
}
